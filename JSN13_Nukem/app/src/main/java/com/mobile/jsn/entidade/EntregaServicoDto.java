package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class EntregaServicoDto implements Serializable{

private Integer entregaServicoId;
private String entregaServicoData;
private Integer entregaServicoFlag;
private EntregaDto entregaEntregaId;
private ServicoDto servicoServicoId;

public EntregaServicoDto(){
}

public EntregaServicoDto(Integer entregaServicoId, String entregaServicoData, Integer entregaServicoFlag, EntregaDto entregaEntregaId, ServicoDto servicoServicoId){
	this.entregaServicoId=entregaServicoId;
	this.entregaServicoData=entregaServicoData;
	this.entregaServicoFlag=entregaServicoFlag;
	this.entregaEntregaId=entregaEntregaId;
	this.servicoServicoId=servicoServicoId;

}
public Integer getEntregaServicoId(){
	return entregaServicoId;
}
public void setEntregaServicoId(Integer entregaServicoId){
	this.entregaServicoId=entregaServicoId;
}
public String getEntregaServicoData(){
	return entregaServicoData;
}
public void setEntregaServicoData(String entregaServicoData){
	this.entregaServicoData=entregaServicoData;
}
public Integer getEntregaServicoFlag(){
	return entregaServicoFlag;
}
public void setEntregaServicoFlag(Integer entregaServicoFlag){
	this.entregaServicoFlag=entregaServicoFlag;
}
public EntregaDto getEntregaEntregaId(){
	return entregaEntregaId;
}
public void setEntregaEntregaId(EntregaDto entregaEntregaId){
	this.entregaEntregaId=entregaEntregaId;
}
public ServicoDto getServicoServicoId(){
	return servicoServicoId;
}
public void setServicoServicoId(ServicoDto servicoServicoId){
	this.servicoServicoId=servicoServicoId;
}
}
