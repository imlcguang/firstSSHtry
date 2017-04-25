package com.ixs.mvctry.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.T_Model;
import com.ixs.mvctry.service.IModelService;
import com.ixs.mvctry.service.IRecommByUserService;
import com.ixs.mvctry.service.impl.ModelServiceImpl;
import com.ixs.mvctry.service.impl.RecommByUserServiceImpl;  
   
@Controller  
@RequestMapping("/hello") 
public class HelloWorldController 
{
	@Resource
	private IModelService modelServiceImpl;
	@Resource
	public IRecommByUserService recommByUserServiceImpl;
	
	@RequestMapping(value="/savemodel")  
    public String sayHello(T_Model t_Model,ModelMap model) {  
		
//		modelServiceImpl.addModel(t_Model);
        model.addAttribute("greeting", "Hello World from lcxpg");  
        return "savemodel";  
    }  
   
    @RequestMapping(value="/helloagain")  
    public String sayHelloAgain() {  
        return "savemodel";  
    }  
   
    @RequestMapping(value = "/todaytest12")
	public String sayToday(ModelMap model) {
		List<DoubanBook> likes=new ArrayList<DoubanBook>();
		List<DoubanBook> unlikes=new ArrayList<DoubanBook>();
		likes=recommByUserServiceImpl.findNewLike();
		unlikes=recommByUserServiceImpl.findNewUnLike();
		System.out.println("controll"+unlikes.toString());
		model.addAttribute("likes",likes );
		model.addAttribute("unlikes",unlikes );
		model.addAttribute("greeting", "Hello World from lcxpg");  

		 return "welcome";  
    }
    
    
}  