package com.ixs.mvctry.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.IRoutineDao;
import com.ixs.mvctry.model.T_Model;
@Repository
public class RoutineDaoImpl implements IRoutineDao {

	@Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }
	
	
	@Override
	public String getNewlike() {
		Session session = this.getSession();
		String hql = "select likebook FROM Routine WHERE id=2 ";
		List<String> result = session.createQuery(hql).list();

		String like = null;
		for (String string : result)
			like = string;
		session.close();
		return like;
	}

	@Override
	public String getNewUnlike() {
		Session session = this.getSession();
		String hql = "select unlikebook FROM Routine WHERE id=2 ";
		List<String> result = session.createQuery(hql).list();

		String unlike = null;
		for (String string : result)
			unlike = string;
		session.close();
		return unlike;
	}
	
	
}
