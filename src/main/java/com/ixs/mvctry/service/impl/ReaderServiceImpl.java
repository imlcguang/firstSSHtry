package com.ixs.mvctry.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

import com.ixs.mvctry.dao.impl.CollectionDaoImpl;
import com.ixs.mvctry.dao.impl.ReaderDaoImpl;
import com.ixs.mvctry.model.Book;
import com.ixs.mvctry.model.Collectbook;
import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.Reader;
import com.ixs.mvctry.model.ReaderAlike;
import com.ixs.mvctry.service.IReaderService;

public class ReaderServiceImpl implements IReaderService {

	@Autowired
	private ReaderDaoImpl readerDao;
	@Autowired
	private CollectionDaoImpl collectionDao;

	/**
	 * 建立用户-书籍map
	 * 
	 * @return key:readid ;value:bookidset 的map
	 */
	public Map<String, Set<String>> findUBook() {
		String userid;
		String bookid;
		Map<String, Set<String>> ubookmap = new HashMap<String, Set<String>>();
		Set<String> booksset;
		List<Collectbook> collectbooklist = collectionDao.findAllCollection();
		for (Collectbook collectbook : collectbooklist) {
			userid = collectbook.getReaderID();
			bookid = collectbook.getBookID();
			// 如果存在key为userID的map，更新
			if (ubookmap.containsKey(userid)) {
				booksset = ubookmap.get(userid);
				booksset.add(bookid);
				ubookmap.put(userid, booksset);
			}
			// 不存在则在map中添加，存储
			else {
				booksset = new HashSet<String>();
				booksset.add(bookid);
				ubookmap.put(userid, booksset);
			}
			booksset = null;

		}
		return ubookmap;
	}

	/**
	 * 对map中的value进行排序
	 * 
	 * @param map
	 * @return
	 */
	public static ArrayList<Map.Entry<String, Double>> sortMap(Map map) {
		List<Map.Entry<String, Double>> entries = new ArrayList<Map.Entry<String, Double>>(map.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<String, Double>>() {
			public int compare(Map.Entry<String, Double> obj1, Map.Entry<String, Double> obj2) {
				return (int) (obj2.getValue() - obj1.getValue());
			}
		});
		return (ArrayList<Entry<String, Double>>) entries;
	}

	/**
	 * 相似度计算取top10
	 * 
	 * @return 用户id，相似度
	 */
	public Map<String, Double> getalike(Map<String, Set<String>> map, Reader reader) {
		Map<String, Set<String>> uBookMap = new HashMap<String, Set<String>>();
		Map<String, Double> uAlikeMap = new TreeMap<String, Double>();
		Map<String, Double> uAlikeTopMap = new HashMap<String, Double>();
		List<Reader> readers = new ArrayList<Reader>();
		// 考虑book是否要设置外键
		readers = readerDao.findAllReader();
		uBookMap = map;
		System.out.println("用户-图书的map:" + uBookMap.toString());
		System.out.println("mapsize:" + uBookMap.size() + "readersize" + readers.size());
		// 两两用户进行相似度计算,存入map
		for (int i = 0; i < readers.size(); i++) {
			// 获取readerid
			String readerid1 = readers.get(i).getReaderID();
			if (readerid1 == reader.getReaderID()) {
				System.out.println("reader的编号是第" + i + "个");
				continue;
			}
			// 获取该用户读过的书的集合
			Set<String> set = uBookMap.get(reader.getReaderID());
			System.out.println("set:" + set);
			Set<String> set2 = uBookMap.get(readerid1);
			System.out.println("用户2读过的书set2:" + set2);
			// 求交集：移除set2部分（交集），再加上set2
			Set<String> intersection = new HashSet<String>();
			intersection.addAll(set);
			intersection.retainAll(set2);
			System.out.println("交集" + intersection);
			// 两用户交集不为0
			if (intersection.size() != 0) {
				// 求并集
				Set<String> union = new HashSet<String>();
				union.addAll(set);
				union.addAll(set2);
				System.out.println("并集" + union);
				// 矩阵值
				double alike = (double) intersection.size() / union.size();
				uAlikeMap.put(readerid1, alike);
				System.out.println("alike" + reader.getReaderID() + "和" + readerid1 + "的相似度是：" + alike);
			} else {
				uAlikeMap.put(readerid1, 0.0);
			}
		}
		// 对map的value值进行排序并取前10个存入uAlikeTopMap中
		ArrayList<Map.Entry<String, Double>> entries = sortMap(uAlikeMap);
		// 记得改！！！！！！！！！！！！！
		for (int i = 0; i < 3; i++) {
			System.out.print("相似度第" + i + "名：" + entries.get(i).getKey() + "，相似度为：" + entries.get(i).getValue());
			uAlikeTopMap.put(entries.get(i).getKey(), entries.get(i).getValue());
		}
		return uAlikeMap;
	}

	/**
	 * 计算推荐指数
	 * 
	 * @param uAlikeTopMap（用户ID，相似度） ubookmap（用户ID，用户读过的书s）
	 * @return
	 */
	public Set<String> getRecomm(Reader reader, Map<String, Double> uAlikeTopMap, Map<String, Set<String>> ubookmap) {
		// uBookRecommMap（图书ID，推荐指数）
		Map<String, Double> uBookRecommMap = new TreeMap<String, Double>();
		Set<String> BookRecommTop=new HashSet<String>();
		double result = 0.0;
		for (String reader2 : uAlikeTopMap.keySet()) {
			// 遍历reader2读过扣去reader读过的书
			Set<String> intersection = new HashSet<String>();
			intersection.addAll(ubookmap.get(reader2));
			intersection.removeAll(ubookmap.get(reader.getReaderID()));
			//计算推荐指数
			for (String bookid : intersection) {
				if (uBookRecommMap.containsKey(bookid)) {
					// 获取推荐指数,加上reader的相似度
					result = uBookRecommMap.get(bookid);
					result += uAlikeTopMap.get(reader2);
					uBookRecommMap.put(bookid, result);
				} else {
					uBookRecommMap.put(bookid, uAlikeTopMap.get(reader2));
				}
			}
		}
		// 对uBookRecommMap（图书ID，推荐指数）进行排序，选出top
		
				ArrayList<Map.Entry<String, Double>> entries = sortMap(uBookRecommMap);
				// 记得改！！！！！！！！！！！！！
				for (int i = 0; i < 3; i++) {
					System.out.print("推荐指数第" + i + "名：" + entries.get(i).getKey() + "，推荐指数为：" + entries.get(i).getValue());
					BookRecommTop.add(entries.get(i).getKey());
				}
		return BookRecommTop;
	}

	@Override
	public List<DoubanBook> getRecommBook(Reader reader) {
		Map<String, Set<String>> ubookmap = new HashMap<String, Set<String>>();
		List<Reader> readers = new ArrayList<Reader>();
		Set<String> recommBooks = new HashSet<String>();
		Map<String, Double> uAlikeTopMap = new HashMap<String, Double>();

		// 取出数据,存入map
		ubookmap = findUBook();
		// 计算相似度top10的用户(返回map（用户，相似度）)
		readers = readerDao.findAllReader();
		uAlikeTopMap = getalike(ubookmap, reader);

		// 计算推荐指数(返回bookID的set)
		recommBooks = getRecomm(reader, uAlikeTopMap, ubookmap);

		// 找到对应的豆瓣图书
		// getDoubanBooks(recommBooks);
		return null;
	}

}
