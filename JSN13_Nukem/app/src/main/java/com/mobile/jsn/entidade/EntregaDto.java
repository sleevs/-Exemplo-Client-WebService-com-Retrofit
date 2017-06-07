package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class EntregaDto implements Serializable{

private Integer entregaId;
private java.util.Date entregaData;
private double entregaValor;
private double entregaValortotal;
private String entregaTipo;
private String entregaCategoria;
private String entregaDescricao;
private PedidoDto pedidoPedidoId;
private RotaDto rotaRotaId;
private java.util.List<EntregaServicoDto> entregaServicoList;
private java.util.List<EntregaStatusDto> entregaStatusList;

public EntregaDto(){
}

public EntregaDto(Integer entregaId, java.util.Date entregaData, double entregaValor, double entregaValortotal, String entregaTipo, String entregaCategoria, String entregaDescricao, PedidoDto pedidoPedidoId,RotaDto rotaRotaId, java.util.List<EntregaServicoDto> entregaServicoList, java.util.List<EntregaStatusDto> entregaStatusList){
	this.entregaId=entregaId;
	this.entregaData=entregaData;
	this.entregaValor=entregaValor;
	this.entregaValortotal=entregaValortotal;
	this.entregaTipo=entregaTipo;
	this.entregaCategoria=entregaCategoria;
	this.entregaDescricao=entregaDescricao;
	this.pedidoPedidoId=pedidoPedidoId;
	this.rotaRotaId=rotaRotaId;
	this.entregaServicoList=entregaServicoList;
	this.entregaStatusList=entregaStatusList;

}
public Integer getEntregaId(){
	return entregaId;
}
public void setEntregaId(Integer entregaId){
	this.entregaId=entregaId;
}
public java.util.Date getEntregaData(){
	return entregaData;
}
public void setEntregaData(java.util.Date entregaData){
	this.entregaData=entregaData;
}
public double getEntregaValor(){
	return entregaValor;
}
public void setEntregaValor(double entregaValor){
	this.entregaValor=entregaValor;
}
public double getEntregaValortotal(){
	return entregaValortotal;
}
public void setEntregaValortotal(double entregaValortotal){
	this.entregaValortotal=entregaValortotal;
}
public String getEntregaTipo(){
	return entregaTipo;
}
public void setEntregaTipo(String entregaTipo){
	this.entregaTipo=entregaTipo;
}
public String getEntregaCategoria(){
	return entregaCategoria;
}
public void setEntregaCategoria(String entregaCategoria){
	this.entregaCategoria=entregaCategoria;
}
public String getEntregaDescricao(){
	return entregaDescricao;
}
public void setEntregaDescricao(String entregaDescricao){
	this.entregaDescricao=entregaDescricao;
}
public PedidoDto getPedidoPedidoId(){
	return pedidoPedidoId;
}
public void setPedidoPedidoId(PedidoDto pedidoPedidoId){
	this.pedidoPedidoId=pedidoPedidoId;
}
public RotaDto getRotaRotaId(){
	return rotaRotaId;
}
public void setRotaRotaId(RotaDto rotaRotaId){
	this.rotaRotaId=rotaRotaId;
}
public java.util.List<EntregaServicoDto> getEntregaServicoList(){
	return entregaServicoList;
}
public void setEntregaServicoList(java.util.List<EntregaServicoDto> entregaServicoList){
	this.entregaServicoList=entregaServicoList;
}
public java.util.List<EntregaStatusDto> getEntregaStatusList(){
	return entregaStatusList;
}
public void setEntregaStatusList(java.util.List<EntregaStatusDto> entregaStatusList){
	this.entregaStatusList=entregaStatusList;
}
}
