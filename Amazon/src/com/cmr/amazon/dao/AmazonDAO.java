package com.cmr.amazon.dao;

import java.sql.ResultSet;
import java.util.List;

import com.cmr.amazon.common.JDBCTemplate;

public abstract class AmazonDAO implements DAO {
	 protected String sql=null;
	 protected ResultSet rs=null;
	 
	@Override
	public Boolean save(Object obj) {
		return JDBCTemplate.executeUpdate(sql);
	}

	@Override
	public Boolean update(Object obj) {
		return JDBCTemplate.executeUpdate(sql);
		
	}

	@Override
	public Boolean delete(Integer id) {
		return JDBCTemplate.executeUpdate(sql);
		
	}

	public abstract Object get(Integer id);
	public abstract List<Object> list();
}
