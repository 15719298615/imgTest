package com.ys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ys.mapper.PicMapper;
import com.ys.pojo.Pic;
import com.ys.service.PicService;
@Service
public class PicServiceImpl implements PicService {
	@Value("${management.url}")
	private String path;
	@Resource
	private PicMapper picMapper;
	@Override
	public List<Pic> show() {
		List<Pic> list = picMapper.selAll();
		for (Pic pic : list) {
			pic.setPath(path+pic.getPath());
		}
		return list;
	}
	
}
