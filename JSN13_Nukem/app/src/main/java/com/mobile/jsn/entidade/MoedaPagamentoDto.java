package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class MoedaPagamentoDto implements Serializable{

private Integer moedaPagamentoId;
private String moedaPagamentoFlag;
private MoedaDto moedaMoedaId;
private PagamentoDto pagamentoPagamentoId;

public MoedaPagamentoDto(){
}


	public MoedaPagamentoDto(Integer moedaPagamentoId, String moedaPagamentoFlag, MoedaDto moedaMoedaId, PagamentoDto pagamentoPagamentoId) {
		this.moedaPagamentoId = moedaPagamentoId;
		this.moedaPagamentoFlag = moedaPagamentoFlag;
		this.moedaMoedaId = moedaMoedaId;
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}


	public Integer getMoedaPagamentoId() {
		return moedaPagamentoId;
	}

	public void setMoedaPagamentoId(Integer moedaPagamentoId) {
		this.moedaPagamentoId = moedaPagamentoId;
	}

	public String getMoedaPagamentoFlag() {
		return moedaPagamentoFlag;
	}

	public void setMoedaPagamentoFlag(String moedaPagamentoFlag) {
		this.moedaPagamentoFlag = moedaPagamentoFlag;
	}

	public MoedaDto getMoedaMoedaId() {
		return moedaMoedaId;
	}

	public void setMoedaMoedaId(MoedaDto moedaMoedaId) {
		this.moedaMoedaId = moedaMoedaId;
	}

	public PagamentoDto getPagamentoPagamentoId() {
		return pagamentoPagamentoId;
	}

	public void setPagamentoPagamentoId(PagamentoDto pagamentoPagamentoId) {
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}
}
