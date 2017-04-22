package com.ixs.mvctry.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.Reader;
import com.ixs.mvctry.service.IRecommByUserService;
import com.ixs.mvctry.service.impl.CollectionServiceImpl;
import com.ixs.mvctry.service.impl.ReaderServiceImpl;
import com.ixs.mvctry.service.impl.ReaderServiceImplold;
import com.ixs.mvctry.service.impl.RecommByUserServiceImpl;

@Controller
@RequestMapping(value = "/test")
public class RecommControllerTest {
	@Resource
	public IRecommByUserService recommByUserService;

	@RequestMapping(value = "/usertest", method = RequestMethod.GET)
	public String getAlike(ModelMap model) {
//		List<DoubanBook> likes=new ArrayList<DoubanBook>();
//		List<DoubanBook> unlikes=new ArrayList<DoubanBook>();
//		likes=recommByUserService.findNewLike();
//		unlikes=recommByUserService.findNewUnLike();
//		model.addAttribute("likes",likes );
//		model.addAttribute("unlikes",unlikes );
//
//		return "welcome";
		return "savemodel"; 
	}
	 @RequestMapping(value="/helloagain2", method = RequestMethod.GET)  
	    public String sayHelloAgain() {  
	        return "savemodel";  
	    }  
}
