package com.ixs.mvctry.service;

import java.util.List;

import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.Recommbookbyuser;

public interface IRecommByUserService {

	/**
	 * 查出猜你喜欢的图书
	 */
	public List<DoubanBook> findlikeRecomm(String books);

	/**
	 * 查出猜你不喜欢的图书
	 */
	public List<DoubanBook> findunlikeRecomm(String books);
	
	/**
	 * 取出新用户的喜欢图书
	 */
	public List<DoubanBook> findNewLike();
	/**
	 * 取出新用户的不喜欢图书
	 */
	public List<DoubanBook> findNewUnLike();
}
