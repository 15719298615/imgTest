package com.ys.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ys.service.PicService;

@Controller
public class PicController {
	@Resource
	private PicService picServiceImpl;
	@RequestMapping("/")
	public String welcome(Model model){
		model.addAttribute("list",picServiceImpl.show());
		return "/index.jsp";
	} 
	
}
