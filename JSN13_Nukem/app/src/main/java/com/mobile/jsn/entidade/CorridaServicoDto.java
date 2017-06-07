package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
public class CorridaServicoDto implements Serializable{

private Integer corridaServicoId;
private java.util.Date corridaServicoData;
private Integer corridaServicoFlag;
private CorridaDto corridaCorridaId;
private ServicoDto servicoServicoId;

public CorridaServicoDto(){
}


	public CorridaServicoDto(Integer corridaServicoId, Date corridaServicoData, Integer corridaServicoFlag, CorridaDto corridaCorridaId, ServicoDto servicoServicoId) {
		this.corridaServicoId = corridaServicoId;
		this.corridaServicoData = corridaServicoData;
		this.corridaServicoFlag = corridaServicoFlag;
		this.corridaCorridaId = corridaCorridaId;
		this.servicoServicoId = servicoServicoId;
	}

	public Integer getCorridaServicoId() {
		return corridaServicoId;
	}

	public void setCorridaServicoId(Integer corridaServicoId) {
		this.corridaServicoId = corridaServicoId;
	}

	public Date getCorridaServicoData() {
		return corridaServicoData;
	}

	public void setCorridaServicoData(Date corridaServicoData) {
		this.corridaServicoData = corridaServicoData;
	}

	public Integer getCorridaServicoFlag() {
		return corridaServicoFlag;
	}

	public void setCorridaServicoFlag(Integer corridaServicoFlag) {
		this.corridaServicoFlag = corridaServicoFlag;
	}

	public CorridaDto getCorridaCorridaId() {
		return corridaCorridaId;
	}

	public void setCorridaCorridaId(CorridaDto corridaCorridaId) {
		this.corridaCorridaId = corridaCorridaId;
	}

	public ServicoDto getServicoServicoId() {
		return servicoServicoId;
	}

	public void setServicoServicoId(ServicoDto servicoServicoId) {
		this.servicoServicoId = servicoServicoId;
	}
}
