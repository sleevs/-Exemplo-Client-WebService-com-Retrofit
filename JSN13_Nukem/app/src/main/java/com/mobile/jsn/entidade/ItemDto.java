package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
public class ItemDto implements Serializable{

private Integer itemId;
private String itemNome;
private String itemTipo;
private double itemValor;
private double itemDesconto;
private double itemTarifa;
private String itemImagem;
private String itemCategoria;
private String itemQuantidade;
private java.util.List<ItemProdutoDto> itemProdutoList;

public ItemDto(){
}


	public ItemDto(Integer itemId, String itemNome, String itemTipo, double itemValor, double itemDesconto, double itemTarifa, String itemImagem, String itemCategoria, String itemQuantidade, List<ItemProdutoDto> itemProdutoList) {
		this.itemId = itemId;
		this.itemNome = itemNome;
		this.itemTipo = itemTipo;
		this.itemValor = itemValor;
		this.itemDesconto = itemDesconto;
		this.itemTarifa = itemTarifa;
		this.itemImagem = itemImagem;
		this.itemCategoria = itemCategoria;
		this.itemQuantidade = itemQuantidade;
		this.itemProdutoList = itemProdutoList;
	}


	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemNome() {
		return itemNome;
	}

	public void setItemNome(String itemNome) {
		this.itemNome = itemNome;
	}

	public String getItemTipo() {
		return itemTipo;
	}

	public void setItemTipo(String itemTipo) {
		this.itemTipo = itemTipo;
	}

	public double getItemValor() {
		return itemValor;
	}

	public void setItemValor(double itemValor) {
		this.itemValor = itemValor;
	}

	public double getItemDesconto() {
		return itemDesconto;
	}

	public void setItemDesconto(double itemDesconto) {
		this.itemDesconto = itemDesconto;
	}

	public double getItemTarifa() {
		return itemTarifa;
	}

	public void setItemTarifa(double itemTarifa) {
		this.itemTarifa = itemTarifa;
	}

	public String getItemImagem() {
		return itemImagem;
	}

	public void setItemImagem(String itemImagem) {
		this.itemImagem = itemImagem;
	}

	public String getItemCategoria() {
		return itemCategoria;
	}

	public void setItemCategoria(String itemCategoria) {
		this.itemCategoria = itemCategoria;
	}

	public String getItemQuantidade() {
		return itemQuantidade;
	}

	public void setItemQuantidade(String itemQuantidade) {
		this.itemQuantidade = itemQuantidade;
	}

	public List<ItemProdutoDto> getItemProdutoList() {
		return itemProdutoList;
	}

	public void setItemProdutoList(List<ItemProdutoDto> itemProdutoList) {
		this.itemProdutoList = itemProdutoList;
	}
}
