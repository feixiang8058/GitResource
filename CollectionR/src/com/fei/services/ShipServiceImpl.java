package com.fei.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fei.dao.ShipMapping;
import com.fei.entity.Ship;
import com.fei.util.MyBatisUtil;

public class ShipServiceImpl implements ShipService {

	
	@Override
	public int isExists(String code) {
		SqlSession session = MyBatisUtil.getSession();
		ShipMapping sm = session.getMapper(ShipMapping.class);
		int result = sm.isExists(code);
		session.close();
		return result;
	}

	@Override
	public int updateShip(Ship ship) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveShip(Ship ship) {
		SqlSession session = MyBatisUtil.getSession();
		ShipMapping sm = session.getMapper(ShipMapping.class);	
		
		int count = sm.saveShip(ship);
		session.commit();
		session.close();
		return count;
	}

	@Override
	public List<Ship> findAllShip(int pageNum, int pageSize) {
		SqlSession session = MyBatisUtil.getSession();
		ShipMapping sm = session.getMapper(ShipMapping.class);		
		List<Ship> list = sm.selAllShip((pageNum-1)*pageSize, pageSize);
		session.close();
		return list;
	}

	
	@Override
	public int findCount() {
		SqlSession session = MyBatisUtil.getSession();
		ShipMapping sm = session.getMapper(ShipMapping.class);
		int count = sm.selCount();
		session.close();
		return count;
	}

}
