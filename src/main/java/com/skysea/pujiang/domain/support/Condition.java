package com.skysea.pujiang.domain.support;

import java.util.List;
import java.util.Map;

public class Condition {
	
	private Map<String,Object> eqMap = null;
	
	private Map<String,Object> gtMap = null;
	
	private Map<String,Object> geMap = null;
	
	private Map<String,Object> ltMap = null;
	
	private Map<String,Object> leMap = null;

	private Map<String,String> likeMap = null;
	
	private Map<String,String> leftLikeMap = null;
	
	private Map<String,String> rightLikeMap = null;
	
	private List<String> nullList = null;
	
	private List<String> notNullList = null;
	
	private List<String> ascList = null;
	
	private List<String> descList = null;
	

	public Map<String, String> getLikeMap() {
		return likeMap;
	}

	public void setLikeMap(Map<String, String> likeMap) {
		this.likeMap = likeMap;
	}

	public Map<String, String> getLeftLikeMap() {
		return leftLikeMap;
	}

	public void setLeftLikeMap(Map<String, String> leftLikeMap) {
		this.leftLikeMap = leftLikeMap;
	}

	public Map<String, String> getRightLikeMap() {
		return rightLikeMap;
	}

	public void setRightLikeMap(Map<String, String> rightLikeMap) {
		this.rightLikeMap = rightLikeMap;
	}

	public List<String> getNullList() {
		return nullList;
	}

	public void setNullList(List<String> nullList) {
		this.nullList = nullList;
	}

	public List<String> getNotNullList() {
		return notNullList;
	}

	public void setNotNullList(List<String> notNullList) {
		this.notNullList = notNullList;
	}

	public Map<String, Object> getEqMap() {
		return eqMap;
	}

	public void setEqMap(Map<String, Object> eqMap) {
		this.eqMap = eqMap;
	}

	public List<String> getAscList() {
		return ascList;
	}

	public void setAscList(List<String> ascList) {
		this.ascList = ascList;
	}

	public List<String> getDescList() {
		return descList;
	}

	public void setDescList(List<String> descList) {
		this.descList = descList;
	}

	public Map<String, Object> getGtMap() {
		return gtMap;
	}

	public void setGtMap(Map<String, Object> gtMap) {
		this.gtMap = gtMap;
	}

	public Map<String, Object> getGeMap() {
		return geMap;
	}

	public void setGeMap(Map<String, Object> geMap) {
		this.geMap = geMap;
	}

	public Map<String, Object> getLtMap() {
		return ltMap;
	}

	public void setLtMap(Map<String, Object> ltMap) {
		this.ltMap = ltMap;
	}

	public Map<String, Object> getLeMap() {
		return leMap;
	}

	public void setLeMap(Map<String, Object> leMap) {
		this.leMap = leMap;
	}

}
