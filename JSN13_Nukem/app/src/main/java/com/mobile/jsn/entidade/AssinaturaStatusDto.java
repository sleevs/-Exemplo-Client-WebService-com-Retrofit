package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class AssinaturaStatusDto implements Serializable{

private Integer assinaturaStatusId;
private java.util.Date assinaturaStatusUpdate;
private Integer assinaturaStatusFlag;
private String assinaturaStatusTipo;
private AssinaturaDto assinaturaAssinaturaId;

public AssinaturaStatusDto(){
}

public AssinaturaStatusDto(Integer assinaturaStatusId, java.util.Date assinaturaStatusUpdate, Integer assinaturaStatusFlag, String assinaturaStatusTipo, AssinaturaDto assinaturaAssinaturaId){
	this.assinaturaStatusId=assinaturaStatusId;
	this.assinaturaStatusUpdate=assinaturaStatusUpdate;
	this.assinaturaStatusFlag=assinaturaStatusFlag;
	this.assinaturaStatusTipo=assinaturaStatusTipo;
	this.assinaturaAssinaturaId=assinaturaAssinaturaId;

}
public Integer getAssinaturaStatusId(){
	return assinaturaStatusId;
}
public void setAssinaturaStatusId(Integer assinaturaStatusId){
	this.assinaturaStatusId=assinaturaStatusId;
}
public java.util.Date getAssinaturaStatusUpdate(){
	return assinaturaStatusUpdate;
}
public void setAssinaturaStatusUpdate(java.util.Date assinaturaStatusUpdate){
	this.assinaturaStatusUpdate=assinaturaStatusUpdate;
}
public Integer getAssinaturaStatusFlag(){
	return assinaturaStatusFlag;
}
public void setAssinaturaStatusFlag(Integer assinaturaStatusFlag){
	this.assinaturaStatusFlag=assinaturaStatusFlag;
}
public String getAssinaturaStatusTipo(){
	return assinaturaStatusTipo;
}
public void setAssinaturaStatusTipo(String assinaturaStatusTipo){
	this.assinaturaStatusTipo=assinaturaStatusTipo;
}
public AssinaturaDto getAssinaturaAssinaturaId(){
	return assinaturaAssinaturaId;
}
public void setAssinaturaAssinaturaId(AssinaturaDto assinaturaAssinaturaId){
	this.assinaturaAssinaturaId=assinaturaAssinaturaId;
}
}
