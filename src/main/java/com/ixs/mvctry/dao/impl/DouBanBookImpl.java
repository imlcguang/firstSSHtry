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
public class DouBanBookImpl implements IDouBanBookDao {

	@Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }
	
	@Override
	public List<DoubanBook> findDouBanBook(Set<String> bookids) {
		Session session = this.getSession();
		List<DoubanBook> result=new ArrayList<DoubanBook>();
		for (String id : bookids) {
		DoubanBook doubanBook=	(DoubanBook) session.get(DoubanBook.class, id);
		result.add(doubanBook);
		}
		session.close();
		return result;
	}

}
