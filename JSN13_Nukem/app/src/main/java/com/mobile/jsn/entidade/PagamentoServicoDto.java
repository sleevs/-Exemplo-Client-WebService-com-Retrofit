package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
public class PagamentoServicoDto implements Serializable{

private Integer pagamentoServicoId;
private Integer pagamentoServicoFlag;
private java.util.Date pagamentoServicoData;
private PagamentoDto pagamentoPagamentoId;
private ServicoDto servicoServicoId;

public PagamentoServicoDto(){
}


	public PagamentoServicoDto(Integer pagamentoServicoId, Integer pagamentoServicoFlag, Date pagamentoServicoData, PagamentoDto pagamentoPagamentoId, ServicoDto servicoServicoId) {
		this.pagamentoServicoId = pagamentoServicoId;
		this.pagamentoServicoFlag = pagamentoServicoFlag;
		this.pagamentoServicoData = pagamentoServicoData;
		this.pagamentoPagamentoId = pagamentoPagamentoId;
		this.servicoServicoId = servicoServicoId;
	}


	public Integer getPagamentoServicoId() {
		return pagamentoServicoId;
	}

	public void setPagamentoServicoId(Integer pagamentoServicoId) {
		this.pagamentoServicoId = pagamentoServicoId;
	}

	public Integer getPagamentoServicoFlag() {
		return pagamentoServicoFlag;
	}

	public void setPagamentoServicoFlag(Integer pagamentoServicoFlag) {
		this.pagamentoServicoFlag = pagamentoServicoFlag;
	}

	public Date getPagamentoServicoData() {
		return pagamentoServicoData;
	}

	public void setPagamentoServicoData(Date pagamentoServicoData) {
		this.pagamentoServicoData = pagamentoServicoData;
	}

	public PagamentoDto getPagamentoPagamentoId() {
		return pagamentoPagamentoId;
	}

	public void setPagamentoPagamentoId(PagamentoDto pagamentoPagamentoId) {
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}

	public ServicoDto getServicoServicoId() {
		return servicoServicoId;
	}

	public void setServicoServicoId(ServicoDto servicoServicoId) {
		this.servicoServicoId = servicoServicoId;
	}
}
