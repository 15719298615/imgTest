package com.ys.service;

import java.util.List;

import com.ys.pojo.Pic;

public interface PicService {
	int insPic(Pic pic);
	
	List<Pic> show();
	
	int delById(int id);
}
