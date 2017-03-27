package com.ixs.mvctry.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.IRBRcommDao;
import com.ixs.mvctry.dao.IReaderAlikeDao;
import com.ixs.mvctry.dao.IReaderDao;
import com.ixs.mvctry.model.Collectbook;
import com.ixs.mvctry.model.Reader;

@Repository
public class RBRecommDaoImpl implements IRBRcommDao {
/*
	@Resource
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public void addRBRecomm(List<RbRecomm> rbRecomms) {
		Session session = this.getSession();
		for (int i = 0; i < rbRecomms.size(); i++) {
			session.save(rbRecomms.get(i));
		}
		session.close();
		
	}

	@Override
	public List<RbRecomm> findTopBook(Reader reader) {
		Session session = this.getSession();
		String hql = "from rbrecomm as e where e.readerid=" + reader + " order by e.recomm desc";
		Query query = session.createQuery(hql);
		query.setFirstResult(0);   
		query.setMaxResults(10); 
		session.close();
		List<RbRecomm> result=query.list();
		return result;
	}
*/

}
