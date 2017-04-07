package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="distancetest")
public class Distance {
	private Integer id;
	private String fromid;
	private String toid;
	private Integer dis;
	
	@Id
	@Column(name="ID", nullable=false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="FROMID", nullable=false)
	public String getFromid() {
		return fromid;
	}
	public void setFromid(String fromid) {
		this.fromid = fromid;
	}
	@Column(name="TOID", nullable=false)
	public String getToid() {
		return toid;
	}
	public void setToid(String toid) {
		this.toid = toid;
	}
	@Column(name="DIS", nullable=false)
	public Integer getDis() {
		return dis;
	}
	public void setDis(Integer dis) {
		this.dis = dis;
	}
	
	
	
	
}
