package com.skysea.pujiang.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.skysea.pujiang.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>{
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	protected Class<T> elementClass;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public BaseDaoImpl() {
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		this.elementClass = ((Class) params[0]);
	}
	
	@Override
	public T selectOne(Serializable pk) {
		return this.getSession().get(this.elementClass, pk);
	}
	
	@Override
	public T selectOne(T t) {
		return null;
	}

	@Override
	public List<T> selectList(T t) {
		return null;
	}

	@Override
	public List<T> selectPageList(T t) {
		return null;
	}
	
	@Override
	public List<Map<String, Object>> selectListMap(String sql, Object... params) {
		return null;
	}

	@Override
	public void update(T t) {
		this.getSession().update(t);
	}

	@Override
	public Serializable insert(T t) {
		return this.getSession().save(t);
	}

	@Override
	public Integer insertList(List<T> list) {
		return null;
	}

	@Override
	public void delete(T t) {
		this.getSession().delete(t);
	}

	@Override
	public void delete(Serializable id) {
		this.getSession().delete(this.elementClass.getName(), id);
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
