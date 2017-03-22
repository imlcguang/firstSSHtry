package com.ixs.mvctry.dao.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.ICollectionDao;
import com.ixs.mvctry.model.Collectbook;
import com.ixs.mvctry.model.T_Model;
@Repository
public class CollectionDaoImpl implements ICollectionDao {

	@Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }
	
	@Override
	public List<Collectbook> findAllCollection() {
		Session session = this.getSession();
		String hql = "from Collectbook ";
		List<Collectbook> result = session.createQuery(hql).list();
		session.close();
		return result;
	}

}
