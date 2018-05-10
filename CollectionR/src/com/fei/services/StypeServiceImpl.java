package com.fei.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;



import com.fei.dao.StypeMapping;
import com.fei.entity.Stype;
import com.fei.util.MyBatisUtil;

public class StypeServiceImpl implements StypeService {

	@Override
	public List<Stype> findAllStype() {
		SqlSession session = MyBatisUtil.getSession();
		StypeMapping sm = session.getMapper(StypeMapping.class);
		List<Stype> slist = sm.selAllStype();
		session.close();
		return slist;	
	}

}
