package com.cmr.amazon.dao;
import java.util.List;
public interface DAO {
	public Boolean save(Object obj);
	public Boolean update(Object obj);
	public Boolean delete(Integer id);
	public Object get(Integer id);
	public List<Object> list();
}
