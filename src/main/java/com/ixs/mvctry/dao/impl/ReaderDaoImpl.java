package com.ixs.mvctry.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.IReaderDao;
import com.ixs.mvctry.model.Collectbook;
import com.ixs.mvctry.model.Reader;
@Repository
public class ReaderDaoImpl implements IReaderDao {

	@Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }
    
	@Override
	public List<Reader> findAllReader() {
		Session session = this.getSession();
		String hql = "from Reader ";
		List<Reader> result = session.createQuery(hql).list();
		session.close();
		return result;
	}

}
