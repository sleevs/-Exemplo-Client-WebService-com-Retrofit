package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.List;

public class PlanoDto implements Serializable{

private Integer planoId;
private String planoNome;
private String planoTipo;
private String planoStatus;
private String planoCategoria;
private String planoFlag;
private java.util.List<AssinaturaDto> assinaturaList;

public PlanoDto(){
}


	public PlanoDto(Integer planoId, String planoNome, String planoTipo, String planoStatus, String planoCategoria, String planoFlag, List<AssinaturaDto> assinaturaList) {
		this.planoId = planoId;
		this.planoNome = planoNome;
		this.planoTipo = planoTipo;
		this.planoStatus = planoStatus;
		this.planoCategoria = planoCategoria;
		this.planoFlag = planoFlag;
		this.assinaturaList = assinaturaList;
	}


	public Integer getPlanoId() {
		return planoId;
	}

	public void setPlanoId(Integer planoId) {
		this.planoId = planoId;
	}

	public String getPlanoNome() {
		return planoNome;
	}

	public void setPlanoNome(String planoNome) {
		this.planoNome = planoNome;
	}

	public String getPlanoTipo() {
		return planoTipo;
	}

	public void setPlanoTipo(String planoTipo) {
		this.planoTipo = planoTipo;
	}

	public String getPlanoStatus() {
		return planoStatus;
	}

	public void setPlanoStatus(String planoStatus) {
		this.planoStatus = planoStatus;
	}

	public String getPlanoCategoria() {
		return planoCategoria;
	}

	public void setPlanoCategoria(String planoCategoria) {
		this.planoCategoria = planoCategoria;
	}

	public String getPlanoFlag() {
		return planoFlag;
	}

	public void setPlanoFlag(String planoFlag) {
		this.planoFlag = planoFlag;
	}

	public List<AssinaturaDto> getAssinaturaList() {
		return assinaturaList;
	}

	public void setAssinaturaList(List<AssinaturaDto> assinaturaList) {
		this.assinaturaList = assinaturaList;
	}
}
