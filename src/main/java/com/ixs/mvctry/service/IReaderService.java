package com.ixs.mvctry.service;

import java.util.List;

import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.Reader;

public interface IReaderService {

	
	/**
	 * 基于用户相似度计算推荐图书
	 * @return 推荐图书
	 */
	public List<DoubanBook> getRecommBook(Reader reader);
	
}
