package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class DestinoDto implements Serializable{

private Integer destinoId;
private String destinoPartidaCep;
private String destinoPartidaNome;
private String destinoPartidaCidade;
private String destinoPartidaUf;
private String destinoPartidaLogradouro;
private String destinoPartidaBairro;
private String destinoPartidaComplemento;
private String destinoPartidaPais;
private double destinoDistancia;
private double destinoTempo;
private java.util.Date destinoData;
private String destinoFinalCep;
private String destinoFinalPais;
private String destinoFinalComplemento;
private String destinoFinalBairro;
private String destinoFinalCidade;
private String destinoFinalUf;
private java.util.List<CorridaDto> corridaList;

public DestinoDto(){
}

public DestinoDto(Integer destinoId, String destinoPartidaCep, String destinoPartidaNome, String destinoPartidaCidade, String destinoPartidaUf, String destinoPartidaLogradouro, String destinoPartidaBairro, String destinoPartidaComplemento, String destinoPartidaPais, double destinoDistancia, double destinoTempo, java.util.Date destinoData, String destinoFinalCep, String destinoFinalPais, String destinoFinalComplemento, String destinoFinalBairro, String destinoFinalCidade, String destinoFinalUf, java.util.List<CorridaDto> corridaList){
	this.destinoId=destinoId;
	this.destinoPartidaCep=destinoPartidaCep;
	this.destinoPartidaNome=destinoPartidaNome;
	this.destinoPartidaCidade=destinoPartidaCidade;
	this.destinoPartidaUf=destinoPartidaUf;
	this.destinoPartidaLogradouro=destinoPartidaLogradouro;
	this.destinoPartidaBairro=destinoPartidaBairro;
	this.destinoPartidaComplemento=destinoPartidaComplemento;
	this.destinoPartidaPais=destinoPartidaPais;
	this.destinoDistancia=destinoDistancia;
	this.destinoTempo=destinoTempo;
	this.destinoData=destinoData;
	this.destinoFinalCep=destinoFinalCep;
	this.destinoFinalPais=destinoFinalPais;
	this.destinoFinalComplemento=destinoFinalComplemento;
	this.destinoFinalBairro=destinoFinalBairro;
	this.destinoFinalCidade=destinoFinalCidade;
	this.destinoFinalUf=destinoFinalUf;
	this.corridaList=corridaList;

}
public Integer getDestinoId(){
	return destinoId;
}
public void setDestinoId(Integer destinoId){
	this.destinoId=destinoId;
}
public String getDestinoPartidaCep(){
	return destinoPartidaCep;
}
public void setDestinoPartidaCep(String destinoPartidaCep){
	this.destinoPartidaCep=destinoPartidaCep;
}
public String getDestinoPartidaNome(){
	return destinoPartidaNome;
}
public void setDestinoPartidaNome(String destinoPartidaNome){
	this.destinoPartidaNome=destinoPartidaNome;
}
public String getDestinoPartidaCidade(){
	return destinoPartidaCidade;
}
public void setDestinoPartidaCidade(String destinoPartidaCidade){
	this.destinoPartidaCidade=destinoPartidaCidade;
}
public String getDestinoPartidaUf(){
	return destinoPartidaUf;
}
public void setDestinoPartidaUf(String destinoPartidaUf){
	this.destinoPartidaUf=destinoPartidaUf;
}
public String getDestinoPartidaLogradouro(){
	return destinoPartidaLogradouro;
}
public void setDestinoPartidaLogradouro(String destinoPartidaLogradouro){
	this.destinoPartidaLogradouro=destinoPartidaLogradouro;
}
public String getDestinoPartidaBairro(){
	return destinoPartidaBairro;
}
public void setDestinoPartidaBairro(String destinoPartidaBairro){
	this.destinoPartidaBairro=destinoPartidaBairro;
}
public String getDestinoPartidaComplemento(){
	return destinoPartidaComplemento;
}
public void setDestinoPartidaComplemento(String destinoPartidaComplemento){
	this.destinoPartidaComplemento=destinoPartidaComplemento;
}
public String getDestinoPartidaPais(){
	return destinoPartidaPais;
}
public void setDestinoPartidaPais(String destinoPartidaPais){
	this.destinoPartidaPais=destinoPartidaPais;
}
public double getDestinoDistancia(){
	return destinoDistancia;
}
public void setDestinoDistancia(double destinoDistancia){
	this.destinoDistancia=destinoDistancia;
}
public double getDestinoTempo(){
	return destinoTempo;
}
public void setDestinoTempo(double destinoTempo){
	this.destinoTempo=destinoTempo;
}
public java.util.Date getDestinoData(){
	return destinoData;
}
public void setDestinoData(java.util.Date destinoData){
	this.destinoData=destinoData;
}
public String getDestinoFinalCep(){
	return destinoFinalCep;
}
public void setDestinoFinalCep(String destinoFinalCep){
	this.destinoFinalCep=destinoFinalCep;
}
public String getDestinoFinalPais(){
	return destinoFinalPais;
}
public void setDestinoFinalPais(String destinoFinalPais){
	this.destinoFinalPais=destinoFinalPais;
}
public String getDestinoFinalComplemento(){
	return destinoFinalComplemento;
}
public void setDestinoFinalComplemento(String destinoFinalComplemento){
	this.destinoFinalComplemento=destinoFinalComplemento;
}
public String getDestinoFinalBairro(){
	return destinoFinalBairro;
}
public void setDestinoFinalBairro(String destinoFinalBairro){
	this.destinoFinalBairro=destinoFinalBairro;
}
public String getDestinoFinalCidade(){
	return destinoFinalCidade;
}
public void setDestinoFinalCidade(String destinoFinalCidade){
	this.destinoFinalCidade=destinoFinalCidade;
}
public String getDestinoFinalUf(){
	return destinoFinalUf;
}
public void setDestinoFinalUf(String destinoFinalUf){
	this.destinoFinalUf=destinoFinalUf;
}
public java.util.List<CorridaDto> getCorridaList(){
	return corridaList;
}
public void setCorridaList(java.util.List<CorridaDto> corridaList){
	this.corridaList=corridaList;
}
}
