package com.ixs.mvctry.dao;

import com.ixs.mvctry.model.Recommbookbyuser;

public interface IRecommbookbyuserDao {
	
	/**
	 * 查询用户i 可能喜欢的书，不喜欢的书
	 * 
	 * @param id
	 */
	public Recommbookbyuser findRecommByUserid(String userid);
	
}
