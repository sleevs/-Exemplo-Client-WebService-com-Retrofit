package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class CorridaStatusDto implements Serializable{

private Integer corridaStatusId;
private java.util.Date corridaStatusUpdate;
private String corridaStatusFlag;
private String corridaStatusTipo;
private String corridaStatusLatitude;
private String servicoProdutoLongetude;
private CorridaDto corridaCorridaId;

public CorridaStatusDto(){
}

public CorridaStatusDto(Integer corridaStatusId, java.util.Date corridaStatusUpdate, String corridaStatusFlag, String corridaStatusTipo, String corridaStatusLatitude, String servicoProdutoLongetude, CorridaDto corridaCorridaId){
	this.corridaStatusId=corridaStatusId;
	this.corridaStatusUpdate=corridaStatusUpdate;
	this.corridaStatusFlag=corridaStatusFlag;
	this.corridaStatusTipo=corridaStatusTipo;
	this.corridaStatusLatitude=corridaStatusLatitude;
	this.servicoProdutoLongetude=servicoProdutoLongetude;
	this.corridaCorridaId=corridaCorridaId;

}
public Integer getCorridaStatusId(){
	return corridaStatusId;
}
public void setCorridaStatusId(Integer corridaStatusId){
	this.corridaStatusId=corridaStatusId;
}
public java.util.Date getCorridaStatusUpdate(){
	return corridaStatusUpdate;
}
public void setCorridaStatusUpdate(java.util.Date corridaStatusUpdate){
	this.corridaStatusUpdate=corridaStatusUpdate;
}
public String getCorridaStatusFlag(){
	return corridaStatusFlag;
}
public void setCorridaStatusFlag(String corridaStatusFlag){
	this.corridaStatusFlag=corridaStatusFlag;
}
public String getCorridaStatusTipo(){
	return corridaStatusTipo;
}
public void setCorridaStatusTipo(String corridaStatusTipo){
	this.corridaStatusTipo=corridaStatusTipo;
}
public String getCorridaStatusLatitude(){
	return corridaStatusLatitude;
}
public void setCorridaStatusLatitude(String corridaStatusLatitude){
	this.corridaStatusLatitude=corridaStatusLatitude;
}
public String getServicoProdutoLongetude(){
	return servicoProdutoLongetude;
}
public void setServicoProdutoLongetude(String servicoProdutoLongetude){
	this.servicoProdutoLongetude=servicoProdutoLongetude;
}
public CorridaDto getCorridaCorridaId(){
	return corridaCorridaId;
}
public void setCorridaCorridaId(CorridaDto corridaCorridaId){
	this.corridaCorridaId=corridaCorridaId;
}
}
