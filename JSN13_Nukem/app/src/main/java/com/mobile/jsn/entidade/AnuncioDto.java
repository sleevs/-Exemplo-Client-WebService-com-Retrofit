package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class AnuncioDto implements Serializable{

private Integer anuncioId;
private String anuncioTipo;
private String anuncioCategoria;
private String anuncioDescricao;
private java.util.Date anuncioData;
private String anuncioImagem;
private String anuncioTempo;
private java.util.List<DocumentoDto> documentoList;
private java.util.List<AnuncioStatusDto> anuncioStatusList;
private ContaDto contaConta;
private PaginaDto paginaPaginaId;
private java.util.List<ServicoDto> servicoList;

public AnuncioDto(){
}

public AnuncioDto(Integer anuncioId, String anuncioTipo, String anuncioCategoria, String anuncioDescricao, java.util.Date anuncioData, String anuncioImagem, String anuncioTempo, java.util.List<DocumentoDto> documentoList, java.util.List<AnuncioStatusDto> anuncioStatusList, ContaDto contaConta, PaginaDto paginaPaginaId, java.util.List<ServicoDto> servicoList){
	this.anuncioId=anuncioId;
	this.anuncioTipo=anuncioTipo;
	this.anuncioCategoria=anuncioCategoria;
	this.anuncioDescricao=anuncioDescricao;
	this.anuncioData=anuncioData;
	this.anuncioImagem=anuncioImagem;
	this.anuncioTempo=anuncioTempo;
	this.documentoList=documentoList;
	this.anuncioStatusList=anuncioStatusList;
	this.contaConta=contaConta;
	this.paginaPaginaId=paginaPaginaId;
	this.servicoList=servicoList;

}
public Integer getAnuncioId(){
	return anuncioId;
}
public void setAnuncioId(Integer anuncioId){
	this.anuncioId=anuncioId;
}
public String getAnuncioTipo(){
	return anuncioTipo;
}
public void setAnuncioTipo(String anuncioTipo){
	this.anuncioTipo=anuncioTipo;
}
public String getAnuncioCategoria(){
	return anuncioCategoria;
}
public void setAnuncioCategoria(String anuncioCategoria){
	this.anuncioCategoria=anuncioCategoria;
}
public String getAnuncioDescricao(){
	return anuncioDescricao;
}
public void setAnuncioDescricao(String anuncioDescricao){
	this.anuncioDescricao=anuncioDescricao;
}
public java.util.Date getAnuncioData(){
	return anuncioData;
}
public void setAnuncioData(java.util.Date anuncioData){
	this.anuncioData=anuncioData;
}
public String getAnuncioImagem(){
	return anuncioImagem;
}
public void setAnuncioImagem(String anuncioImagem){
	this.anuncioImagem=anuncioImagem;
}
public String getAnuncioTempo(){
	return anuncioTempo;
}
public void setAnuncioTempo(String anuncioTempo){
	this.anuncioTempo=anuncioTempo;
}
public java.util.List<DocumentoDto> getDocumentoList(){
	return documentoList;
}
public void setDocumentoList(java.util.List<DocumentoDto> documentoList){
	this.documentoList=documentoList;
}
public java.util.List<AnuncioStatusDto> getAnuncioStatusList(){
	return anuncioStatusList;
}
public void setAnuncioStatusList(java.util.List<AnuncioStatusDto> anuncioStatusList){
	this.anuncioStatusList=anuncioStatusList;
}
public ContaDto getContaConta(){
	return contaConta;
}
public void setContaConta(ContaDto contaConta){
	this.contaConta=contaConta;
}
public PaginaDto getPaginaPaginaId(){
	return paginaPaginaId;
}
public void setPaginaPaginaId(PaginaDto paginaPaginaId){
	this.paginaPaginaId=paginaPaginaId;
}
public java.util.List<ServicoDto> getServicoList(){
	return servicoList;
}
public void setServicoList(java.util.List<ServicoDto> servicoList){
	this.servicoList=servicoList;
}
}
