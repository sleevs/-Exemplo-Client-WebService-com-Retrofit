package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
public class PagamentoDto implements Serializable{

private Integer pagamentoId;
private double pagamentoValor;
private double pagamentoValortotal;
private double pagamentoTarifa;
private java.util.Date pagamentoData;
private String pagamentoTipo;
private String pagamentoDescricao;
private String pagamentoFlag;
private java.util.List<PagamentoStatusDto> pagamentoStatusList;
private java.util.List<BancoPagamentoDto> bancoPagamentoList;
private ContaDto contaContaId;
private java.util.List<MoedaPagamentoDto> moedaPagamentoList;
private java.util.List<PagamentoServicoDto> pagamentoServicoList;
private java.util.List<CartaoPagamentoDto> cartaoPagamentoList;
private java.util.List<PagamentoAssinaturaDto> pagamentoAssinaturaList;

public PagamentoDto(){
}

	public PagamentoDto(Integer pagamentoId, double pagamentoValor, double pagamentoValortotal, double pagamentoTarifa, Date pagamentoData, String pagamentoTipo, String pagamentoDescricao, String pagamentoFlag, List<PagamentoStatusDto> pagamentoStatusList, List<BancoPagamentoDto> bancoPagamentoList, ContaDto contaContaId, List<MoedaPagamentoDto> moedaPagamentoList, List<PagamentoServicoDto> pagamentoServicoList, List<CartaoPagamentoDto> cartaoPagamentoList, List<PagamentoAssinaturaDto> pagamentoAssinaturaList) {
		this.pagamentoId = pagamentoId;
		this.pagamentoValor = pagamentoValor;
		this.pagamentoValortotal = pagamentoValortotal;
		this.pagamentoTarifa = pagamentoTarifa;
		this.pagamentoData = pagamentoData;
		this.pagamentoTipo = pagamentoTipo;
		this.pagamentoDescricao = pagamentoDescricao;
		this.pagamentoFlag = pagamentoFlag;
		this.pagamentoStatusList = pagamentoStatusList;
		this.bancoPagamentoList = bancoPagamentoList;
		this.contaContaId = contaContaId;
		this.moedaPagamentoList = moedaPagamentoList;
		this.pagamentoServicoList = pagamentoServicoList;
		this.cartaoPagamentoList = cartaoPagamentoList;
		this.pagamentoAssinaturaList = pagamentoAssinaturaList;
	}


	public Integer getPagamentoId() {
		return pagamentoId;
	}

	public void setPagamentoId(Integer pagamentoId) {
		this.pagamentoId = pagamentoId;
	}

	public double getPagamentoValor() {
		return pagamentoValor;
	}

	public void setPagamentoValor(double pagamentoValor) {
		this.pagamentoValor = pagamentoValor;
	}

	public double getPagamentoValortotal() {
		return pagamentoValortotal;
	}

	public void setPagamentoValortotal(double pagamentoValortotal) {
		this.pagamentoValortotal = pagamentoValortotal;
	}

	public double getPagamentoTarifa() {
		return pagamentoTarifa;
	}

	public void setPagamentoTarifa(double pagamentoTarifa) {
		this.pagamentoTarifa = pagamentoTarifa;
	}

	public Date getPagamentoData() {
		return pagamentoData;
	}

	public void setPagamentoData(Date pagamentoData) {
		this.pagamentoData = pagamentoData;
	}

	public String getPagamentoTipo() {
		return pagamentoTipo;
	}

	public void setPagamentoTipo(String pagamentoTipo) {
		this.pagamentoTipo = pagamentoTipo;
	}

	public String getPagamentoDescricao() {
		return pagamentoDescricao;
	}

	public void setPagamentoDescricao(String pagamentoDescricao) {
		this.pagamentoDescricao = pagamentoDescricao;
	}

	public String getPagamentoFlag() {
		return pagamentoFlag;
	}

	public void setPagamentoFlag(String pagamentoFlag) {
		this.pagamentoFlag = pagamentoFlag;
	}

	public List<PagamentoStatusDto> getPagamentoStatusList() {
		return pagamentoStatusList;
	}

	public void setPagamentoStatusList(List<PagamentoStatusDto> pagamentoStatusList) {
		this.pagamentoStatusList = pagamentoStatusList;
	}

	public List<BancoPagamentoDto> getBancoPagamentoList() {
		return bancoPagamentoList;
	}

	public void setBancoPagamentoList(List<BancoPagamentoDto> bancoPagamentoList) {
		this.bancoPagamentoList = bancoPagamentoList;
	}

	public ContaDto getContaContaId() {
		return contaContaId;
	}

	public void setContaContaId(ContaDto contaContaId) {
		this.contaContaId = contaContaId;
	}

	public List<MoedaPagamentoDto> getMoedaPagamentoList() {
		return moedaPagamentoList;
	}

	public void setMoedaPagamentoList(List<MoedaPagamentoDto> moedaPagamentoList) {
		this.moedaPagamentoList = moedaPagamentoList;
	}

	public List<PagamentoServicoDto> getPagamentoServicoList() {
		return pagamentoServicoList;
	}

	public void setPagamentoServicoList(List<PagamentoServicoDto> pagamentoServicoList) {
		this.pagamentoServicoList = pagamentoServicoList;
	}

	public List<CartaoPagamentoDto> getCartaoPagamentoList() {
		return cartaoPagamentoList;
	}

	public void setCartaoPagamentoList(List<CartaoPagamentoDto> cartaoPagamentoList) {
		this.cartaoPagamentoList = cartaoPagamentoList;
	}

	public List<PagamentoAssinaturaDto> getPagamentoAssinaturaList() {
		return pagamentoAssinaturaList;
	}

	public void setPagamentoAssinaturaList(List<PagamentoAssinaturaDto> pagamentoAssinaturaList) {
		this.pagamentoAssinaturaList = pagamentoAssinaturaList;
	}
}
