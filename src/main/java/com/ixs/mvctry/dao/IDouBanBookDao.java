package com.ixs.mvctry.dao;

import java.util.List;
import java.util.Set;

import com.ixs.mvctry.model.DoubanBook;

public interface IDouBanBookDao {
	
	/**
	 * 查询bookIDs对应的豆瓣图书信息
	 * 
	 * @param id
	 */
	public List<DoubanBook> findDouBanBook(List<String> bookids);
	
}
