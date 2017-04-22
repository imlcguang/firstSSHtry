package com.ixs.mvctry.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.IDouBanBookDao;
import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.T_Model;
@Repository
public class DouBanBookDaoImpl implements IDouBanBookDao {

	@Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }
	
	@Override
	public List<DoubanBook> findDouBanBook(List<String> bookids) {
		Session session = this.getSession();
		List<DoubanBook> dbooks=new ArrayList<DoubanBook>();
		String hql = "FROM doubanbook WHERE bookid = :id ";
		for (String id : bookids) {
			List<DoubanBook> result = session.createQuery(hql).setParameter("id", bookids).list();
			DoubanBook doubanBook=result.get(0);
			dbooks.add(doubanBook);
		}
		session.close();
		return dbooks;
	}

	public List<DoubanBook> findDouBanBookset(Set<String> bookids) {
		Session session = this.getSession();
		List<DoubanBook> dbooks=new ArrayList<DoubanBook>();
		String hql = "FROM doubanbook WHERE bookid = :id ";
		for (String id : bookids) {
			List<DoubanBook> result = session.createQuery(hql).setParameter("id", bookids).list();
			DoubanBook doubanBook=result.get(0);
			dbooks.add(doubanBook);
		}
		session.close();
		return dbooks;
	}
	
	
}
