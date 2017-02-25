package com.ixs.mvctry.service;

import java.util.List;

import com.ixs.mvctry.model.T_Model;

public interface IModelService {
	
	/**
	 * @param t_Model
	 * 注册
	 */
	public void addModel(T_Model t_Model);
	
	/**
	 * @param id
	 * @return
	 * 用id查询
	 */
	public  T_Model findModelById(Integer id);
	
	
	/**
	 * @param model
	 * 更新
	 */
	public void updateModels( T_Model model);
	
	/**
	 * @param model
	 * 删除
	 */
	public void DeleteModels( T_Model model);
	
	/**
	 * @param modelName
	 * @return
	 * @throws Exception
	 * 模糊查询
	 */
	public List< T_Model> findByModelName( String modelName) throws Exception;

}
