package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class RotaDto implements Serializable{

private Integer rotaId;
private String rotaOrigemLogradouro;
private String rotaOrigemCep;
private String rotaOrigemCidade;
private String rotaOrigemUf;
private String rotaOrigemBairro;
private String rotaOrigemPais;
private String rotaOrigemComplemento;
private String rotaDestinoCep;
private String rotaDestinoLogradouro;
private String rotaDestinoUf;
private String rotaDestinoCidade;
private String rotaDestinoBairro;
private String rotaDestinoPais;
private String rotaDestinoComplemento;
private String rotaTipo;
private Integer rotaFlag;
private String rotaCategoria;
private java.util.Date rotaDataSaida;
private java.util.Date rotaDataChegada;
private String rotaDescricao;
private java.util.List<EntregaDto> entregaList;

public RotaDto(){
}

public RotaDto(Integer rotaId, String rotaOrigemLogradouro, String rotaOrigemCep, String rotaOrigemCidade, String rotaOrigemUf, String rotaOrigemBairro, String rotaOrigemPais, String rotaOrigemComplemento, String rotaDestinoCep, String rotaDestinoLogradouro, String rotaDestinoUf, String rotaDestinoCidade, String rotaDestinoBairro, String rotaDestinoPais, String rotaDestinoComplemento, String rotaTipo, Integer rotaFlag, String rotaCategoria, java.util.Date rotaDataSaida, java.util.Date rotaDataChegada, String rotaDescricao, java.util.List<EntregaDto> entregaList){
	this.rotaId=rotaId;
	this.rotaOrigemLogradouro=rotaOrigemLogradouro;
	this.rotaOrigemCep=rotaOrigemCep;
	this.rotaOrigemCidade=rotaOrigemCidade;
	this.rotaOrigemUf=rotaOrigemUf;
	this.rotaOrigemBairro=rotaOrigemBairro;
	this.rotaOrigemPais=rotaOrigemPais;
	this.rotaOrigemComplemento=rotaOrigemComplemento;
	this.rotaDestinoCep=rotaDestinoCep;
	this.rotaDestinoLogradouro=rotaDestinoLogradouro;
	this.rotaDestinoUf=rotaDestinoUf;
	this.rotaDestinoCidade=rotaDestinoCidade;
	this.rotaDestinoBairro=rotaDestinoBairro;
	this.rotaDestinoPais=rotaDestinoPais;
	this.rotaDestinoComplemento=rotaDestinoComplemento;
	this.rotaTipo=rotaTipo;
	this.rotaFlag=rotaFlag;
	this.rotaCategoria=rotaCategoria;
	this.rotaDataSaida=rotaDataSaida;
	this.rotaDataChegada=rotaDataChegada;
	this.rotaDescricao=rotaDescricao;
	this.entregaList=entregaList;

}
public Integer getRotaId(){
	return rotaId;
}
public void setRotaId(Integer rotaId){
	this.rotaId=rotaId;
}
public String getRotaOrigemLogradouro(){
	return rotaOrigemLogradouro;
}
public void setRotaOrigemLogradouro(String rotaOrigemLogradouro){
	this.rotaOrigemLogradouro=rotaOrigemLogradouro;
}
public String getRotaOrigemCep(){
	return rotaOrigemCep;
}
public void setRotaOrigemCep(String rotaOrigemCep){
	this.rotaOrigemCep=rotaOrigemCep;
}
public String getRotaOrigemCidade(){
	return rotaOrigemCidade;
}
public void setRotaOrigemCidade(String rotaOrigemCidade){
	this.rotaOrigemCidade=rotaOrigemCidade;
}
public String getRotaOrigemUf(){
	return rotaOrigemUf;
}
public void setRotaOrigemUf(String rotaOrigemUf){
	this.rotaOrigemUf=rotaOrigemUf;
}
public String getRotaOrigemBairro(){
	return rotaOrigemBairro;
}
public void setRotaOrigemBairro(String rotaOrigemBairro){
	this.rotaOrigemBairro=rotaOrigemBairro;
}
public String getRotaOrigemPais(){
	return rotaOrigemPais;
}
public void setRotaOrigemPais(String rotaOrigemPais){
	this.rotaOrigemPais=rotaOrigemPais;
}
public String getRotaOrigemComplemento(){
	return rotaOrigemComplemento;
}
public void setRotaOrigemComplemento(String rotaOrigemComplemento){
	this.rotaOrigemComplemento=rotaOrigemComplemento;
}
public String getRotaDestinoCep(){
	return rotaDestinoCep;
}
public void setRotaDestinoCep(String rotaDestinoCep){
	this.rotaDestinoCep=rotaDestinoCep;
}
public String getRotaDestinoLogradouro(){
	return rotaDestinoLogradouro;
}
public void setRotaDestinoLogradouro(String rotaDestinoLogradouro){
	this.rotaDestinoLogradouro=rotaDestinoLogradouro;
}
public String getRotaDestinoUf(){
	return rotaDestinoUf;
}
public void setRotaDestinoUf(String rotaDestinoUf){
	this.rotaDestinoUf=rotaDestinoUf;
}
public String getRotaDestinoCidade(){
	return rotaDestinoCidade;
}
public void setRotaDestinoCidade(String rotaDestinoCidade){
	this.rotaDestinoCidade=rotaDestinoCidade;
}
public String getRotaDestinoBairro(){
	return rotaDestinoBairro;
}
public void setRotaDestinoBairro(String rotaDestinoBairro){
	this.rotaDestinoBairro=rotaDestinoBairro;
}
public String getRotaDestinoPais(){
	return rotaDestinoPais;
}
public void setRotaDestinoPais(String rotaDestinoPais){
	this.rotaDestinoPais=rotaDestinoPais;
}
public String getRotaDestinoComplemento(){
	return rotaDestinoComplemento;
}
public void setRotaDestinoComplemento(String rotaDestinoComplemento){
	this.rotaDestinoComplemento=rotaDestinoComplemento;
}
public String getRotaTipo(){
	return rotaTipo;
}
public void setRotaTipo(String rotaTipo){
	this.rotaTipo=rotaTipo;
}
public Integer getRotaFlag(){
	return rotaFlag;
}
public void setRotaFlag(Integer rotaFlag){
	this.rotaFlag=rotaFlag;
}
public String getRotaCategoria(){
	return rotaCategoria;
}
public void setRotaCategoria(String rotaCategoria){
	this.rotaCategoria=rotaCategoria;
}
public java.util.Date getRotaDataSaida(){
	return rotaDataSaida;
}
public void setRotaDataSaida(java.util.Date rotaDataSaida){
	this.rotaDataSaida=rotaDataSaida;
}
public java.util.Date getRotaDataChegada(){
	return rotaDataChegada;
}
public void setRotaDataChegada(java.util.Date rotaDataChegada){
	this.rotaDataChegada=rotaDataChegada;
}
public String getRotaDescricao(){
	return rotaDescricao;
}
public void setRotaDescricao(String rotaDescricao){
	this.rotaDescricao=rotaDescricao;
}
public java.util.List<EntregaDto> getEntregaList(){
	return entregaList;
}
public void setEntregaList(java.util.List<EntregaDto> entregaList){
	this.entregaList=entregaList;
}
}
