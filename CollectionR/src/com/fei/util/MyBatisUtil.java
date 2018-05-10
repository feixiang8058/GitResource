package com.fei.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static String str = "MyBatis.xml";
	private static InputStream is = null;
	private static SqlSessionFactory sqlSession;

	static {
		try {
			is = Resources.getResourceAsStream(str);
			sqlSession = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public static SqlSession getSession(){
		return sqlSession.openSession(false);
	}

}
