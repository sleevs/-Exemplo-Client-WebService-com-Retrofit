package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class ServicoDto implements Serializable{

private Integer servicoId;
private String servicoNome;
private String servicoTipo;
private String servicoCategoria;
private java.util.Date servicoData;
private double servicoValor;
private double servicoTotal;
private java.util.List<ContratoDto> contratoList;
private java.util.List<QualificarDto> qualificarList;
private AnuncioDto anuncioAnuncioId;
private java.util.List<ServicoStatusDto> servicoStatusList;

public ServicoDto(){
}

public ServicoDto(Integer servicoId, String servicoNome, String servicoTipo, String servicoCategoria, java.util.Date servicoData, double servicoValor, double servicoTotal, java.util.List<ContratoDto> contratoList, java.util.List<QualificarDto> qualificarList, AnuncioDto anuncioAnuncioId, java.util.List<ServicoStatusDto> servicoStatusList){
	this.servicoId=servicoId;
	this.servicoNome=servicoNome;
	this.servicoTipo=servicoTipo;
	this.servicoCategoria=servicoCategoria;
	this.servicoData=servicoData;
	this.servicoValor=servicoValor;
	this.servicoTotal=servicoTotal;
	this.contratoList=contratoList;
	this.qualificarList=qualificarList;
	this.anuncioAnuncioId=anuncioAnuncioId;
	this.servicoStatusList=servicoStatusList;

}
public Integer getServicoId(){
	return servicoId;
}
public void setServicoId(Integer servicoId){
	this.servicoId=servicoId;
}
public String getServicoNome(){
	return servicoNome;
}
public void setServicoNome(String servicoNome){
	this.servicoNome=servicoNome;
}
public String getServicoTipo(){
	return servicoTipo;
}
public void setServicoTipo(String servicoTipo){
	this.servicoTipo=servicoTipo;
}
public String getServicoCategoria(){
	return servicoCategoria;
}
public void setServicoCategoria(String servicoCategoria){
	this.servicoCategoria=servicoCategoria;
}
public java.util.Date getServicoData(){
	return servicoData;
}
public void setServicoData(java.util.Date servicoData){
	this.servicoData=servicoData;
}
public double getServicoValor(){
	return servicoValor;
}
public void setServicoValor(double servicoValor){
	this.servicoValor=servicoValor;
}
public double getServicoTotal(){
	return servicoTotal;
}
public void setServicoTotal(double servicoTotal){
	this.servicoTotal=servicoTotal;
}
public java.util.List<ContratoDto> getContratoList(){
	return contratoList;
}
public void setContratoList(java.util.List<ContratoDto> contratoList){
	this.contratoList=contratoList;
}
public java.util.List<QualificarDto> getQualificarList(){
	return qualificarList;
}
public void setQualificarList(java.util.List<QualificarDto> qualificarList){
	this.qualificarList=qualificarList;
}
public AnuncioDto getAnuncioAnuncioId(){
	return anuncioAnuncioId;
}
public void setAnuncioAnuncioId(AnuncioDto anuncioAnuncioId){
	this.anuncioAnuncioId=anuncioAnuncioId;
}
public java.util.List<ServicoStatusDto> getServicoStatusList(){
	return servicoStatusList;
}
public void setServicoStatusList(java.util.List<ServicoStatusDto> servicoStatusList){
	this.servicoStatusList=servicoStatusList;
}
}
