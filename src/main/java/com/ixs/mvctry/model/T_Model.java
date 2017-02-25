package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_model")
public class T_Model {
	private Integer ModelID;
	private String ModelName;
	private String ModelVersion;
	private String ModelDesc;
	
	public T_Model(){
		
	}
	
	public T_Model(Integer modelID, String modelName, String modelVersion, String modelDesc) {
		//super();
		ModelID = modelID;
		ModelName = modelName;
		ModelVersion = modelVersion;
		ModelDesc = modelDesc;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getModelID() {
		return ModelID;
	}

	public void setModelID(Integer modelID) {
		ModelID = modelID;
	}

	@Column(name="MODELNAME", nullable=false)
	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	@Column(name="MODELVERSION", nullable=false)
	public String getModelVersion() {
		return ModelVersion;
	}

	public void setModelVersion(String modelVersion) {
		ModelVersion = modelVersion;
	}

	@Column(name="MODELDESC", nullable=false)
	public String getModelDesc() {
		return ModelDesc;
	}

	public void setModelDesc(String modelDesc) {
		ModelDesc = modelDesc;
	}

	@Override
	public String toString() {
		return "T_Model [ModelID=" + ModelID + ", ModelName=" + ModelName + ", ModelVersion=" + ModelVersion
				+ ", ModelDesc=" + ModelDesc + "]";
	}
	
}

