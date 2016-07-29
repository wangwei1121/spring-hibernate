package com.skysea.pujiang.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.skysea.pujiang.dao.BaseDao;
import com.skysea.pujiang.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T>{

	@Autowired
	private BaseDao<T> baseDao;
	
	@Override
	public T getOne(Serializable pk) {
		return this.baseDao.selectOne(pk);
	}

	@Override
	public T getOne(T t) {
		return null;
	}

	@Override
	public List<T> getList(T t) {
		return null;
	}

	@Override
	public List<T> getPageList(T t) {
		return null;
	}

	@Override
	public List<Map<String, Object>> getListMap(String sql, Object... params) {
		return null;
	}

	@Override
	public void update(T t) {
		this.baseDao.update(t);
	}

	@Override
	public Serializable insert(T t) {
		return this.baseDao.insert(t);
	}

	@Override
	public Integer insertList(List<T> list) {
		return null;
	}

	@Override
	public void delete(T t) {
		this.baseDao.delete(t);
	}

	@Override
	public void delete(Serializable pk) {
		this.baseDao.delete(pk);
	}

	@Override
	public Integer deleteList(List<? extends Serializable> idList) {
		return null;
	}

	@Override
	public Integer updateSql(String sql, Object... params) {
		return null;
	}

}
