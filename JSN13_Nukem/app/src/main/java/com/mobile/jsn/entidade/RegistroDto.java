package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class RegistroDto implements Serializable{

private Integer registroId;
private String registroNome;
private String registroEmail;
private String registroToken;
private String registroStatus;
private String registroOrigem;
private String registroTipo;
private String registroSenha;
private java.util.Date registroData;
private ContaDto contaConta;

public RegistroDto(){
}

public RegistroDto(Integer registroId, String registroNome, String registroEmail, String registroToken, String registroStatus, String registroOrigem, String registroTipo, String registroSenha, java.util.Date registroData, ContaDto contaConta){
	this.registroId=registroId;
	this.registroNome=registroNome;
	this.registroEmail=registroEmail;
	this.registroToken=registroToken;
	this.registroStatus=registroStatus;
	this.registroOrigem=registroOrigem;
	this.registroTipo=registroTipo;
	this.registroSenha=registroSenha;
	this.registroData=registroData;
	this.contaConta=contaConta;

}
public Integer getRegistroId(){
	return registroId;
}
public void setRegistroId(Integer registroId){
	this.registroId=registroId;
}
public String getRegistroNome(){
	return registroNome;
}
public void setRegistroNome(String registroNome){
	this.registroNome=registroNome;
}
public String getRegistroEmail(){
	return registroEmail;
}
public void setRegistroEmail(String registroEmail){
	this.registroEmail=registroEmail;
}
public String getRegistroToken(){
	return registroToken;
}
public void setRegistroToken(String registroToken){
	this.registroToken=registroToken;
}
public String getRegistroStatus(){
	return registroStatus;
}
public void setRegistroStatus(String registroStatus){
	this.registroStatus=registroStatus;
}
public String getRegistroOrigem(){
	return registroOrigem;
}
public void setRegistroOrigem(String registroOrigem){
	this.registroOrigem=registroOrigem;
}
public String getRegistroTipo(){
	return registroTipo;
}
public void setRegistroTipo(String registroTipo){
	this.registroTipo=registroTipo;
}
public String getRegistroSenha(){
	return registroSenha;
}
public void setRegistroSenha(String registroSenha){
	this.registroSenha=registroSenha;
}
public java.util.Date getRegistroData(){
	return registroData;
}
public void setRegistroData(java.util.Date registroData){
	this.registroData=registroData;
}
public ContaDto getContaConta(){
	return contaConta;
}
public void setContaConta(ContaDto contaConta){
	this.contaConta=contaConta;
}
}
