package com.ixs.mvctry.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ixs.mvctry.dao.impl.DouBanBookDaoImpl;
import com.ixs.mvctry.dao.impl.RecommbookbyuserDaoImpl;
import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.Recommbookbyuser;
import com.ixs.mvctry.service.IRecommByUserService;
import com.ixs.mvctry.util.split.SplitToList;
@Service
public class RecommByUserServiceImpl implements IRecommByUserService {

	@Autowired
	private RecommbookbyuserDaoImpl recommUDao;
	@Autowired
	private DouBanBookDaoImpl doubanbookDao;
	
	@Override
	public List<DoubanBook> findlikeRecomm(String userid) {
		Recommbookbyuser recomm=new Recommbookbyuser();
		recomm=recommUDao.findRecommByUserid(userid);
		List<DoubanBook> likes=new ArrayList<DoubanBook>();
		List<String> stringlist=new ArrayList<String>();
		stringlist=SplitToList.splitTolist(recomm.getLikebook());
		likes=doubanbookDao.findDouBanBook(stringlist);
		return likes;
	}


	@Override
	public List<DoubanBook> findunlikeRecomm(String userid) {
		Recommbookbyuser recomm=new Recommbookbyuser();
		recomm=recommUDao.findRecommByUserid(userid);
		List<DoubanBook> unlikes=new ArrayList<DoubanBook>();
		List<String> stringlist=new ArrayList<String>();
		stringlist=SplitToList.splitTolist(recomm.getUnlikebook());
		unlikes=doubanbookDao.findDouBanBook(stringlist);
		return unlikes;
	}

}
