package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class CepDto implements Serializable{

private Integer cepId;
private String cepDescricao;
private String cepNumero;
private String cepLogradouro;
private String cepBairro;
private String cepCidade;
private String cepUf;
private String cepComplemento;
private String cepEndereco;
private String cepPais;
private ContaDto contaContaId;

public CepDto(){
}

public CepDto(Integer cepId, String cepDescricao, String cepNumero, String cepLogradouro, String cepBairro, String cepCidade, String cepUf, String cepComplemento, String cepEndereco, String cepPais, ContaDto contaContaId){
	this.cepId=cepId;
	this.cepDescricao=cepDescricao;
	this.cepNumero=cepNumero;
	this.cepLogradouro=cepLogradouro;
	this.cepBairro=cepBairro;
	this.cepCidade=cepCidade;
	this.cepUf=cepUf;
	this.cepComplemento=cepComplemento;
	this.cepEndereco=cepEndereco;
	this.cepPais=cepPais;
	this.contaContaId=contaContaId;

}
public Integer getCepId(){
	return cepId;
}
public void setCepId(Integer cepId){
	this.cepId=cepId;
}
public String getCepDescricao(){
	return cepDescricao;
}
public void setCepDescricao(String cepDescricao){
	this.cepDescricao=cepDescricao;
}
public String getCepNumero(){
	return cepNumero;
}
public void setCepNumero(String cepNumero){
	this.cepNumero=cepNumero;
}
public String getCepLogradouro(){
	return cepLogradouro;
}
public void setCepLogradouro(String cepLogradouro){
	this.cepLogradouro=cepLogradouro;
}
public String getCepBairro(){
	return cepBairro;
}
public void setCepBairro(String cepBairro){
	this.cepBairro=cepBairro;
}
public String getCepCidade(){
	return cepCidade;
}
public void setCepCidade(String cepCidade){
	this.cepCidade=cepCidade;
}
public String getCepUf(){
	return cepUf;
}
public void setCepUf(String cepUf){
	this.cepUf=cepUf;
}
public String getCepComplemento(){
	return cepComplemento;
}
public void setCepComplemento(String cepComplemento){
	this.cepComplemento=cepComplemento;
}
public String getCepEndereco(){
	return cepEndereco;
}
public void setCepEndereco(String cepEndereco){
	this.cepEndereco=cepEndereco;
}
public String getCepPais(){
	return cepPais;
}
public void setCepPais(String cepPais){
	this.cepPais=cepPais;
}
public ContaDto getContaContaId(){
	return contaContaId;
}
public void setContaContaId(ContaDto contaContaId){
	this.contaContaId=contaContaId;
}
}
