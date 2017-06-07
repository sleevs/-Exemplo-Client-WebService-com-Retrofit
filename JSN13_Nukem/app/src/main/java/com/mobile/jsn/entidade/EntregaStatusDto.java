package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class EntregaStatusDto implements Serializable{

private Integer entregaServicoId;
private java.util.Date entregaServicoUpdate;
private Integer entregaServicoFlag;
private String entregaStatusTipo;
private String entregaStatusLatitude;
private String entregaStatusLongitude;
private EntregaDto entregaEntregaId;

public EntregaStatusDto(){
}

public EntregaStatusDto(Integer entregaServicoId, java.util.Date entregaServicoUpdate, Integer entregaServicoFlag, String entregaStatusTipo, String entregaStatusLatitude, String entregaStatusLongitude, EntregaDto entregaEntregaId){
	this.entregaServicoId=entregaServicoId;
	this.entregaServicoUpdate=entregaServicoUpdate;
	this.entregaServicoFlag=entregaServicoFlag;
	this.entregaStatusTipo=entregaStatusTipo;
	this.entregaStatusLatitude=entregaStatusLatitude;
	this.entregaStatusLongitude=entregaStatusLongitude;
	this.entregaEntregaId=entregaEntregaId;

}
public Integer getEntregaServicoId(){
	return entregaServicoId;
}
public void setEntregaServicoId(Integer entregaServicoId){
	this.entregaServicoId=entregaServicoId;
}
public java.util.Date getEntregaServicoUpdate(){
	return entregaServicoUpdate;
}
public void setEntregaServicoUpdate(java.util.Date entregaServicoUpdate){
	this.entregaServicoUpdate=entregaServicoUpdate;
}
public Integer getEntregaServicoFlag(){
	return entregaServicoFlag;
}
public void setEntregaServicoFlag(Integer entregaServicoFlag){
	this.entregaServicoFlag=entregaServicoFlag;
}
public String getEntregaStatusTipo(){
	return entregaStatusTipo;
}
public void setEntregaStatusTipo(String entregaStatusTipo){
	this.entregaStatusTipo=entregaStatusTipo;
}
public String getEntregaStatusLatitude(){
	return entregaStatusLatitude;
}
public void setEntregaStatusLatitude(String entregaStatusLatitude){
	this.entregaStatusLatitude=entregaStatusLatitude;
}
public String getEntregaStatusLongitude(){
	return entregaStatusLongitude;
}
public void setEntregaStatusLongitude(String entregaStatusLongitude){
	this.entregaStatusLongitude=entregaStatusLongitude;
}
public EntregaDto getEntregaEntregaId(){
	return entregaEntregaId;
}
public void setEntregaEntregaId(EntregaDto entregaEntregaId){
	this.entregaEntregaId=entregaEntregaId;
}
}
