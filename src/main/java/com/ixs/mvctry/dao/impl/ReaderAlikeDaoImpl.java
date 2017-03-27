package com.ixs.mvctry.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.IReaderAlikeDao;
import com.ixs.mvctry.dao.IReaderDao;
import com.ixs.mvctry.model.Collectbook;
import com.ixs.mvctry.model.Reader;

@Repository
public class ReaderAlikeDaoImpl implements IReaderAlikeDao {

	/*@Resource
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public void addReaderAlike(List<ReaderAlike> readerAlikes) {
		Session session = this.getSession();
		for (int i = 0; i < readerAlikes.size(); i++) {
			session.save(readerAlikes.get(i));
		}
		session.close();
	}

	@Override
	public List<ReaderAlike> findTop(Reader reader) {
		Session session = this.getSession();
		String hql = "from readeralike as e where e.reader1id=" + reader + " order by e.alike desc";
		Query query = session.createQuery(hql);
		query.setFirstResult(0);   
		query.setMaxResults(10); 
		session.close();
		List<ReaderAlike> result=query.list();
		return result;
	}*/
		

}
