package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class MoedaDto implements Serializable{

private Integer moedaId;
private String moedaTipo;
private String moedaNome;
private String moedaCotacao;
private String moedaValor;
private String moedaTarifa;
private String moedaPais;
private java.util.List<MoedaPagamentoDto> moedaPagamentoList;

public MoedaDto(){
}

public MoedaDto(Integer moedaId, String moedaTipo, String moedaNome, String moedaCotacao, String moedaValor, String moedaTarifa, String moedaPais, java.util.List<MoedaPagamentoDto> moedaPagamentoList){
	this.moedaId=moedaId;
	this.moedaTipo=moedaTipo;
	this.moedaNome=moedaNome;
	this.moedaCotacao=moedaCotacao;
	this.moedaValor=moedaValor;
	this.moedaTarifa=moedaTarifa;
	this.moedaPais=moedaPais;
	this.moedaPagamentoList=moedaPagamentoList;

}
public Integer getMoedaId(){
	return moedaId;
}
public void setMoedaId(Integer moedaId){
	this.moedaId=moedaId;
}
public String getMoedaTipo(){
	return moedaTipo;
}
public void setMoedaTipo(String moedaTipo){
	this.moedaTipo=moedaTipo;
}
public String getMoedaNome(){
	return moedaNome;
}
public void setMoedaNome(String moedaNome){
	this.moedaNome=moedaNome;
}
public String getMoedaCotacao(){
	return moedaCotacao;
}
public void setMoedaCotacao(String moedaCotacao){
	this.moedaCotacao=moedaCotacao;
}
public String getMoedaValor(){
	return moedaValor;
}
public void setMoedaValor(String moedaValor){
	this.moedaValor=moedaValor;
}
public String getMoedaTarifa(){
	return moedaTarifa;
}
public void setMoedaTarifa(String moedaTarifa){
	this.moedaTarifa=moedaTarifa;
}
public String getMoedaPais(){
	return moedaPais;
}
public void setMoedaPais(String moedaPais){
	this.moedaPais=moedaPais;
}
public java.util.List<MoedaPagamentoDto> getMoedaPagamentoList(){
	return moedaPagamentoList;
}
public void setMoedaPagamentoList(java.util.List<MoedaPagamentoDto> moedaPagamentoList){
	this.moedaPagamentoList=moedaPagamentoList;
}
}
