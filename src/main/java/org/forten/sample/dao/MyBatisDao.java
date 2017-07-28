package org.forten.sample.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

@Repository("myBatisDao")
public class MyBatisDao<T> {
	@Resource
	private SqlSessionFactory ssf;
	
	public T getMapper(Class<T> clazz){
		return ssf.openSession().getMapper(clazz);
	}
}
