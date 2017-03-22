package com.ixs.mvctry.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ixs.mvctry.dao.impl.ReaderDaoImpl;
import com.ixs.mvctry.model.Reader;
import com.ixs.mvctry.service.IReaderService;
@Service
public class ReaderServiceImpl implements IReaderService {

	@Autowired
	private ReaderDaoImpl readerDao;
	
	
	@Override
	public List<Reader> findAllReader() {
		
		return readerDao.findAllReader();
	}

}
