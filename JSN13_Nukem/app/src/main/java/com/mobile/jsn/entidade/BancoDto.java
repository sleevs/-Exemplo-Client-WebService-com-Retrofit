package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class BancoDto implements Serializable{

private Integer bancoId;
private String bancoAgencia;
private String bancoConta;
private String bancoTipo;
private String bancoCategoria;
private String bancoNome;
private String bancoTransacao;
private String bancoTarifa;
private java.util.List<BancoPagamentoDto> bancoPagamentoList;

public BancoDto(){
}

public BancoDto(Integer bancoId, String bancoAgencia, String bancoConta, String bancoTipo, String bancoCategoria, String bancoNome, String bancoTransacao, String bancoTarifa, java.util.List<BancoPagamentoDto> bancoPagamentoList){
	this.bancoId=bancoId;
	this.bancoAgencia=bancoAgencia;
	this.bancoConta=bancoConta;
	this.bancoTipo=bancoTipo;
	this.bancoCategoria=bancoCategoria;
	this.bancoNome=bancoNome;
	this.bancoTransacao=bancoTransacao;
	this.bancoTarifa=bancoTarifa;
	this.bancoPagamentoList=bancoPagamentoList;

}
public Integer getBancoId(){
	return bancoId;
}
public void setBancoId(Integer bancoId){
	this.bancoId=bancoId;
}
public String getBancoAgencia(){
	return bancoAgencia;
}
public void setBancoAgencia(String bancoAgencia){
	this.bancoAgencia=bancoAgencia;
}
public String getBancoConta(){
	return bancoConta;
}
public void setBancoConta(String bancoConta){
	this.bancoConta=bancoConta;
}
public String getBancoTipo(){
	return bancoTipo;
}
public void setBancoTipo(String bancoTipo){
	this.bancoTipo=bancoTipo;
}
public String getBancoCategoria(){
	return bancoCategoria;
}
public void setBancoCategoria(String bancoCategoria){
	this.bancoCategoria=bancoCategoria;
}
public String getBancoNome(){
	return bancoNome;
}
public void setBancoNome(String bancoNome){
	this.bancoNome=bancoNome;
}
public String getBancoTransacao(){
	return bancoTransacao;
}
public void setBancoTransacao(String bancoTransacao){
	this.bancoTransacao=bancoTransacao;
}
public String getBancoTarifa(){
	return bancoTarifa;
}
public void setBancoTarifa(String bancoTarifa){
	this.bancoTarifa=bancoTarifa;
}
public java.util.List<BancoPagamentoDto> getBancoPagamentoList(){
	return bancoPagamentoList;
}
public void setBancoPagamentoList(java.util.List<BancoPagamentoDto> bancoPagamentoList){
	this.bancoPagamentoList=bancoPagamentoList;
}
}
