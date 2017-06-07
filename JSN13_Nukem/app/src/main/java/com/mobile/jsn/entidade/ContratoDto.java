package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
public class ContratoDto implements Serializable{

private Integer contratoId;
private String contratoTipo;
private java.util.Date contratoData;
private String contratoAnexo;
private String contratoDescricao;
private String contratoFlag;
private String contratoStatus;
private ServicoDto servicoServicoId;

public ContratoDto(){
}


	public ContratoDto(Integer contratoId, String contratoTipo, Date contratoData, String contratoAnexo, String contratoDescricao, String contratoFlag, String contratoStatus, ServicoDto servicoServicoId) {
		this.contratoId = contratoId;
		this.contratoTipo = contratoTipo;
		this.contratoData = contratoData;
		this.contratoAnexo = contratoAnexo;
		this.contratoDescricao = contratoDescricao;
		this.contratoFlag = contratoFlag;
		this.contratoStatus = contratoStatus;
		this.servicoServicoId = servicoServicoId;
	}

	public Integer getContratoId() {
		return contratoId;
	}

	public void setContratoId(Integer contratoId) {
		this.contratoId = contratoId;
	}

	public String getContratoTipo() {
		return contratoTipo;
	}

	public void setContratoTipo(String contratoTipo) {
		this.contratoTipo = contratoTipo;
	}

	public Date getContratoData() {
		return contratoData;
	}

	public void setContratoData(Date contratoData) {
		this.contratoData = contratoData;
	}

	public String getContratoAnexo() {
		return contratoAnexo;
	}

	public void setContratoAnexo(String contratoAnexo) {
		this.contratoAnexo = contratoAnexo;
	}

	public String getContratoDescricao() {
		return contratoDescricao;
	}

	public void setContratoDescricao(String contratoDescricao) {
		this.contratoDescricao = contratoDescricao;
	}

	public String getContratoFlag() {
		return contratoFlag;
	}

	public void setContratoFlag(String contratoFlag) {
		this.contratoFlag = contratoFlag;
	}

	public String getContratoStatus() {
		return contratoStatus;
	}

	public void setContratoStatus(String contratoStatus) {
		this.contratoStatus = contratoStatus;
	}

	public ServicoDto getServicoServicoId() {
		return servicoServicoId;
	}

	public void setServicoServicoId(ServicoDto servicoServicoId) {
		this.servicoServicoId = servicoServicoId;
	}
}
