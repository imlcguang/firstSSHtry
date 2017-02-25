package com.ixs.mvctry.dao.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.ixs.mvctry.dao.IModelDao;
import com.ixs.mvctry.hibernate.SessionFactoryUtil;
import com.ixs.mvctry.model.T_Model;
import com.ixs.mvctry.service.IModelService;
@Repository
public class ModelDaoImpl implements IModelDao{
	
	@Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }
	
	public void AddModel(T_Model c) {
		Session session = this.getSession();
		session.save(c);
		System.out.println("新增成功！您的ID为：" + c.getModelID());
		session.close();
	}

	
	public void updateModels(T_Model c) {
		Session session = this.getSession();
		session.update(c);
		session.close();
	}


	public void deleteModels(T_Model c) {
		Session session = this.getSession();
		session.delete(c);
		session.close();
	}

	
	public T_Model findByModelID(Integer ModelID) {
		Session session = this.getSession();
		T_Model model = (T_Model) session.get(T_Model.class, ModelID);
		session.close();
		return model;
	}

	
	public T_Model findModelName(String modelName) {
		Session session = this.getSession();
		String hql = "FROM T_Model WHERE modelName = :mdn ";
		List<T_Model> result = session.createQuery(hql).setParameter("mdn", modelName).list();

		T_Model model = null; // (User)list;
		for (T_Model model2 : result)
			model = model2;
		session.close();
		return model;
	}

	
	public  List<T_Model> findByModelName(String modelName) throws Exception {
		Session session = this.getSession();
		String hql = "FROM T_Model WHERE modelName like :mdn ";
		List<T_Model> result = session.createQuery(hql).setParameter("mdn", "%" + modelName + "%").list();
		session.close();
		return result;
	}

	
}