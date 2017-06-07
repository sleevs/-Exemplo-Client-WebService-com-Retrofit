package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class TransporteDto implements Serializable{

private Integer transporteId;
private String transporteNome;
private String transporteTipo;
private String transporteCategoria;
private double transporteValor;
private double transporteCusto;
private double transporteTarifa;
private Integer transporteKm;
private java.util.Date transporteAno;
private String transporteCor;
private String transporteDescricao;
private String transporteImagem;
private java.util.List<CorridaDto> corridaList;

public TransporteDto(){
}

public TransporteDto(Integer transporteId, String transporteNome, String transporteTipo, String transporteCategoria, double transporteValor, double transporteCusto, double transporteTarifa, Integer transporteKm, java.util.Date transporteAno, String transporteCor, String transporteDescricao, String transporteImagem, java.util.List<CorridaDto> corridaList){
	this.transporteId=transporteId;
	this.transporteNome=transporteNome;
	this.transporteTipo=transporteTipo;
	this.transporteCategoria=transporteCategoria;
	this.transporteValor=transporteValor;
	this.transporteCusto=transporteCusto;
	this.transporteTarifa=transporteTarifa;
	this.transporteKm=transporteKm;
	this.transporteAno=transporteAno;
	this.transporteCor=transporteCor;
	this.transporteDescricao=transporteDescricao;
	this.transporteImagem=transporteImagem;
	this.corridaList=corridaList;

}
public Integer getTransporteId(){
	return transporteId;
}
public void setTransporteId(Integer transporteId){
	this.transporteId=transporteId;
}
public String getTransporteNome(){
	return transporteNome;
}
public void setTransporteNome(String transporteNome){
	this.transporteNome=transporteNome;
}
public String getTransporteTipo(){
	return transporteTipo;
}
public void setTransporteTipo(String transporteTipo){
	this.transporteTipo=transporteTipo;
}
public String getTransporteCategoria(){
	return transporteCategoria;
}
public void setTransporteCategoria(String transporteCategoria){
	this.transporteCategoria=transporteCategoria;
}
public double getTransporteValor(){
	return transporteValor;
}
public void setTransporteValor(double transporteValor){
	this.transporteValor=transporteValor;
}
public double getTransporteCusto(){
	return transporteCusto;
}
public void setTransporteCusto(double transporteCusto){
	this.transporteCusto=transporteCusto;
}
public double getTransporteTarifa(){
	return transporteTarifa;
}
public void setTransporteTarifa(double transporteTarifa){
	this.transporteTarifa=transporteTarifa;
}
public Integer getTransporteKm(){
	return transporteKm;
}
public void setTransporteKm(Integer transporteKm){
	this.transporteKm=transporteKm;
}
public java.util.Date getTransporteAno(){
	return transporteAno;
}
public void setTransporteAno(java.util.Date transporteAno){
	this.transporteAno=transporteAno;
}
public String getTransporteCor(){
	return transporteCor;
}
public void setTransporteCor(String transporteCor){
	this.transporteCor=transporteCor;
}
public String getTransporteDescricao(){
	return transporteDescricao;
}
public void setTransporteDescricao(String transporteDescricao){
	this.transporteDescricao=transporteDescricao;
}
public String getTransporteImagem(){
	return transporteImagem;
}
public void setTransporteImagem(String transporteImagem){
	this.transporteImagem=transporteImagem;
}
public java.util.List<CorridaDto> getCorridaList(){
	return corridaList;
}
public void setCorridaList(java.util.List<CorridaDto> corridaList){
	this.corridaList=corridaList;
}
}
