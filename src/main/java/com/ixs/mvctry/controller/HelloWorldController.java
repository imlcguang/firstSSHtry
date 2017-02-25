package com.ixs.mvctry.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.ixs.mvctry.model.T_Model;
import com.ixs.mvctry.service.IModelService;
import com.ixs.mvctry.service.impl.ModelServiceImpl;  
   
@Controller  
@RequestMapping("/") 
public class HelloWorldController 
{
	@Resource
	private IModelService modelServiceImpl;
	
	@RequestMapping(value="/savemodel",method = RequestMethod.POST)  
    public String sayHello(T_Model t_Model,ModelMap model) {  
		
		modelServiceImpl.addModel(t_Model);
        model.addAttribute("greeting", "Hello World from lcxpg");  
        return "welcome";  
    }  
   
    @RequestMapping(value="/helloagain", method = RequestMethod.GET)  
    public String sayHelloAgain() {  
        return "savemodel";  
    }  
   
}  