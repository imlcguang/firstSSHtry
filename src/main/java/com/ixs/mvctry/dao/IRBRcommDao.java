package com.ixs.mvctry.dao;

import java.util.List;

import com.ixs.mvctry.model.RbRecomm;
import com.ixs.mvctry.model.Reader;

public interface IRBRcommDao {
	/**
	 * 添加到rbrecomm数据库表中（用户，book，推荐指数）
	 * 
	 * @param id
	 */
	public void addRBRecomm(List<RbRecomm> rbRecomms);
	
	/**
	 * 取出用户reader1推荐指数前十的用户信息
	 */
	public List<RbRecomm> findTopBook(Reader reader);
	
}
