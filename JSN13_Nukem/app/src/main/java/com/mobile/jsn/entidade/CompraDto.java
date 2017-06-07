package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
public class CompraDto implements Serializable{


private Integer compraId;
private double compraPreco;
private double compraDesconto;
private double compraTotal;
private java.util.Date compraData;
private String compraTipo;
private String compraDescricao;
private String compraEnvio;
private String compraCategoria;
private CepDto cepCepId;
private ItemProdutoDto itemProdutoItemProdutoId;
private java.util.List<CompraServicoDto> compraServicoList;
private java.util.List<CompraStatusDto> compraStatusList;

public CompraDto(){
}


	public CompraDto(Integer compraId, double compraPreco, double compraDesconto, double compraTotal, Date compraData, String compraTipo, String compraDescricao, String compraEnvio, String compraCategoria, CepDto cepCepId, ItemProdutoDto itemProdutoItemProdutoId, List<CompraServicoDto> compraServicoList, List<CompraStatusDto> compraStatusList) {
		this.compraId = compraId;
		this.compraPreco = compraPreco;
		this.compraDesconto = compraDesconto;
		this.compraTotal = compraTotal;
		this.compraData = compraData;
		this.compraTipo = compraTipo;
		this.compraDescricao = compraDescricao;
		this.compraEnvio = compraEnvio;
		this.compraCategoria = compraCategoria;
		this.cepCepId = cepCepId;
		this.itemProdutoItemProdutoId = itemProdutoItemProdutoId;
		this.compraServicoList = compraServicoList;
		this.compraStatusList = compraStatusList;
	}


	public Integer getCompraId() {
		return compraId;
	}

	public void setCompraId(Integer compraId) {
		this.compraId = compraId;
	}

	public double getCompraPreco() {
		return compraPreco;
	}

	public void setCompraPreco(double compraPreco) {
		this.compraPreco = compraPreco;
	}

	public double getCompraDesconto() {
		return compraDesconto;
	}

	public void setCompraDesconto(double compraDesconto) {
		this.compraDesconto = compraDesconto;
	}

	public double getCompraTotal() {
		return compraTotal;
	}

	public void setCompraTotal(double compraTotal) {
		this.compraTotal = compraTotal;
	}

	public Date getCompraData() {
		return compraData;
	}

	public void setCompraData(Date compraData) {
		this.compraData = compraData;
	}

	public String getCompraTipo() {
		return compraTipo;
	}

	public void setCompraTipo(String compraTipo) {
		this.compraTipo = compraTipo;
	}

	public String getCompraDescricao() {
		return compraDescricao;
	}

	public void setCompraDescricao(String compraDescricao) {
		this.compraDescricao = compraDescricao;
	}

	public String getCompraEnvio() {
		return compraEnvio;
	}

	public void setCompraEnvio(String compraEnvio) {
		this.compraEnvio = compraEnvio;
	}

	public String getCompraCategoria() {
		return compraCategoria;
	}

	public void setCompraCategoria(String compraCategoria) {
		this.compraCategoria = compraCategoria;
	}

	public CepDto getCepCepId() {
		return cepCepId;
	}

	public void setCepCepId(CepDto cepCepId) {
		this.cepCepId = cepCepId;
	}

	public ItemProdutoDto getItemProdutoItemProdutoId() {
		return itemProdutoItemProdutoId;
	}

	public void setItemProdutoItemProdutoId(ItemProdutoDto itemProdutoItemProdutoId) {
		this.itemProdutoItemProdutoId = itemProdutoItemProdutoId;
	}

	public List<CompraServicoDto> getCompraServicoList() {
		return compraServicoList;
	}

	public void setCompraServicoList(List<CompraServicoDto> compraServicoList) {
		this.compraServicoList = compraServicoList;
	}

	public List<CompraStatusDto> getCompraStatusList() {
		return compraStatusList;
	}

	public void setCompraStatusList(List<CompraStatusDto> compraStatusList) {
		this.compraStatusList = compraStatusList;
	}
}
