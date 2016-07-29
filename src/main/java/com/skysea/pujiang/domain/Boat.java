package com.skysea.pujiang.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.skysea.pujiang.domain.support.BaseDomain;

@Entity
@Table(name = "boat")
public class Boat extends BaseDomain implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="boat_name")
	private String boatName;

	@Column(name="main_pic")
	private String mainPic;
	
	@Column(name="boat_desc")
	private String boatDesc;

	@Column(name="create_time")
	private Date createTime;

	@Column(name="update_time")
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBoatName() {
		return boatName;
	}

	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	public String getBoatDesc() {
		return boatDesc;
	}

	public void setBoatDesc(String boatDesc) {
		this.boatDesc = boatDesc;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getMainPic() {
		return mainPic;
	}

	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}
	
}
