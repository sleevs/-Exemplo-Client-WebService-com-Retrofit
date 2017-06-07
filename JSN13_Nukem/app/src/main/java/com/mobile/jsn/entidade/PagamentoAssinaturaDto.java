package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
public class PagamentoAssinaturaDto implements Serializable{

private Integer pagamentoAssinaturaId;
private Integer pagamentoAssinaturaFlag;
private java.util.Date pagamentoAssinaturaData;
private AssinaturaDto assinaturaAssinaturaId;
private PagamentoDto pagamentoPagamentoId;

public PagamentoAssinaturaDto(){
}


	public PagamentoAssinaturaDto(Integer pagamentoAssinaturaId, Integer pagamentoAssinaturaFlag, Date pagamentoAssinaturaData, AssinaturaDto assinaturaAssinaturaId, PagamentoDto pagamentoPagamentoId) {
		this.pagamentoAssinaturaId = pagamentoAssinaturaId;
		this.pagamentoAssinaturaFlag = pagamentoAssinaturaFlag;
		this.pagamentoAssinaturaData = pagamentoAssinaturaData;
		this.assinaturaAssinaturaId = assinaturaAssinaturaId;
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}


	public Integer getPagamentoAssinaturaId() {
		return pagamentoAssinaturaId;
	}

	public void setPagamentoAssinaturaId(Integer pagamentoAssinaturaId) {
		this.pagamentoAssinaturaId = pagamentoAssinaturaId;
	}

	public Integer getPagamentoAssinaturaFlag() {
		return pagamentoAssinaturaFlag;
	}

	public void setPagamentoAssinaturaFlag(Integer pagamentoAssinaturaFlag) {
		this.pagamentoAssinaturaFlag = pagamentoAssinaturaFlag;
	}

	public Date getPagamentoAssinaturaData() {
		return pagamentoAssinaturaData;
	}

	public void setPagamentoAssinaturaData(Date pagamentoAssinaturaData) {
		this.pagamentoAssinaturaData = pagamentoAssinaturaData;
	}

	public AssinaturaDto getAssinaturaAssinaturaId() {
		return assinaturaAssinaturaId;
	}

	public void setAssinaturaAssinaturaId(AssinaturaDto assinaturaAssinaturaId) {
		this.assinaturaAssinaturaId = assinaturaAssinaturaId;
	}

	public PagamentoDto getPagamentoPagamentoId() {
		return pagamentoPagamentoId;
	}

	public void setPagamentoPagamentoId(PagamentoDto pagamentoPagamentoId) {
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}
}
