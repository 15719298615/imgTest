package com.ys.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ys.service.UsersService;

@Controller
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;
	@RequestMapping("show")
	public String show(Model model){
		model.addAttribute("list",usersServiceImpl.show());
		return "index.jsp";
	}
}
