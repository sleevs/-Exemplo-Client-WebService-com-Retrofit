package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class PedidoDto implements Serializable{

private Integer pedidoId;
private java.util.Date pedidoData;
private double pedidoValor;
private double pedidoValortotal;
private String pedidoTipo;
private String pedidoDescricao;
private CargaDto cargaCargaId;
private java.util.List<EntregaDto> entregaList;

public PedidoDto(){
}

public PedidoDto(Integer pedidoId, java.util.Date pedidoData, double pedidoValor, double pedidoValortotal, String pedidoTipo, String pedidoDescricao, CargaDto cargaCargaId, java.util.List<EntregaDto> entregaList){
	this.pedidoId=pedidoId;
	this.pedidoData=pedidoData;
	this.pedidoValor=pedidoValor;
	this.pedidoValortotal=pedidoValortotal;
	this.pedidoTipo=pedidoTipo;
	this.pedidoDescricao=pedidoDescricao;
	this.cargaCargaId=cargaCargaId;
	this.entregaList=entregaList;

}
public Integer getPedidoId(){
	return pedidoId;
}
public void setPedidoId(Integer pedidoId){
	this.pedidoId=pedidoId;
}
public java.util.Date getPedidoData(){
	return pedidoData;
}
public void setPedidoData(java.util.Date pedidoData){
	this.pedidoData=pedidoData;
}
public double getPedidoValor(){
	return pedidoValor;
}
public void setPedidoValor(double pedidoValor){
	this.pedidoValor=pedidoValor;
}
public double getPedidoValortotal(){
	return pedidoValortotal;
}
public void setPedidoValortotal(double pedidoValortotal){
	this.pedidoValortotal=pedidoValortotal;
}
public String getPedidoTipo(){
	return pedidoTipo;
}
public void setPedidoTipo(String pedidoTipo){
	this.pedidoTipo=pedidoTipo;
}
public String getPedidoDescricao(){
	return pedidoDescricao;
}
public void setPedidoDescricao(String pedidoDescricao){
	this.pedidoDescricao=pedidoDescricao;
}
public CargaDto getCargaCargaId(){
	return cargaCargaId;
}
public void setCargaCargaId(CargaDto cargaCargaId){
	this.cargaCargaId=cargaCargaId;
}
public java.util.List<EntregaDto> getEntregaList(){
	return entregaList;
}
public void setEntregaList(java.util.List<EntregaDto> entregaList){
	this.entregaList=entregaList;
}
}
