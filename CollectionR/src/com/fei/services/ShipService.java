package com.fei.services;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fei.entity.Ship;

public interface ShipService {
	
	//判断某个船是否存在
	public int isExists(String code);	
	//更新船信息
	public int updateShip(Ship ship);
	//保存船信息
	public int saveShip(Ship ship);
	//分页查询
	public List<Ship> findAllShip(@Param("one")int pageNum,@Param("two")int pageSize);
	//获取数据总条数
	public int findCount();
	
}
