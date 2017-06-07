package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
public class MensagemDto implements Serializable{

private Integer mensagemId;
private java.util.Date mensagemData;
private String mensagemDescricao;
private String mensagemFlag;
private AnuncioDto anuncioAnuncioId;
private ContaDto contaConta;
private PropostaDto propostaPropostaId;

public MensagemDto(){
}


	public MensagemDto(Integer mensagemId, Date mensagemData, String mensagemDescricao, String mensagemFlag, AnuncioDto anuncioAnuncioId, ContaDto contaConta, PropostaDto propostaPropostaId) {
		this.mensagemId = mensagemId;
		this.mensagemData = mensagemData;
		this.mensagemDescricao = mensagemDescricao;
		this.mensagemFlag = mensagemFlag;
		this.anuncioAnuncioId = anuncioAnuncioId;
		this.contaConta = contaConta;
		this.propostaPropostaId = propostaPropostaId;
	}


	public Integer getMensagemId() {
		return mensagemId;
	}

	public void setMensagemId(Integer mensagemId) {
		this.mensagemId = mensagemId;
	}

	public Date getMensagemData() {
		return mensagemData;
	}

	public void setMensagemData(Date mensagemData) {
		this.mensagemData = mensagemData;
	}

	public String getMensagemDescricao() {
		return mensagemDescricao;
	}

	public void setMensagemDescricao(String mensagemDescricao) {
		this.mensagemDescricao = mensagemDescricao;
	}

	public String getMensagemFlag() {
		return mensagemFlag;
	}

	public void setMensagemFlag(String mensagemFlag) {
		this.mensagemFlag = mensagemFlag;
	}

	public AnuncioDto getAnuncioAnuncioId() {
		return anuncioAnuncioId;
	}

	public void setAnuncioAnuncioId(AnuncioDto anuncioAnuncioId) {
		this.anuncioAnuncioId = anuncioAnuncioId;
	}

	public ContaDto getContaConta() {
		return contaConta;
	}

	public void setContaConta(ContaDto contaConta) {
		this.contaConta = contaConta;
	}

	public PropostaDto getPropostaPropostaId() {
		return propostaPropostaId;
	}

	public void setPropostaPropostaId(PropostaDto propostaPropostaId) {
		this.propostaPropostaId = propostaPropostaId;
	}
}
