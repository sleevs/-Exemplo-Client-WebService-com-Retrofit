package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class ContaStatusDto implements Serializable{

private Integer contaStatusId;
private Integer contaStatusFlag;
private String contaStatusTipo;
private java.util.Date contaStatusUpdate;
private String contaStatusLongetude;
private String contaStatusLatitude;
private ContaDto contaConta;

public ContaStatusDto(){
}

public ContaStatusDto(Integer contaStatusId, Integer contaStatusFlag, String contaStatusTipo, java.util.Date contaStatusUpdate, String contaStatusLongetude, String contaStatusLatitude, ContaDto contaConta){
	this.contaStatusId=contaStatusId;
	this.contaStatusFlag=contaStatusFlag;
	this.contaStatusTipo=contaStatusTipo;
	this.contaStatusUpdate=contaStatusUpdate;
	this.contaStatusLongetude=contaStatusLongetude;
	this.contaStatusLatitude=contaStatusLatitude;
	this.contaConta=contaConta;

}
public Integer getContaStatusId(){
	return contaStatusId;
}
public void setContaStatusId(Integer contaStatusId){
	this.contaStatusId=contaStatusId;
}
public Integer getContaStatusFlag(){
	return contaStatusFlag;
}
public void setContaStatusFlag(Integer contaStatusFlag){
	this.contaStatusFlag=contaStatusFlag;
}
public String getContaStatusTipo(){
	return contaStatusTipo;
}
public void setContaStatusTipo(String contaStatusTipo){
	this.contaStatusTipo=contaStatusTipo;
}
public java.util.Date getContaStatusUpdate(){
	return contaStatusUpdate;
}
public void setContaStatusUpdate(java.util.Date contaStatusUpdate){
	this.contaStatusUpdate=contaStatusUpdate;
}
public String getContaStatusLongetude(){
	return contaStatusLongetude;
}
public void setContaStatusLongetude(String contaStatusLongetude){
	this.contaStatusLongetude=contaStatusLongetude;
}
public String getContaStatusLatitude(){
	return contaStatusLatitude;
}
public void setContaStatusLatitude(String contaStatusLatitude){
	this.contaStatusLatitude=contaStatusLatitude;
}
public ContaDto getContaConta(){
	return contaConta;
}
public void setContaConta(ContaDto contaConta){
	this.contaConta=contaConta;
}
}
