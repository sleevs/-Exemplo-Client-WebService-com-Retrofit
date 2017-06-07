package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
public class PropostaDto implements Serializable{

private Integer propostaId;
private String propostaValor;
private java.util.Date propostaData;
private String propostaTipo;
private String propostaDescricao;
private String propostaAnexo;
private String propostaUrl;
private String propostaCategoria;
private String propostaFlag;
private String propostaStatus;
private java.util.List<MensagemDto> mensagemList;
private java.util.List<PropostaStatusDto> propostaStatusList;

public PropostaDto(){
}


	public PropostaDto(Integer propostaId, String propostaValor, Date propostaData, String propostaTipo, String propostaDescricao, String propostaAnexo, String propostaUrl, String propostaCategoria, String propostaFlag, String propostaStatus, List<MensagemDto> mensagemList, List<PropostaStatusDto> propostaStatusList) {
		this.propostaId = propostaId;
		this.propostaValor = propostaValor;
		this.propostaData = propostaData;
		this.propostaTipo = propostaTipo;
		this.propostaDescricao = propostaDescricao;
		this.propostaAnexo = propostaAnexo;
		this.propostaUrl = propostaUrl;
		this.propostaCategoria = propostaCategoria;
		this.propostaFlag = propostaFlag;
		this.propostaStatus = propostaStatus;
		this.mensagemList = mensagemList;
		this.propostaStatusList = propostaStatusList;
	}


	public Integer getPropostaId() {
		return propostaId;
	}

	public void setPropostaId(Integer propostaId) {
		this.propostaId = propostaId;
	}

	public String getPropostaValor() {
		return propostaValor;
	}

	public void setPropostaValor(String propostaValor) {
		this.propostaValor = propostaValor;
	}

	public Date getPropostaData() {
		return propostaData;
	}

	public void setPropostaData(Date propostaData) {
		this.propostaData = propostaData;
	}

	public String getPropostaTipo() {
		return propostaTipo;
	}

	public void setPropostaTipo(String propostaTipo) {
		this.propostaTipo = propostaTipo;
	}

	public String getPropostaDescricao() {
		return propostaDescricao;
	}

	public void setPropostaDescricao(String propostaDescricao) {
		this.propostaDescricao = propostaDescricao;
	}

	public String getPropostaAnexo() {
		return propostaAnexo;
	}

	public void setPropostaAnexo(String propostaAnexo) {
		this.propostaAnexo = propostaAnexo;
	}

	public String getPropostaUrl() {
		return propostaUrl;
	}

	public void setPropostaUrl(String propostaUrl) {
		this.propostaUrl = propostaUrl;
	}

	public String getPropostaCategoria() {
		return propostaCategoria;
	}

	public void setPropostaCategoria(String propostaCategoria) {
		this.propostaCategoria = propostaCategoria;
	}

	public String getPropostaFlag() {
		return propostaFlag;
	}

	public void setPropostaFlag(String propostaFlag) {
		this.propostaFlag = propostaFlag;
	}

	public String getPropostaStatus() {
		return propostaStatus;
	}

	public void setPropostaStatus(String propostaStatus) {
		this.propostaStatus = propostaStatus;
	}

	public List<MensagemDto> getMensagemList() {
		return mensagemList;
	}

	public void setMensagemList(List<MensagemDto> mensagemList) {
		this.mensagemList = mensagemList;
	}

	public List<PropostaStatusDto> getPropostaStatusList() {
		return propostaStatusList;
	}

	public void setPropostaStatusList(List<PropostaStatusDto> propostaStatusList) {
		this.propostaStatusList = propostaStatusList;
	}
}
