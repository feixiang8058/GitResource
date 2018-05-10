package com.fei.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fei.dao.NationalityMapping;
import com.fei.entity.Nationality;
import com.fei.util.MyBatisUtil;

public class NationServiceImpl implements NationService {

	@Override
	public List<Nationality> findAllNation() {
		SqlSession session = MyBatisUtil.getSession();
		
		NationalityMapping nm = session.getMapper(NationalityMapping.class);
		
		List<Nationality> nlist = nm.selAllNation();
		
		session.close();
		return nlist;
	}

}
