package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class AnuncioStatusDto implements Serializable{

private Integer anuncioStatusId;
private String anuncioStatusTipo;
private java.util.Date anuncioStatusUpdate;
private Integer anuncioStatusFlag;
private AnuncioDto anuncioAnuncioId;

public AnuncioStatusDto(){
}

public AnuncioStatusDto(Integer anuncioStatusId, String anuncioStatusTipo, java.util.Date anuncioStatusUpdate, Integer anuncioStatusFlag, AnuncioDto anuncioAnuncioId){
	this.anuncioStatusId=anuncioStatusId;
	this.anuncioStatusTipo=anuncioStatusTipo;
	this.anuncioStatusUpdate=anuncioStatusUpdate;
	this.anuncioStatusFlag=anuncioStatusFlag;
	this.anuncioAnuncioId=anuncioAnuncioId;

}
public Integer getAnuncioStatusId(){
	return anuncioStatusId;
}
public void setAnuncioStatusId(Integer anuncioStatusId){
	this.anuncioStatusId=anuncioStatusId;
}
public String getAnuncioStatusTipo(){
	return anuncioStatusTipo;
}
public void setAnuncioStatusTipo(String anuncioStatusTipo){
	this.anuncioStatusTipo=anuncioStatusTipo;
}
public java.util.Date getAnuncioStatusUpdate(){
	return anuncioStatusUpdate;
}
public void setAnuncioStatusUpdate(java.util.Date anuncioStatusUpdate){
	this.anuncioStatusUpdate=anuncioStatusUpdate;
}
public Integer getAnuncioStatusFlag(){
	return anuncioStatusFlag;
}
public void setAnuncioStatusFlag(Integer anuncioStatusFlag){
	this.anuncioStatusFlag=anuncioStatusFlag;
}
public AnuncioDto getAnuncioAnuncioId(){
	return anuncioAnuncioId;
}
public void setAnuncioAnuncioId(AnuncioDto anuncioAnuncioId){
	this.anuncioAnuncioId=anuncioAnuncioId;
}
}
