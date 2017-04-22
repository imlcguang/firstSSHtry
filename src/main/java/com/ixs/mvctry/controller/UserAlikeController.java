package com.ixs.mvctry.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ixs.mvctry.model.Reader;
import com.ixs.mvctry.service.ICollectionService;
import com.ixs.mvctry.service.IReaderServiceold;
import com.ixs.mvctry.service.impl.CollectionServiceImpl;
import com.ixs.mvctry.service.impl.ReaderServiceImplold;

//@SessionAttributes(value = "")
@Controller
@RequestMapping(value = "/user")
public class UserAlikeController {
	@Autowired
	public ICollectionService collectionService;
	@Autowired
	public IReaderServiceold ReaderService;

	@RequestMapping(value = "/usertest", method = RequestMethod.GET)
	public String getAlike(ModelMap model) {
		Map<String, Set<String>> uBookMap = new HashMap<String, Set<String>>();
		List<Reader> readers = new ArrayList<Reader>();
		// 考虑book是否要设置外键
		readers = ReaderService.findAllReader();
		double[][] alkMatrix = new double[readers.size()][readers.size()];
		uBookMap = collectionService.findUBook();
		model.addAttribute("greeting", uBookMap.toString() + uBookMap.size());
		System.out.println(uBookMap.toString());
		System.out.println("mapsize:"+uBookMap.size()+"readersize"+readers.size());
		// 两两用户进行相似度计算
		for (int i = 0; i < readers.size() - 1; i++) {
			for (int j = i + 1; j < readers.size(); j++) {
				// 获取readerid
				String readerid1 = readers.get(i).getReaderID();
				String readerid2 = readers.get(j).getReaderID();
				// 获取该用户读过的书的集合
				Set<String> set1 = uBookMap.get(readerid1);
				System.out.println("set1:"+set1);
				Set<String> set2 = uBookMap.get(readerid2);
				System.out.println("set2:"+set2);
				// 求交集：移除set2部分（交集），再加上set2
				Set<String> intersection = new HashSet<String>();
				intersection.addAll(set1);
				intersection.retainAll(set2);
				System.out.println("交集"+intersection);
				// 两用户交集不为0
				if (intersection.size() != 0) {
					// 求并集
					Set<String> union = new HashSet<String>();
					union.addAll(set1);
					union.addAll(set2);
					System.out.println("并集"+union);
					// 矩阵值
					alkMatrix[i][j] = alkMatrix[j][i] = (double)intersection.size() / union.size();
					System.out.println("alike"+ readerid1 + "和" + readerid2 + "的相似度是：" + alkMatrix[i][j]);
					model.addAttribute("alike", readerid1 + "和" + readerid2 + "的相似度是：" + alkMatrix[i][j]);
				} else {
					alkMatrix[i][j] = alkMatrix[j][i] = 0;
				}
			}
		}

		return "welcome";
	}

}
