package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class LocalizacaoDto implements Serializable{

private Integer localizacaoId;
private String localizacaoLatitude;
private String localizacaoLongitude;
private java.util.Date localizacaoUpdate;
private String localizacaoLocalizacao;
private String localizacaoFlag;
private String localizacaoStatus;
private String localizacaoDescricao;
private String localizacaElevacao;
private String localizacaoVelocidade;
private String localizacaoOrientacao;
private String localizacaoPosicao;
private String localizacaoAltitude;
private String localizacaoPrecisao;
private ContaDto contaContaId;

public LocalizacaoDto(){
}

public LocalizacaoDto(Integer localizacaoId, String localizacaoLatitude, String localizacaoLongitude, java.util.Date localizacaoUpdate, String localizacaoLocalizacao, String localizacaoFlag, String localizacaoStatus, String localizacaoDescricao, String localizacaElevacao, String localizacaoVelocidade, String localizacaoOrientacao, String localizacaoPosicao, String localizacaoAltitude, String localizacaoPrecisao, ContaDto contaContaId){
	this.localizacaoId=localizacaoId;
	this.localizacaoLatitude=localizacaoLatitude;
	this.localizacaoLongitude=localizacaoLongitude;
	this.localizacaoUpdate=localizacaoUpdate;
	this.localizacaoLocalizacao=localizacaoLocalizacao;
	this.localizacaoFlag=localizacaoFlag;
	this.localizacaoStatus=localizacaoStatus;
	this.localizacaoDescricao=localizacaoDescricao;
	this.localizacaElevacao=localizacaElevacao;
	this.localizacaoVelocidade=localizacaoVelocidade;
	this.localizacaoOrientacao=localizacaoOrientacao;
	this.localizacaoPosicao=localizacaoPosicao;
	this.localizacaoAltitude=localizacaoAltitude;
	this.localizacaoPrecisao=localizacaoPrecisao;
	this.contaContaId=contaContaId;

}
public Integer getLocalizacaoId(){
	return localizacaoId;
}
public void setLocalizacaoId(Integer localizacaoId){
	this.localizacaoId=localizacaoId;
}
public String getLocalizacaoLatitude(){
	return localizacaoLatitude;
}
public void setLocalizacaoLatitude(String localizacaoLatitude){
	this.localizacaoLatitude=localizacaoLatitude;
}
public String getLocalizacaoLongitude(){
	return localizacaoLongitude;
}
public void setLocalizacaoLongitude(String localizacaoLongitude){
	this.localizacaoLongitude=localizacaoLongitude;
}
public java.util.Date getLocalizacaoUpdate(){
	return localizacaoUpdate;
}
public void setLocalizacaoUpdate(java.util.Date localizacaoUpdate){
	this.localizacaoUpdate=localizacaoUpdate;
}
public String getLocalizacaoLocalizacao(){
	return localizacaoLocalizacao;
}
public void setLocalizacaoLocalizacao(String localizacaoLocalizacao){
	this.localizacaoLocalizacao=localizacaoLocalizacao;
}
public String getLocalizacaoFlag(){
	return localizacaoFlag;
}
public void setLocalizacaoFlag(String localizacaoFlag){
	this.localizacaoFlag=localizacaoFlag;
}
public String getLocalizacaoStatus(){
	return localizacaoStatus;
}
public void setLocalizacaoStatus(String localizacaoStatus){
	this.localizacaoStatus=localizacaoStatus;
}
public String getLocalizacaoDescricao(){
	return localizacaoDescricao;
}
public void setLocalizacaoDescricao(String localizacaoDescricao){
	this.localizacaoDescricao=localizacaoDescricao;
}
public String getLocalizacaElevacao(){
	return localizacaElevacao;
}
public void setLocalizacaElevacao(String localizacaElevacao){
	this.localizacaElevacao=localizacaElevacao;
}
public String getLocalizacaoVelocidade(){
	return localizacaoVelocidade;
}
public void setLocalizacaoVelocidade(String localizacaoVelocidade){
	this.localizacaoVelocidade=localizacaoVelocidade;
}
public String getLocalizacaoOrientacao(){
	return localizacaoOrientacao;
}
public void setLocalizacaoOrientacao(String localizacaoOrientacao){
	this.localizacaoOrientacao=localizacaoOrientacao;
}
public String getLocalizacaoPosicao(){
	return localizacaoPosicao;
}
public void setLocalizacaoPosicao(String localizacaoPosicao){
	this.localizacaoPosicao=localizacaoPosicao;
}
public String getLocalizacaoAltitude(){
	return localizacaoAltitude;
}
public void setLocalizacaoAltitude(String localizacaoAltitude){
	this.localizacaoAltitude=localizacaoAltitude;
}
public String getLocalizacaoPrecisao(){
	return localizacaoPrecisao;
}
public void setLocalizacaoPrecisao(String localizacaoPrecisao){
	this.localizacaoPrecisao=localizacaoPrecisao;
}
public ContaDto getContaContaId(){
	return contaContaId;
}
public void setContaContaId(ContaDto contaContaId){
	this.contaContaId=contaContaId;
}
}
