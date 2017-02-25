package com.ixs.mvctry.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ixs.mvctry.dao.impl.ModelDaoImpl;
import com.ixs.mvctry.model.T_Model;
import com.ixs.mvctry.service.IModelService;

@Service
public class ModelServiceImpl implements IModelService{
	
	@Autowired
	private  ModelDaoImpl modelDao;
	
	public void addModel( T_Model model)  {
		// 如果不存在，调用dao方法添加样机
		modelDao.AddModel(model);
	}

	public  T_Model findModelById(Integer id) {
		return modelDao.findByModelID(id);
	}

	public void updateModels( T_Model model) {
		modelDao.updateModels(model);
	}

	public void DeleteModels( T_Model model) {
		modelDao.deleteModels(model);
	}

	public List< T_Model> findByModelName( String modelName) throws Exception {
		return modelDao.findByModelName(modelName);

	}

}

