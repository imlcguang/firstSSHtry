package com.ixs.mvctry.dao;

import java.util.List;
import java.util.Set;

import com.ixs.mvctry.model.Collectbook;

public interface ICollectionDao {
	
	/**
	 * 查询用户、读过的书、评分
	 * 
	 * @param id
	 */
	public List<Collectbook> findAllCollection();
}
