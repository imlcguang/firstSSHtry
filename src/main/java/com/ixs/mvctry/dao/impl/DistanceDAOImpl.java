package com.ixs.mvctry.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.IDistanceDAO;
import com.ixs.mvctry.model.Distance;
@Repository
public class DistanceDAOImpl implements IDistanceDAO {

	@Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }
	
	
	@Override
	public int findDistance(String formid, String toid) {
		Session session = this.getSession();
		String hql = "from Distance where formid=? and toid=? ";
		List<Distance> resultlist =session.createQuery(hql).setString(1, formid).setString(2, toid).list();
		int result=resultlist.get(0).getDis();
		session.close();
		return result;
	}

	@Override
	public void addDistance(List<Distance> list) {
		Logger logger = Logger.getLogger(DistanceDAOImpl.class);  
		Session session = this.getSession();
		for(int i=0;i<list.size();i++){
			session.save(list.get(i));
			logger.info("save fromid"+list.get(i).getFromid()+"toid:"+list.get(i).getToid()+"distance:"+list.get(i).getDis());
		}
		session.close();

	}

}
