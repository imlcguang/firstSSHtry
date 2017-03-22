package com.ixs.mvctry.service;

import java.util.List;

import com.ixs.mvctry.model.Reader;

public interface IReaderService {
	/**
	 * 查找所有的readerID
	 * @return readerID的list
	 */
	public List<Reader> findAllReader();
}
