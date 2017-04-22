package com.ixs.mvctry.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ixs.mvctry.dao.ICollectionDao;
import com.ixs.mvctry.dao.impl.CollectionDaoImpl;
import com.ixs.mvctry.model.Collectbook;
import com.ixs.mvctry.service.ICollectionService;

@Service
public class CollectionServiceImpl implements ICollectionService {

	@Autowired
	private ICollectionDao userDao;

	@Override
	public Map<String, Set<String>> findBUser() {
		String userid;
		String bookid;
		Set<String> usersset;
		Map<String, Set<String>> busermap=new HashMap<String, Set<String>>();
		List<Collectbook> collectbooklist = userDao.findAllCollection();
		for (Collectbook collectbook : collectbooklist) {
			userid=collectbook.getReaderID();
			bookid=collectbook.getBookID();
			//如果存在key为bookID的map，更新
			if(busermap.containsKey(bookid)){
				usersset=busermap.get(bookid);
				usersset.add(userid);
				busermap.put(bookid, usersset);
			}
			//不存在则在map中添加，存储
			else{
				usersset=new HashSet<String>();
				usersset.add(userid);
				busermap.put(bookid, usersset);
			}
			usersset=null;
			
		}
		return busermap;
	}

	@Override
	public Map<String, Set<String>> findUBook() {
		String userid;
		String bookid;
		Map<String, Set<String>> ubookmap=new HashMap<String, Set<String>>();
		Set<String> booksset;
		List<Collectbook> collectbooklist = userDao.findAllCollection();
		for (Collectbook collectbook : collectbooklist) {
			userid=collectbook.getReaderID();
			bookid=collectbook.getBookID();
			//如果存在key为userID的map，更新
			if(ubookmap.containsKey(userid)){
				booksset=ubookmap.get(userid);
				booksset.add(bookid);
				ubookmap.put(userid, booksset);
			}
			//不存在则在map中添加，存储
			else{
				booksset=new HashSet<String>();
				booksset.add(bookid);
				ubookmap.put(userid, booksset);
			}
			booksset=null;
			
		}
		return ubookmap;
	}

}
