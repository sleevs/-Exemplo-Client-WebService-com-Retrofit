package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
public class ProdutoDto implements Serializable{

private Integer produtoId;
private String produtoNome;
private String produtoTipo;
private String produtoCategoria;
private double produtoValor;
private String produtoDescricao;
private String produtoSerie;
private String produtoImagem;
private double produtoDesconto;
private java.util.List<ItemProdutoDto> itemProdutoList;

public ProdutoDto(){
}


	public ProdutoDto(Integer produtoId, String produtoNome, String produtoTipo, String produtoCategoria, double produtoValor, String produtoDescricao, String produtoSerie, String produtoImagem, double produtoDesconto, List<ItemProdutoDto> itemProdutoList) {
		this.produtoId = produtoId;
		this.produtoNome = produtoNome;
		this.produtoTipo = produtoTipo;
		this.produtoCategoria = produtoCategoria;
		this.produtoValor = produtoValor;
		this.produtoDescricao = produtoDescricao;
		this.produtoSerie = produtoSerie;
		this.produtoImagem = produtoImagem;
		this.produtoDesconto = produtoDesconto;
		this.itemProdutoList = itemProdutoList;
	}


	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}

	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}

	public String getProdutoTipo() {
		return produtoTipo;
	}

	public void setProdutoTipo(String produtoTipo) {
		this.produtoTipo = produtoTipo;
	}

	public String getProdutoCategoria() {
		return produtoCategoria;
	}

	public void setProdutoCategoria(String produtoCategoria) {
		this.produtoCategoria = produtoCategoria;
	}

	public double getProdutoValor() {
		return produtoValor;
	}

	public void setProdutoValor(double produtoValor) {
		this.produtoValor = produtoValor;
	}

	public String getProdutoDescricao() {
		return produtoDescricao;
	}

	public void setProdutoDescricao(String produtoDescricao) {
		this.produtoDescricao = produtoDescricao;
	}

	public String getProdutoSerie() {
		return produtoSerie;
	}

	public void setProdutoSerie(String produtoSerie) {
		this.produtoSerie = produtoSerie;
	}

	public String getProdutoImagem() {
		return produtoImagem;
	}

	public void setProdutoImagem(String produtoImagem) {
		this.produtoImagem = produtoImagem;
	}

	public double getProdutoDesconto() {
		return produtoDesconto;
	}

	public void setProdutoDesconto(double produtoDesconto) {
		this.produtoDesconto = produtoDesconto;
	}

	public List<ItemProdutoDto> getItemProdutoList() {
		return itemProdutoList;
	}

	public void setItemProdutoList(List<ItemProdutoDto> itemProdutoList) {
		this.itemProdutoList = itemProdutoList;
	}
}
