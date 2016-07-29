package com.skysea.pujiang.domain.support;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseDomain implements Serializable {
	
	private static final long serialVersionUID = 5510966496699243858L;
	
	private transient Pager pager = new Pager();
	
	private Map<String, Object> map = new HashMap<String, Object>();
	
	private transient Condition condition = new Condition();

	public Map<String, Object> getMap() {
		return this.map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}
	
	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	public BaseDomain addEq(String column,Object value){
		if(null == this.condition.getEqMap()){
			this.condition.setEqMap(new LinkedHashMap<String,Object>());
		}
		this.condition.getEqMap().put(column, value);
		return this;
	}
	
	public BaseDomain addLike(String column,String value){
		if(null == this.condition.getLikeMap()){
			this.condition.setLikeMap(new LinkedHashMap<String,String>());
		}
		this.condition.getLikeMap().put(column, value);
		return this;
	}
	
	public BaseDomain addLeftLike(String column,String value){
		if(null == this.condition.getLeftLikeMap()){
			this.condition.setLeftLikeMap(new LinkedHashMap<String,String>());
		}
		this.condition.getLeftLikeMap().put(column, value);
		return this;
	}
	
	public BaseDomain addRightLike(String column,String value){
		if(null == this.condition.getRightLikeMap()){
			this.condition.setRightLikeMap(new LinkedHashMap<String,String>());
		}
		this.condition.getRightLikeMap().put(column, value);
		return this;
	}
	
	public BaseDomain addGt(String column,Object value){
		if(null == this.condition.getGtMap()){
			this.condition.setGtMap(new LinkedHashMap<String,Object>());
		}
		this.condition.getGtMap().put(column, value);
		return this;
	}
	
	public BaseDomain addGe(String column,String value){
		if(null == this.condition.getGeMap()){
			this.condition.setGeMap(new LinkedHashMap<String,Object>());
		}
		this.condition.getGeMap().put(column, value);
		return this;
	}
	
	public BaseDomain addLt(String column,String value){
		if(null == this.condition.getLtMap()){
			this.condition.setLtMap(new LinkedHashMap<String,Object>());
		}
		this.condition.getLtMap().put(column, value);
		return this;
	}
	
	public BaseDomain addLe(String column,String value){
		if(null == this.condition.getLeMap()){
			this.condition.setLeMap(new LinkedHashMap<String,Object>());
		}
		this.condition.getLeMap().put(column, value);
		return this;
	}
	
	public BaseDomain addNotNull(String column){
		if(null == this.condition.getNotNullList()){
			this.condition.setNotNullList(new ArrayList<String>());
		}
		this.condition.getNotNullList().add(column);
		return this;
	}
	
	public BaseDomain addNull(String column,String value){
		if(null == this.condition.getNullList()){
			this.condition.setNullList(new ArrayList<String>());
		}
		this.condition.getNullList().add(column);
		return this;
	}
	
	public BaseDomain addDesc(String column){
		if(null == this.condition.getDescList()){
			this.condition.setDescList(new ArrayList<String>());
		}
		this.condition.getDescList().add(column);
		return this;
	}
	
	public BaseDomain addAsc(String column){
		if(null == this.condition.getAscList()){
			this.condition.setAscList(new ArrayList<String>());
		}
		this.condition.getAscList().add(column);
		return this;
	}
	
	public boolean isHaveCondition(){
		if(null == this.getCondition()){
			return false;
		}
		if(null != this.getCondition().getAscList() && this.getCondition().getAscList().size() > 0){
			return true;
		}
		if(null != this.getCondition().getDescList() && this.getCondition().getDescList().size() > 0){
			return true;
		}
		if(null != this.getCondition().getEqMap() && this.getCondition().getEqMap().size() > 0){
			return true;
		}
		if(null != this.getCondition().getLeftLikeMap() && this.getCondition().getLeftLikeMap().size() > 0){
			return true;
		}
		if(null != this.getCondition().getRightLikeMap() && this.getCondition().getRightLikeMap().size() > 0){
			return true;
		}
		if(null != this.getCondition().getLikeMap() && this.getCondition().getLikeMap().size() > 0){
			return true;
		}
		if(null != this.getCondition().getNotNullList() && this.getCondition().getNotNullList().size() > 0){
			return true;
		}
		if(null != this.getCondition().getNullList() && this.getCondition().getNullList().size() > 0){
			return true;
		}
		
		if(null != this.getCondition().getGtMap() && this.getCondition().getGtMap().size() > 0){
			return true;
		}
		if(null != this.getCondition().getGeMap() && this.getCondition().getGeMap().size() > 0){
			return true;
		}
		if(null != this.getCondition().getLtMap() && this.getCondition().getLtMap().size() > 0){
			return true;
		}
		if(null != this.getCondition().getLeMap() && this.getCondition().getLeMap().size() > 0){
			return true;
		}
		return false;
	}

	public void initPager(int page, int rows) {
		this.pager.setPage(page);
		this.pager.setRows(rows);
		this.pager.init();
	}

}
