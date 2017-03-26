package com.ixs.mvctry.service;

import java.util.List;

import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.Reader;

public interface IReaderServiceold {
	/**
	 * 查找所有的readerID
	 * 
	 * @return readerID的list
	 */
	public List<Reader> findAllReader();

	/**
	 * 计算用户相似度并获得推荐图书
	 */
	public List<DoubanBook> getAlikeBook();
}
