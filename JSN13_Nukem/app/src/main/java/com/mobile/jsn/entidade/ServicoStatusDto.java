package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class ServicoStatusDto implements Serializable{

private Integer contaStatusId;
private String contaStatusTipo;
private java.util.Date contaStatusUpdate;
private String servicoStatusFlag;
private ServicoDto servicoServicoId;

public ServicoStatusDto(){
}

public ServicoStatusDto(Integer contaStatusId, String contaStatusTipo, java.util.Date contaStatusUpdate, String servicoStatusFlag, ServicoDto servicoServicoId){
	this.contaStatusId=contaStatusId;
	this.contaStatusTipo=contaStatusTipo;
	this.contaStatusUpdate=contaStatusUpdate;
	this.servicoStatusFlag=servicoStatusFlag;
	this.servicoServicoId=servicoServicoId;

}
public Integer getContaStatusId(){
	return contaStatusId;
}
public void setContaStatusId(Integer contaStatusId){
	this.contaStatusId=contaStatusId;
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
public String getServicoStatusFlag(){
	return servicoStatusFlag;
}
public void setServicoStatusFlag(String servicoStatusFlag){
	this.servicoStatusFlag=servicoStatusFlag;
}
public ServicoDto getServicoServicoId(){
	return servicoServicoId;
}
public void setServicoServicoId(ServicoDto servicoServicoId){
	this.servicoServicoId=servicoServicoId;
}
}
