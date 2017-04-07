package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="relationtest")
public class Relation {
	private String relationid;
	private String userid;
	private String friendid;
	
	@Id
	@Column(name="RELATIONID", nullable=false)
	public String getRelationid() {
		return relationid;
	}
	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}
	
	@Column(name="USERID", nullable=false)
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Column(name="FRIENDID", nullable=false)
	public String getFriendid() {
		return friendid;
	}
	public void setFriendid(String friendid) {
		this.friendid = friendid;
	}
	
	@Override
	public String toString() {
		return "Relation [relationid=" + relationid + ", userid=" + userid + ", friendid=" + friendid + "]";
	}
}
