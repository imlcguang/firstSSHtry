package com.ixs.mvctry.dao;

import java.util.List;

import com.ixs.mvctry.model.Distance;

public interface IDistanceDAO {

	/**
	 * 查询两个用户的距离
	 * @param formid
	 * @param toid
	 * @return
	 */
	public int findDistance(String formid,String toid);
	
	/**
	 * 存入两用户的距离到数据库
	 * @param list
	 */
	public void addDistance(List<Distance> list);
	
}
