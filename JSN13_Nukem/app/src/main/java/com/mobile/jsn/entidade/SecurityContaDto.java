package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class SecurityContaDto implements Serializable{

private Integer securitySecurityId;
private java.util.Date securityContaData;
private String securityContaStatus;
private String securityContaFlag;
private ContaDto contaConta;
private SecurityDto security;

public SecurityContaDto(){
}

public SecurityContaDto(Integer securitySecurityId, java.util.Date securityContaData, String securityContaStatus, String securityContaFlag, ContaDto contaConta, SecurityDto security){
	this.securitySecurityId=securitySecurityId;
	this.securityContaData=securityContaData;
	this.securityContaStatus=securityContaStatus;
	this.securityContaFlag=securityContaFlag;
	this.contaConta=contaConta;
	this.security=security;

}
public Integer getSecuritySecurityId(){
	return securitySecurityId;
}
public void setSecuritySecurityId(Integer securitySecurityId){
	this.securitySecurityId=securitySecurityId;
}
public java.util.Date getSecurityContaData(){
	return securityContaData;
}
public void setSecurityContaData(java.util.Date securityContaData){
	this.securityContaData=securityContaData;
}
public String getSecurityContaStatus(){
	return securityContaStatus;
}
public void setSecurityContaStatus(String securityContaStatus){
	this.securityContaStatus=securityContaStatus;
}
public String getSecurityContaFlag(){
	return securityContaFlag;
}
public void setSecurityContaFlag(String securityContaFlag){
	this.securityContaFlag=securityContaFlag;
}
public ContaDto getContaConta(){
	return contaConta;
}
public void setContaConta(ContaDto contaConta){
	this.contaConta=contaConta;
}
public SecurityDto getSecurity(){
	return security;
}
public void setSecurity(SecurityDto security){
	this.security=security;
}
}
