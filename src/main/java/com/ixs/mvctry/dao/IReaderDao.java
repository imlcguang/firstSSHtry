package com.ixs.mvctry.dao;

import java.util.List;

import com.ixs.mvctry.model.Reader;

public interface IReaderDao {
	/**
	 * 查询所有用户id
	 * 
	 * @param id
	 */
	public List<Reader> findAllReader();
}
