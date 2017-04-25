package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="routine")//记得改！！！
public class Routine {
	private Integer id;
	private String ratinglist;
	private String likebook;
	private String unlikebook;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="ratinglist")
	public String getRatinglist() {
		return ratinglist;
	}
	public void setRatinglist(String ratinglist) {
		this.ratinglist = ratinglist;
	}
	@Column(name="likebook")
	public String getLikebook() {
		return likebook;
	}
	public void setLikebook(String likebook) {
		this.likebook = likebook;
	}
	@Column(name="unlikebook")
	public String getUnlikebook() {
		return unlikebook;
	}
	public void setUnlikebook(String unlikebook) {
		this.unlikebook = unlikebook;
	}
	
     
}
