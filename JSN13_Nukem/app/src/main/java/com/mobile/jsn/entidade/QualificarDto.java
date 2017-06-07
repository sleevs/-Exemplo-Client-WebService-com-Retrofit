package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class QualificarDto implements Serializable{

private Integer qualificarId;
private String qualificarTipo;
private String qualificarCategoria;
private Integer qualificarValor;
private Integer qualificarAtendimento;
private Integer qualificarPontualidade;
private Integer qualificarServico;
private Integer qualificarProfissional;
private String qualificarDescricao;
private ContaDto contaConta;
private ServicoDto servicoServicoId;

public QualificarDto(){
}

public QualificarDto(Integer qualificarId, String qualificarTipo, String qualificarCategoria, Integer qualificarValor, Integer qualificarAtendimento, Integer qualificarPontualidade, Integer qualificarServico, Integer qualificarProfissional, String qualificarDescricao, ContaDto contaConta, ServicoDto servicoServicoId){
	this.qualificarId=qualificarId;
	this.qualificarTipo=qualificarTipo;
	this.qualificarCategoria=qualificarCategoria;
	this.qualificarValor=qualificarValor;
	this.qualificarAtendimento=qualificarAtendimento;
	this.qualificarPontualidade=qualificarPontualidade;
	this.qualificarServico=qualificarServico;
	this.qualificarProfissional=qualificarProfissional;
	this.qualificarDescricao=qualificarDescricao;
	this.contaConta=contaConta;
	this.servicoServicoId=servicoServicoId;

}
public Integer getQualificarId(){
	return qualificarId;
}
public void setQualificarId(Integer qualificarId){
	this.qualificarId=qualificarId;
}
public String getQualificarTipo(){
	return qualificarTipo;
}
public void setQualificarTipo(String qualificarTipo){
	this.qualificarTipo=qualificarTipo;
}
public String getQualificarCategoria(){
	return qualificarCategoria;
}
public void setQualificarCategoria(String qualificarCategoria){
	this.qualificarCategoria=qualificarCategoria;
}
public Integer getQualificarValor(){
	return qualificarValor;
}
public void setQualificarValor(Integer qualificarValor){
	this.qualificarValor=qualificarValor;
}
public Integer getQualificarAtendimento(){
	return qualificarAtendimento;
}
public void setQualificarAtendimento(Integer qualificarAtendimento){
	this.qualificarAtendimento=qualificarAtendimento;
}
public Integer getQualificarPontualidade(){
	return qualificarPontualidade;
}
public void setQualificarPontualidade(Integer qualificarPontualidade){
	this.qualificarPontualidade=qualificarPontualidade;
}
public Integer getQualificarServico(){
	return qualificarServico;
}
public void setQualificarServico(Integer qualificarServico){
	this.qualificarServico=qualificarServico;
}
public Integer getQualificarProfissional(){
	return qualificarProfissional;
}
public void setQualificarProfissional(Integer qualificarProfissional){
	this.qualificarProfissional=qualificarProfissional;
}
public String getQualificarDescricao(){
	return qualificarDescricao;
}
public void setQualificarDescricao(String qualificarDescricao){
	this.qualificarDescricao=qualificarDescricao;
}
public ContaDto getContaConta(){
	return contaConta;
}
public void setContaConta(ContaDto contaConta){
	this.contaConta=contaConta;
}
public ServicoDto getServicoServicoId(){
	return servicoServicoId;
}
public void setServicoServicoId(ServicoDto servicoServicoId){
	this.servicoServicoId=servicoServicoId;
}
}
