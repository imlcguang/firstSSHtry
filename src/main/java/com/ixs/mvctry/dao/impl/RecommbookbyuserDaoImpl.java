package com.ixs.mvctry.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.IRecommbookbyuserDao;
import com.ixs.mvctry.model.Recommbookbyuser;
@Repository
public class RecommbookbyuserDaoImpl implements IRecommbookbyuserDao {

	@Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }
	
	@Override
	public Recommbookbyuser findRecommByUserid(String userid) {
		Session session = this.getSession();
		String hql = "from Recommbookbyuser where userid= :uid ";
		List<Recommbookbyuser> result = session.createQuery(hql).setParameter("uid", userid).list();
		Recommbookbyuser recommbookbyuser=new Recommbookbyuser();
		for (Recommbookbyuser recommbookbyuser2 : result)
			recommbookbyuser = recommbookbyuser2;
		session.close();
		return recommbookbyuser;
	}

}
