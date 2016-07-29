package com.skysea.pujiang.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {

	T selectOne(Serializable id);
	
	T selectOne(T t);
	
	List<T> selectList(T t);
	
	List<T> selectPageList(T t);
	
	List<Map<String,Object>> selectListMap(String sql,Object... params);
	
	void update(T t);
	
	Serializable insert(T t);
	
	Integer insertList(List<T> list);
	
	void delete(T t);
	
	void delete(Serializable id);
	
	Integer deleteList(List<? extends Serializable> idList);
	
	Integer updateSql(String sql,Object... params);
	
}
