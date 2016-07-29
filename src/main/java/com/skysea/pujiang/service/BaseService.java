package com.skysea.pujiang.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<T> {
	
	T getOne(Serializable pk);
	
	T getOne(T t);
	
	List<T> getList(T t);
	
	List<T> getPageList(T t);
	
	List<Map<String,Object>> getListMap(String sql,Object... params);
	
	void update(T t);
	
	Serializable insert(T t);
	
	Integer insertList(List<T> list);
	
	void delete(T t);
	
	void delete(Serializable pk);
	
	Integer deleteList(List<? extends Serializable> idList);
	
	Integer updateSql(String sql,Object... params);
}
