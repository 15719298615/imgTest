package com.ys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.ys.pojo.Pic;

public interface PicMapper {
	int insPic(Pic pic);
	
	@Select("select * from pic")
	List<Pic> selAll();
	
	@Delete("delete from pic where id=#{0}")
	int delById(int id);
}
