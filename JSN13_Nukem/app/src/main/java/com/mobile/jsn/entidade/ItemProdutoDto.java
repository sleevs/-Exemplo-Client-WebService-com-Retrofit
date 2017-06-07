package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
public class ItemProdutoDto implements Serializable{

private Integer itemProdutoId;
private java.util.Date itemProdutoData;
private java.util.List<CompraDto> compraList;
private ItemDto itemItemId;
private ProdutoDto produtoProdutoId;

public ItemProdutoDto(){
}


	public ItemProdutoDto(Integer itemProdutoId, Date itemProdutoData, List<CompraDto> compraList, ItemDto itemItemId, ProdutoDto produtoProdutoId) {
		this.itemProdutoId = itemProdutoId;
		this.itemProdutoData = itemProdutoData;
		this.compraList = compraList;
		this.itemItemId = itemItemId;
		this.produtoProdutoId = produtoProdutoId;
	}


	public Integer getItemProdutoId() {
		return itemProdutoId;
	}

	public void setItemProdutoId(Integer itemProdutoId) {
		this.itemProdutoId = itemProdutoId;
	}

	public Date getItemProdutoData() {
		return itemProdutoData;
	}

	public void setItemProdutoData(Date itemProdutoData) {
		this.itemProdutoData = itemProdutoData;
	}

	public List<CompraDto> getCompraList() {
		return compraList;
	}

	public void setCompraList(List<CompraDto> compraList) {
		this.compraList = compraList;
	}

	public ItemDto getItemItemId() {
		return itemItemId;
	}

	public void setItemItemId(ItemDto itemItemId) {
		this.itemItemId = itemItemId;
	}

	public ProdutoDto getProdutoProdutoId() {
		return produtoProdutoId;
	}

	public void setProdutoProdutoId(ProdutoDto produtoProdutoId) {
		this.produtoProdutoId = produtoProdutoId;
	}
}
