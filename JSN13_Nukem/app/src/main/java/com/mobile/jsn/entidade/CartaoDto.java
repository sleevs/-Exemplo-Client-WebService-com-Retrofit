package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
public class CartaoDto implements Serializable{

private Integer banco;
private String cartaoNome;
private String cartaoTitular;
private String cartaoTipo;
private String cartaoNumero;
private String cartaoValidade;
private String cartaoAgencia;
private String cartaoConta;
private String cartaoSecurityCode;
private java.util.List<CartaoPagamentoDto> cartaoPagamentoList;

public CartaoDto(){
}


	public CartaoDto(Integer banco, String cartaoNome, String cartaoTitular, String cartaoTipo, String cartaoNumero, String cartaoValidade, String cartaoAgencia, String cartaoConta, String cartaoSecurityCode, List<CartaoPagamentoDto> cartaoPagamentoList) {
		this.banco = banco;
		this.cartaoNome = cartaoNome;
		this.cartaoTitular = cartaoTitular;
		this.cartaoTipo = cartaoTipo;
		this.cartaoNumero = cartaoNumero;
		this.cartaoValidade = cartaoValidade;
		this.cartaoAgencia = cartaoAgencia;
		this.cartaoConta = cartaoConta;
		this.cartaoSecurityCode = cartaoSecurityCode;
		this.cartaoPagamentoList = cartaoPagamentoList;
	}


	public Integer getBanco() {
		return banco;
	}

	public void setBanco(Integer banco) {
		this.banco = banco;
	}

	public String getCartaoNome() {
		return cartaoNome;
	}

	public void setCartaoNome(String cartaoNome) {
		this.cartaoNome = cartaoNome;
	}

	public String getCartaoTitular() {
		return cartaoTitular;
	}

	public void setCartaoTitular(String cartaoTitular) {
		this.cartaoTitular = cartaoTitular;
	}

	public String getCartaoTipo() {
		return cartaoTipo;
	}

	public void setCartaoTipo(String cartaoTipo) {
		this.cartaoTipo = cartaoTipo;
	}

	public String getCartaoNumero() {
		return cartaoNumero;
	}

	public void setCartaoNumero(String cartaoNumero) {
		this.cartaoNumero = cartaoNumero;
	}

	public String getCartaoValidade() {
		return cartaoValidade;
	}

	public void setCartaoValidade(String cartaoValidade) {
		this.cartaoValidade = cartaoValidade;
	}

	public String getCartaoAgencia() {
		return cartaoAgencia;
	}

	public void setCartaoAgencia(String cartaoAgencia) {
		this.cartaoAgencia = cartaoAgencia;
	}

	public String getCartaoConta() {
		return cartaoConta;
	}

	public void setCartaoConta(String cartaoConta) {
		this.cartaoConta = cartaoConta;
	}

	public String getCartaoSecurityCode() {
		return cartaoSecurityCode;
	}

	public void setCartaoSecurityCode(String cartaoSecurityCode) {
		this.cartaoSecurityCode = cartaoSecurityCode;
	}

	public List<CartaoPagamentoDto> getCartaoPagamentoList() {
		return cartaoPagamentoList;
	}

	public void setCartaoPagamentoList(List<CartaoPagamentoDto> cartaoPagamentoList) {
		this.cartaoPagamentoList = cartaoPagamentoList;
	}
}
