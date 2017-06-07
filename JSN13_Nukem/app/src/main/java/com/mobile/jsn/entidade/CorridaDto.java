package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
public class CorridaDto implements Serializable{

private Integer corridaId;
private java.util.Date corridaData;
private double corridaValor;
private double corridaDistancia;
private Integer corridaTempo;
private String corridaTipo;
private String corridaCategoria;
private DestinoDto destinoDestinoId;
private TransporteDto transporteTransporteId;
private java.util.List<CorridaStatusDto> corridaStatusList;
private java.util.List<CorridaServicoDto> corridaServicoList;

public CorridaDto(){
}


	public CorridaDto(Integer corridaId, Date corridaData, double corridaValor, double corridaDistancia, Integer corridaTempo, String corridaTipo, String corridaCategoria, DestinoDto destinoDestinoId, TransporteDto transporteTransporteId, List<CorridaStatusDto> corridaStatusList, List<CorridaServicoDto> corridaServicoList) {
		this.corridaId = corridaId;
		this.corridaData = corridaData;
		this.corridaValor = corridaValor;
		this.corridaDistancia = corridaDistancia;
		this.corridaTempo = corridaTempo;
		this.corridaTipo = corridaTipo;
		this.corridaCategoria = corridaCategoria;
		this.destinoDestinoId = destinoDestinoId;
		this.transporteTransporteId = transporteTransporteId;
		this.corridaStatusList = corridaStatusList;
		this.corridaServicoList = corridaServicoList;
	}


	public Integer getCorridaId() {
		return corridaId;
	}

	public void setCorridaId(Integer corridaId) {
		this.corridaId = corridaId;
	}

	public Date getCorridaData() {
		return corridaData;
	}

	public void setCorridaData(Date corridaData) {
		this.corridaData = corridaData;
	}

	public double getCorridaValor() {
		return corridaValor;
	}

	public void setCorridaValor(double corridaValor) {
		this.corridaValor = corridaValor;
	}

	public double getCorridaDistancia() {
		return corridaDistancia;
	}

	public void setCorridaDistancia(double corridaDistancia) {
		this.corridaDistancia = corridaDistancia;
	}

	public Integer getCorridaTempo() {
		return corridaTempo;
	}

	public void setCorridaTempo(Integer corridaTempo) {
		this.corridaTempo = corridaTempo;
	}

	public String getCorridaTipo() {
		return corridaTipo;
	}

	public void setCorridaTipo(String corridaTipo) {
		this.corridaTipo = corridaTipo;
	}

	public String getCorridaCategoria() {
		return corridaCategoria;
	}

	public void setCorridaCategoria(String corridaCategoria) {
		this.corridaCategoria = corridaCategoria;
	}

	public DestinoDto getDestinoDestinoId() {
		return destinoDestinoId;
	}

	public void setDestinoDestinoId(DestinoDto destinoDestinoId) {
		this.destinoDestinoId = destinoDestinoId;
	}

	public TransporteDto getTransporteTransporteId() {
		return transporteTransporteId;
	}

	public void setTransporteTransporteId(TransporteDto transporteTransporteId) {
		this.transporteTransporteId = transporteTransporteId;
	}

	public List<CorridaStatusDto> getCorridaStatusList() {
		return corridaStatusList;
	}

	public void setCorridaStatusList(List<CorridaStatusDto> corridaStatusList) {
		this.corridaStatusList = corridaStatusList;
	}

	public List<CorridaServicoDto> getCorridaServicoList() {
		return corridaServicoList;
	}

	public void setCorridaServicoList(List<CorridaServicoDto> corridaServicoList) {
		this.corridaServicoList = corridaServicoList;
	}
}


