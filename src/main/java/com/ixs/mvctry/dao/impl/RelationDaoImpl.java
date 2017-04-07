package com.ixs.mvctry.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.IRelationDao;
import com.ixs.mvctry.model.Relation;
@Repository
public class RelationDaoImpl implements IRelationDao {

	@Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }
	
	@Override
	public List<Relation> findAllRelation() {
		Session session = this.getSession();
		String hql = "from Relation ";
		List<Relation> result = session.createQuery(hql).list();
		session.close();
		return result;
	}

}
