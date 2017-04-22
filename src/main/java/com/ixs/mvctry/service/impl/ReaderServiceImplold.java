package com.ixs.mvctry.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ixs.mvctry.dao.IReaderDao;
import com.ixs.mvctry.dao.impl.ReaderDaoImpl;
import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.Reader;
import com.ixs.mvctry.service.IReaderServiceold;
@Service
public class ReaderServiceImplold implements IReaderServiceold {

	@Autowired
	private IReaderDao readerDao;
	
	
	@Override
	public List<Reader> findAllReader() {
		
		return readerDao.findAllReader();
	}


	@Override
	public List<DoubanBook> getAlikeBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
