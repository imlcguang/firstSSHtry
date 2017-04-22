package com.ixs.mvctry.dao;

public interface IRoutineDao {
	/**
	 * 查出新用户默认喜欢图书
	 */
	public String getNewlike();

	/**
	 * 查出新用户默认不喜欢图书
	 */
	public String getNewUnlike();
}
