package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class SecurityDto implements Serializable{

private Integer securityId;
private String securityRegra;
private String securityStatus;
private String securityPermissao;
private java.util.Date securityData;
private Integer securityNivel;
private String securityOperacao;
private SecurityContaDto securityConta;

public SecurityDto(){
}

public SecurityDto(Integer securityId, String securityRegra, String securityStatus, String securityPermissao, java.util.Date securityData, Integer securityNivel, String securityOperacao, SecurityContaDto securityConta){
	this.securityId=securityId;
	this.securityRegra=securityRegra;
	this.securityStatus=securityStatus;
	this.securityPermissao=securityPermissao;
	this.securityData=securityData;
	this.securityNivel=securityNivel;
	this.securityOperacao=securityOperacao;
	this.securityConta=securityConta;

}
public Integer getSecurityId(){
	return securityId;
}
public void setSecurityId(Integer securityId){
	this.securityId=securityId;
}
public String getSecurityRegra(){
	return securityRegra;
}
public void setSecurityRegra(String securityRegra){
	this.securityRegra=securityRegra;
}
public String getSecurityStatus(){
	return securityStatus;
}
public void setSecurityStatus(String securityStatus){
	this.securityStatus=securityStatus;
}
public String getSecurityPermissao(){
	return securityPermissao;
}
public void setSecurityPermissao(String securityPermissao){
	this.securityPermissao=securityPermissao;
}
public java.util.Date getSecurityData(){
	return securityData;
}
public void setSecurityData(java.util.Date securityData){
	this.securityData=securityData;
}
public Integer getSecurityNivel(){
	return securityNivel;
}
public void setSecurityNivel(Integer securityNivel){
	this.securityNivel=securityNivel;
}
public String getSecurityOperacao(){
	return securityOperacao;
}
public void setSecurityOperacao(String securityOperacao){
	this.securityOperacao=securityOperacao;
}
public SecurityContaDto getSecurityConta(){
	return securityConta;
}
public void setSecurityConta(SecurityContaDto securityConta){
	this.securityConta=securityConta;
}
}
