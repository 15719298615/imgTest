package com.ys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ys.mapper.UsersMapper;
import com.ys.pojo.Users;
import com.ys.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{
	
	@Resource
	private UsersMapper usersmapper;
	@Override
	public List<Users> show() {
		return usersmapper.selAll();
	}
}
