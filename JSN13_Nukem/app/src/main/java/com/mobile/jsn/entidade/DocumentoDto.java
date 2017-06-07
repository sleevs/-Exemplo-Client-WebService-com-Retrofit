package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class DocumentoDto implements Serializable{

private Integer documentoId;
private String documentoNome;
private String documentoOrigem;
private String documentoTipo;
private String documentoPdf;
private String documentoAnexo;
private java.util.Date documentoData;
private AnuncioDto anuncioAnuncioId;

public DocumentoDto(){
}

public DocumentoDto(Integer documentoId, String documentoNome, String documentoOrigem, String documentoTipo, String documentoPdf, String documentoAnexo, java.util.Date documentoData, AnuncioDto anuncioAnuncioId){
	this.documentoId=documentoId;
	this.documentoNome=documentoNome;
	this.documentoOrigem=documentoOrigem;
	this.documentoTipo=documentoTipo;
	this.documentoPdf=documentoPdf;
	this.documentoAnexo=documentoAnexo;
	this.documentoData=documentoData;
	this.anuncioAnuncioId=anuncioAnuncioId;

}
public Integer getDocumentoId(){
	return documentoId;
}
public void setDocumentoId(Integer documentoId){
	this.documentoId=documentoId;
}
public String getDocumentoNome(){
	return documentoNome;
}
public void setDocumentoNome(String documentoNome){
	this.documentoNome=documentoNome;
}
public String getDocumentoOrigem(){
	return documentoOrigem;
}
public void setDocumentoOrigem(String documentoOrigem){
	this.documentoOrigem=documentoOrigem;
}
public String getDocumentoTipo(){
	return documentoTipo;
}
public void setDocumentoTipo(String documentoTipo){
	this.documentoTipo=documentoTipo;
}
public String getDocumentoPdf(){
	return documentoPdf;
}
public void setDocumentoPdf(String documentoPdf){
	this.documentoPdf=documentoPdf;
}
public String getDocumentoAnexo(){
	return documentoAnexo;
}
public void setDocumentoAnexo(String documentoAnexo){
	this.documentoAnexo=documentoAnexo;
}
public java.util.Date getDocumentoData(){
	return documentoData;
}
public void setDocumentoData(java.util.Date documentoData){
	this.documentoData=documentoData;
}
public AnuncioDto getAnuncioAnuncioId(){
	return anuncioAnuncioId;
}
public void setAnuncioAnuncioId(AnuncioDto anuncioAnuncioId){
	this.anuncioAnuncioId=anuncioAnuncioId;
}
}
