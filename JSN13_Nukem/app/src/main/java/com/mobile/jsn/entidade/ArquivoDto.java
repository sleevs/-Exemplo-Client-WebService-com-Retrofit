package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class ArquivoDto implements Serializable{

private Integer arquivoId;
private String arquivoNome;
private String arquivoTipo;
private String arquivoDescricao;
private String arquivoConteudo;
private Integer arquivoFlag;
private java.util.Date arquivoData;
private java.util.Date arquivoUpdate;
private String arquivoUrl;
private ContaDto contaConta;

public ArquivoDto(){
}

public ArquivoDto(Integer arquivoId, String arquivoNome, String arquivoTipo, String arquivoDescricao, String arquivoConteudo, Integer arquivoFlag, java.util.Date arquivoData, java.util.Date arquivoUpdate, String arquivoUrl, ContaDto contaConta){
	this.arquivoId=arquivoId;
	this.arquivoNome=arquivoNome;
	this.arquivoTipo=arquivoTipo;
	this.arquivoDescricao=arquivoDescricao;
	this.arquivoConteudo=arquivoConteudo;
	this.arquivoFlag=arquivoFlag;
	this.arquivoData=arquivoData;
	this.arquivoUpdate=arquivoUpdate;
	this.arquivoUrl=arquivoUrl;
	this.contaConta=contaConta;

}
public Integer getArquivoId(){
	return arquivoId;
}
public void setArquivoId(Integer arquivoId){
	this.arquivoId=arquivoId;
}
public String getArquivoNome(){
	return arquivoNome;
}
public void setArquivoNome(String arquivoNome){
	this.arquivoNome=arquivoNome;
}
public String getArquivoTipo(){
	return arquivoTipo;
}
public void setArquivoTipo(String arquivoTipo){
	this.arquivoTipo=arquivoTipo;
}
public String getArquivoDescricao(){
	return arquivoDescricao;
}
public void setArquivoDescricao(String arquivoDescricao){
	this.arquivoDescricao=arquivoDescricao;
}
public String getArquivoConteudo(){
	return arquivoConteudo;
}
public void setArquivoConteudo(String arquivoConteudo){
	this.arquivoConteudo=arquivoConteudo;
}
public Integer getArquivoFlag(){
	return arquivoFlag;
}
public void setArquivoFlag(Integer arquivoFlag){
	this.arquivoFlag=arquivoFlag;
}
public java.util.Date getArquivoData(){
	return arquivoData;
}
public void setArquivoData(java.util.Date arquivoData){
	this.arquivoData=arquivoData;
}
public java.util.Date getArquivoUpdate(){
	return arquivoUpdate;
}
public void setArquivoUpdate(java.util.Date arquivoUpdate){
	this.arquivoUpdate=arquivoUpdate;
}
public String getArquivoUrl(){
	return arquivoUrl;
}
public void setArquivoUrl(String arquivoUrl){
	this.arquivoUrl=arquivoUrl;
}
public ContaDto getContaConta(){
	return contaConta;
}
public void setContaConta(ContaDto contaConta){
	this.contaConta=contaConta;
}
}
