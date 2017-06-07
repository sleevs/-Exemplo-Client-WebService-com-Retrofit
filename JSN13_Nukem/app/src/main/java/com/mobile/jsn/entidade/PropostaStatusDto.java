package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class PropostaStatusDto implements Serializable{

private short propostaStatusId;
private java.util.Date propostaStatusUpdate;
private short propostaStatusFlag;
private String propostaStatusTipo;
private PropostaDto propostaPropostaId;

public PropostaStatusDto(){
}

public PropostaStatusDto(short propostaStatusId, java.util.Date propostaStatusUpdate, short propostaStatusFlag, String propostaStatusTipo, PropostaDto propostaPropostaId){
	this.propostaStatusId=propostaStatusId;
	this.propostaStatusUpdate=propostaStatusUpdate;
	this.propostaStatusFlag=propostaStatusFlag;
	this.propostaStatusTipo=propostaStatusTipo;
	this.propostaPropostaId=propostaPropostaId;

}
public short getPropostaStatusId(){
	return propostaStatusId;
}
public void setPropostaStatusId(short propostaStatusId){
	this.propostaStatusId=propostaStatusId;
}
public java.util.Date getPropostaStatusUpdate(){
	return propostaStatusUpdate;
}
public void setPropostaStatusUpdate(java.util.Date propostaStatusUpdate){
	this.propostaStatusUpdate=propostaStatusUpdate;
}
public short getPropostaStatusFlag(){
	return propostaStatusFlag;
}
public void setPropostaStatusFlag(short propostaStatusFlag){
	this.propostaStatusFlag=propostaStatusFlag;
}
public String getPropostaStatusTipo(){
	return propostaStatusTipo;
}
public void setPropostaStatusTipo(String propostaStatusTipo){
	this.propostaStatusTipo=propostaStatusTipo;
}
public PropostaDto getPropostaPropostaId(){
	return propostaPropostaId;
}
public void setPropostaPropostaId(PropostaDto propostaPropostaId){
	this.propostaPropostaId=propostaPropostaId;
}
}
