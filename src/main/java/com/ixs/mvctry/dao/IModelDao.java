package com.ixs.mvctry.dao;

import java.util.List;

import com.ixs.mvctry.model.T_Model;


public interface IModelDao {


	/**
	 * 添加样机
	 * @param c
	 */
	public void AddModel(T_Model c);
	
	/**
	 * 修改样机信息
	 * 
	 * @param id
	 */
	public void updateModels(T_Model c);
	
	/**
	 * 删除 根据ID删除
	 */
	public void deleteModels(T_Model c);
	
	/**
	 * 根据ID查找样机
	 * 
	 * @param modelID
	 *            
	 * @return 根据样机名找到样机信息，如果没找到返回null
	 */
	public T_Model findByModelID(Integer ModelID);
	
	/**
	 * 根据样机名查找样机是否存在
	 * 
	 * @param modelName
	 *            样机名
	 * @return 根据样机名找到样机信息，如果没找到返回null
	 */
	public T_Model findModelName(String modelName);
	/**
	 * 模糊查询样机名称模糊查询
	 * 
	 * @param sname
	 * @return
	 * @throws Exception
	 */
	public  List<T_Model> findByModelName(String modelName) throws Exception;
	
}
