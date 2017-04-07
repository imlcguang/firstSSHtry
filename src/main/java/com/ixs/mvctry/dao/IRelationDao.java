package com.ixs.mvctry.dao;

import java.util.List;
import com.ixs.mvctry.model.Relation;


public interface IRelationDao {
	/**
	 * 查询所有的relationship
	 * @return
	 */
	public List<Relation> findAllRelation();
}
