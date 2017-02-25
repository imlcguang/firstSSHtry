package com.ixs.mvctry.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ixs.mvctry.model.T_Model;
import com.ixs.mvctry.service.impl.ModelServiceImpl;

@SessionAttributes(value = "modelname")
@Controller
@RequestMapping(value = "/model")
public class ModelController {
	@Autowired
	public ModelServiceImpl modelService;

	/**
     * 保存添加的数据
     * 
     * @param person
     * @return
     */
    @RequestMapping(value = "/savemodel")
    public String saveperson(T_Model model) {
        modelService.addModel(model);
        return "add";
    }
	
	
}
