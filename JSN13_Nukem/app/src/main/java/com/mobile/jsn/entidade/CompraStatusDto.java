package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
public class CompraStatusDto implements Serializable{

private Integer compraStatusId;
private String compraStatusTipo;
private java.util.Date compraStatusUpdate;
private Integer compraStatusFlag;
private CompraDto compraCompraId;

public CompraStatusDto(){
}


	public CompraStatusDto(Integer compraStatusId, String compraStatusTipo, Date compraStatusUpdate, Integer compraStatusFlag, CompraDto compraCompraId) {
		this.compraStatusId = compraStatusId;
		this.compraStatusTipo = compraStatusTipo;
		this.compraStatusUpdate = compraStatusUpdate;
		this.compraStatusFlag = compraStatusFlag;
		this.compraCompraId = compraCompraId;
	}


	public Integer getCompraStatusId() {
		return compraStatusId;
	}

	public void setCompraStatusId(Integer compraStatusId) {
		this.compraStatusId = compraStatusId;
	}

	public String getCompraStatusTipo() {
		return compraStatusTipo;
	}

	public void setCompraStatusTipo(String compraStatusTipo) {
		this.compraStatusTipo = compraStatusTipo;
	}

	public Date getCompraStatusUpdate() {
		return compraStatusUpdate;
	}

	public void setCompraStatusUpdate(Date compraStatusUpdate) {
		this.compraStatusUpdate = compraStatusUpdate;
	}

	public Integer getCompraStatusFlag() {
		return compraStatusFlag;
	}

	public void setCompraStatusFlag(Integer compraStatusFlag) {
		this.compraStatusFlag = compraStatusFlag;
	}

	public CompraDto getCompraCompraId() {
		return compraCompraId;
	}

	public void setCompraCompraId(CompraDto compraCompraId) {
		this.compraCompraId = compraCompraId;
	}
}
