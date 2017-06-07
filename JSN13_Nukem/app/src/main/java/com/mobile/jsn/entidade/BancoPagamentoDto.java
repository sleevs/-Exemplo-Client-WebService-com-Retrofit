package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class BancoPagamentoDto implements Serializable{

private Integer bancoPagamentoId;
private String bancoPagamentoFlag;
private BancoDto bancoBancoId;
private PagamentoDto pagamentoPagamentoId;

public BancoPagamentoDto(){
}


	public BancoPagamentoDto(Integer bancoPagamentoId, String bancoPagamentoFlag, BancoDto bancoBancoId, PagamentoDto pagamentoPagamentoId) {
		this.bancoPagamentoId = bancoPagamentoId;
		this.bancoPagamentoFlag = bancoPagamentoFlag;
		this.bancoBancoId = bancoBancoId;
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}


	public Integer getBancoPagamentoId() {
		return bancoPagamentoId;
	}

	public void setBancoPagamentoId(Integer bancoPagamentoId) {
		this.bancoPagamentoId = bancoPagamentoId;
	}

	public String getBancoPagamentoFlag() {
		return bancoPagamentoFlag;
	}

	public void setBancoPagamentoFlag(String bancoPagamentoFlag) {
		this.bancoPagamentoFlag = bancoPagamentoFlag;
	}

	public BancoDto getBancoBancoId() {
		return bancoBancoId;
	}

	public void setBancoBancoId(BancoDto bancoBancoId) {
		this.bancoBancoId = bancoBancoId;
	}

	public PagamentoDto getPagamentoPagamentoId() {
		return pagamentoPagamentoId;
	}

	public void setPagamentoPagamentoId(PagamentoDto pagamentoPagamentoId) {
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}
}
