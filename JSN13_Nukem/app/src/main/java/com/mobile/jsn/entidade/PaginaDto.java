package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class PaginaDto implements Serializable{

private Integer paginaId;
private String paginaTipo;
private String paginaCategoria;
private String paginaUrl;
private String paginaEndereco;
private java.util.List<AnuncioDto> anuncioList;

public PaginaDto(){
}

public PaginaDto(Integer paginaId, String paginaTipo, String paginaCategoria, String paginaUrl, String paginaEndereco, java.util.List<AnuncioDto> anuncioList){
	this.paginaId=paginaId;
	this.paginaTipo=paginaTipo;
	this.paginaCategoria=paginaCategoria;
	this.paginaUrl=paginaUrl;
	this.paginaEndereco=paginaEndereco;
	this.anuncioList=anuncioList;

}
public Integer getPaginaId(){
	return paginaId;
}
public void setPaginaId(Integer paginaId){
	this.paginaId=paginaId;
}
public String getPaginaTipo(){
	return paginaTipo;
}
public void setPaginaTipo(String paginaTipo){
	this.paginaTipo=paginaTipo;
}
public String getPaginaCategoria(){
	return paginaCategoria;
}
public void setPaginaCategoria(String paginaCategoria){
	this.paginaCategoria=paginaCategoria;
}
public String getPaginaUrl(){
	return paginaUrl;
}
public void setPaginaUrl(String paginaUrl){
	this.paginaUrl=paginaUrl;
}
public String getPaginaEndereco(){
	return paginaEndereco;
}
public void setPaginaEndereco(String paginaEndereco){
	this.paginaEndereco=paginaEndereco;
}
public java.util.List<AnuncioDto> getAnuncioList(){
	return anuncioList;
}
public void setAnuncioList(java.util.List<AnuncioDto> anuncioList){
	this.anuncioList=anuncioList;
}
}
