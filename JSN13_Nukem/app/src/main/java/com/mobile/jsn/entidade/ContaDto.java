package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class ContaDto implements Serializable{

private Integer contaId;
private String contaNome;
private String contaSobrenome;
private String contaTipo;
private String contaCategoria;
private String contaEmail;
private String contaApelido;
private java.util.Date contaData;
private java.util.Date contaNascimento;
private String contaSenha;
private String contaFoto;
private java.util.List<LocalizacaoDto> localizacaoList;
private java.util.List<RegistroDto> registroList;
private java.util.List<AnuncioDto> anuncioList;
private java.util.List<QualificarDto> qualificarList;
private java.util.List<ArquivoDto> arquivoList;
private java.util.List<ContaStatusDto> contaStatusList;
private java.util.List<SecurityContaDto> securityContaList;

public ContaDto(){
}

public ContaDto(Integer contaId, String contaNome, String contaSobrenome, String contaTipo, String contaCategoria, String contaEmail, String contaApelido, java.util.Date contaData, java.util.Date contaNascimento, String contaSenha, String contaFoto, java.util.List<LocalizacaoDto> localizacaoList, java.util.List<RegistroDto> registroList, java.util.List<AnuncioDto> anuncioList, java.util.List<QualificarDto> qualificarList, java.util.List<ArquivoDto> arquivoList, java.util.List<ContaStatusDto> contaStatusList, java.util.List<SecurityContaDto> securityContaList){
	this.contaId=contaId;
	this.contaNome=contaNome;
	this.contaSobrenome=contaSobrenome;
	this.contaTipo=contaTipo;
	this.contaCategoria=contaCategoria;
	this.contaEmail=contaEmail;
	this.contaApelido=contaApelido;
	this.contaData=contaData;
	this.contaNascimento=contaNascimento;
	this.contaSenha=contaSenha;
	this.contaFoto=contaFoto;
	this.localizacaoList=localizacaoList;
	this.registroList=registroList;
	this.anuncioList=anuncioList;
	this.qualificarList=qualificarList;
	this.arquivoList=arquivoList;
	this.contaStatusList=contaStatusList;
	this.securityContaList=securityContaList;

}
public Integer getContaId(){
	return contaId;
}
public void setContaId(Integer contaId){
	this.contaId=contaId;
}
public String getContaNome(){
	return contaNome;
}
public void setContaNome(String contaNome){
	this.contaNome=contaNome;
}
public String getContaSobrenome(){
	return contaSobrenome;
}
public void setContaSobrenome(String contaSobrenome){
	this.contaSobrenome=contaSobrenome;
}
public String getContaTipo(){
	return contaTipo;
}
public void setContaTipo(String contaTipo){
	this.contaTipo=contaTipo;
}
public String getContaCategoria(){
	return contaCategoria;
}
public void setContaCategoria(String contaCategoria){
	this.contaCategoria=contaCategoria;
}
public String getContaEmail(){
	return contaEmail;
}
public void setContaEmail(String contaEmail){
	this.contaEmail=contaEmail;
}
public String getContaApelido(){
	return contaApelido;
}
public void setContaApelido(String contaApelido){
	this.contaApelido=contaApelido;
}
public java.util.Date getContaData(){
	return contaData;
}
public void setContaData(java.util.Date contaData){
	this.contaData=contaData;
}
public java.util.Date getContaNascimento(){
	return contaNascimento;
}
public void setContaNascimento(java.util.Date contaNascimento){
	this.contaNascimento=contaNascimento;
}
public String getContaSenha(){
	return contaSenha;
}
public void setContaSenha(String contaSenha){
	this.contaSenha=contaSenha;
}
public String getContaFoto(){
	return contaFoto;
}
public void setContaFoto(String contaFoto){
	this.contaFoto=contaFoto;
}
public java.util.List<LocalizacaoDto> getLocalizacaoList(){
	return localizacaoList;
}
public void setLocalizacaoList(java.util.List<LocalizacaoDto> localizacaoList){
	this.localizacaoList=localizacaoList;
}
public java.util.List<RegistroDto> getRegistroList(){
	return registroList;
}
public void setRegistroList(java.util.List<RegistroDto> registroList){
	this.registroList=registroList;
}
public java.util.List<AnuncioDto> getAnuncioList(){
	return anuncioList;
}
public void setAnuncioList(java.util.List<AnuncioDto> anuncioList){
	this.anuncioList=anuncioList;
}
public java.util.List<QualificarDto> getQualificarList(){
	return qualificarList;
}
public void setQualificarList(java.util.List<QualificarDto> qualificarList){
	this.qualificarList=qualificarList;
}
public java.util.List<ArquivoDto> getArquivoList(){
	return arquivoList;
}
public void setArquivoList(java.util.List<ArquivoDto> arquivoList){
	this.arquivoList=arquivoList;
}
public java.util.List<ContaStatusDto> getContaStatusList(){
	return contaStatusList;
}
public void setContaStatusList(java.util.List<ContaStatusDto> contaStatusList){
	this.contaStatusList=contaStatusList;
}
public java.util.List<SecurityContaDto> getSecurityContaList(){
	return securityContaList;
}
public void setSecurityContaList(java.util.List<SecurityContaDto> securityContaList){
	this.securityContaList=securityContaList;
}
}
