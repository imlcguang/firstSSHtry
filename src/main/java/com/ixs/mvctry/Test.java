package com.ixs.mvctry;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ixs.mvctry.dao.IRoutineDao;
import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.service.IRecommByUserService;

public class Test extends BaseJunit4Test {
	@Autowired
	public static IRecommByUserService service;
	
	
	@org.junit.Test
	public void test1(){
		List<DoubanBook> list=new ArrayList<DoubanBook>();
		list=service.findNewLike();
		System.out.println(list.toString());
	}
}
