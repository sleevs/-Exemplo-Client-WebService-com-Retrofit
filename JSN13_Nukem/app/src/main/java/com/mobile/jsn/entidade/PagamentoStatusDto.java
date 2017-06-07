package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
public class PagamentoStatusDto implements Serializable{

private Integer pagamentoStatus;
private java.util.Date pagamentoStatusUpdate;
private String pagamentoStatusTipo;
private Integer pagamentoStatusFlag;
private PagamentoDto pagamentoPagamentoId;

public PagamentoStatusDto(){
}


	public PagamentoStatusDto(Integer pagamentoStatus, Date pagamentoStatusUpdate, String pagamentoStatusTipo, Integer pagamentoStatusFlag, PagamentoDto pagamentoPagamentoId) {
		this.pagamentoStatus = pagamentoStatus;
		this.pagamentoStatusUpdate = pagamentoStatusUpdate;
		this.pagamentoStatusTipo = pagamentoStatusTipo;
		this.pagamentoStatusFlag = pagamentoStatusFlag;
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}


	public Integer getPagamentoStatus() {
		return pagamentoStatus;
	}

	public void setPagamentoStatus(Integer pagamentoStatus) {
		this.pagamentoStatus = pagamentoStatus;
	}

	public Date getPagamentoStatusUpdate() {
		return pagamentoStatusUpdate;
	}

	public void setPagamentoStatusUpdate(Date pagamentoStatusUpdate) {
		this.pagamentoStatusUpdate = pagamentoStatusUpdate;
	}

	public String getPagamentoStatusTipo() {
		return pagamentoStatusTipo;
	}

	public void setPagamentoStatusTipo(String pagamentoStatusTipo) {
		this.pagamentoStatusTipo = pagamentoStatusTipo;
	}

	public Integer getPagamentoStatusFlag() {
		return pagamentoStatusFlag;
	}

	public void setPagamentoStatusFlag(Integer pagamentoStatusFlag) {
		this.pagamentoStatusFlag = pagamentoStatusFlag;
	}

	public PagamentoDto getPagamentoPagamentoId() {
		return pagamentoPagamentoId;
	}

	public void setPagamentoPagamentoId(PagamentoDto pagamentoPagamentoId) {
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}
}
