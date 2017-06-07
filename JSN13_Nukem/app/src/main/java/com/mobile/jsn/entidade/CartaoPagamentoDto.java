package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class CartaoPagamentoDto implements Serializable{

private Integer cartaoPagamentoId;
private CartaoDto cartaoBanco;
private PagamentoDto pagamentoPagamentoId;

public CartaoPagamentoDto(){
}


	public CartaoPagamentoDto(Integer cartaoPagamentoId, CartaoDto cartaoBanco, PagamentoDto pagamentoPagamentoId) {
		this.cartaoPagamentoId = cartaoPagamentoId;
		this.cartaoBanco = cartaoBanco;
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}


	public Integer getCartaoPagamentoId() {
		return cartaoPagamentoId;
	}

	public void setCartaoPagamentoId(Integer cartaoPagamentoId) {
		this.cartaoPagamentoId = cartaoPagamentoId;
	}

	public CartaoDto getCartaoBanco() {
		return cartaoBanco;
	}

	public void setCartaoBanco(CartaoDto cartaoBanco) {
		this.cartaoBanco = cartaoBanco;
	}

	public PagamentoDto getPagamentoPagamentoId() {
		return pagamentoPagamentoId;
	}

	public void setPagamentoPagamentoId(PagamentoDto pagamentoPagamentoId) {
		this.pagamentoPagamentoId = pagamentoPagamentoId;
	}
}
