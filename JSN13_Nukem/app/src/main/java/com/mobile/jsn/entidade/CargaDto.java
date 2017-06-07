package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
public class CargaDto implements Serializable{

private Integer cargaId;
private String cargaTipo;
private String cargaCategoria;
private String cargaQuantidade;
private String cargaPeso;
private String cargaLargura;
private String cargaAltura;
private String cargaComprimento;
private String cargaDescricao;
private String cargaImagem;
private String cargaEstado;
private java.util.List<PedidoDto> pedidoList;

public CargaDto(){
}


	public CargaDto(Integer cargaId, String cargaTipo, String cargaCategoria, String cargaQuantidade, String cargaPeso, String cargaLargura, String cargaAltura, String cargaComprimento, String cargaDescricao, String cargaImagem, String cargaEstado, List<PedidoDto> pedidoList) {
		this.cargaId = cargaId;
		this.cargaTipo = cargaTipo;
		this.cargaCategoria = cargaCategoria;
		this.cargaQuantidade = cargaQuantidade;
		this.cargaPeso = cargaPeso;
		this.cargaLargura = cargaLargura;
		this.cargaAltura = cargaAltura;
		this.cargaComprimento = cargaComprimento;
		this.cargaDescricao = cargaDescricao;
		this.cargaImagem = cargaImagem;
		this.cargaEstado = cargaEstado;
		this.pedidoList = pedidoList;
	}


	public Integer getCargaId() {
		return cargaId;
	}

	public void setCargaId(Integer cargaId) {
		this.cargaId = cargaId;
	}

	public String getCargaTipo() {
		return cargaTipo;
	}

	public void setCargaTipo(String cargaTipo) {
		this.cargaTipo = cargaTipo;
	}

	public String getCargaCategoria() {
		return cargaCategoria;
	}

	public void setCargaCategoria(String cargaCategoria) {
		this.cargaCategoria = cargaCategoria;
	}

	public String getCargaQuantidade() {
		return cargaQuantidade;
	}

	public void setCargaQuantidade(String cargaQuantidade) {
		this.cargaQuantidade = cargaQuantidade;
	}

	public String getCargaPeso() {
		return cargaPeso;
	}

	public void setCargaPeso(String cargaPeso) {
		this.cargaPeso = cargaPeso;
	}

	public String getCargaLargura() {
		return cargaLargura;
	}

	public void setCargaLargura(String cargaLargura) {
		this.cargaLargura = cargaLargura;
	}

	public String getCargaAltura() {
		return cargaAltura;
	}

	public void setCargaAltura(String cargaAltura) {
		this.cargaAltura = cargaAltura;
	}

	public String getCargaComprimento() {
		return cargaComprimento;
	}

	public void setCargaComprimento(String cargaComprimento) {
		this.cargaComprimento = cargaComprimento;
	}

	public String getCargaDescricao() {
		return cargaDescricao;
	}

	public void setCargaDescricao(String cargaDescricao) {
		this.cargaDescricao = cargaDescricao;
	}

	public String getCargaImagem() {
		return cargaImagem;
	}

	public void setCargaImagem(String cargaImagem) {
		this.cargaImagem = cargaImagem;
	}

	public String getCargaEstado() {
		return cargaEstado;
	}

	public void setCargaEstado(String cargaEstado) {
		this.cargaEstado = cargaEstado;
	}

	public List<PedidoDto> getPedidoList() {
		return pedidoList;
	}

	public void setPedidoList(List<PedidoDto> pedidoList) {
		this.pedidoList = pedidoList;
	}
}
