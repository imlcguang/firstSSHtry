package com.ixs.mvctry.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ixs.mvctry.model.DoubanBook;
import com.ixs.mvctry.model.Reader;
import com.ixs.mvctry.service.impl.CollectionServiceImpl;
import com.ixs.mvctry.service.impl.ReaderServiceImpl;
import com.ixs.mvctry.service.impl.ReaderServiceImplold;

//@SessionAttributes(value = "")
@Controller
@RequestMapping(value = "/recomm")
public class UserRecommController {
	@Autowired
	public ReaderServiceImpl readerService;

	@RequestMapping(value = "/usertest", method = RequestMethod.GET)
	public String getAlike(ModelMap model) {
		Reader reader =new Reader();
		List<DoubanBook> doubanBooks=new ArrayList<DoubanBook>();
		reader.setReaderID("xxh");
		doubanBooks=readerService.getRecommBook(reader);
		model.addAttribute("greeting",doubanBooks );
		

		return "welcome";
	}

}
