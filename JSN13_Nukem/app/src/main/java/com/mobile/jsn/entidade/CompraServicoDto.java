package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
public class CompraServicoDto implements Serializable{

private short compraServicoId;
private java.util.Date compraServicoData;
private short compraServicoFlag;
private CompraDto compraCompraId;
private ServicoDto servicoServicoId;

public CompraServicoDto(){
}


	public CompraServicoDto(short compraServicoId, Date compraServicoData, short compraServicoFlag, CompraDto compraCompraId, ServicoDto servicoServicoId) {
		this.compraServicoId = compraServicoId;
		this.compraServicoData = compraServicoData;
		this.compraServicoFlag = compraServicoFlag;
		this.compraCompraId = compraCompraId;
		this.servicoServicoId = servicoServicoId;
	}


	public short getCompraServicoId() {
		return compraServicoId;
	}

	public void setCompraServicoId(short compraServicoId) {
		this.compraServicoId = compraServicoId;
	}

	public Date getCompraServicoData() {
		return compraServicoData;
	}

	public void setCompraServicoData(Date compraServicoData) {
		this.compraServicoData = compraServicoData;
	}

	public short getCompraServicoFlag() {
		return compraServicoFlag;
	}

	public void setCompraServicoFlag(short compraServicoFlag) {
		this.compraServicoFlag = compraServicoFlag;
	}

	public CompraDto getCompraCompraId() {
		return compraCompraId;
	}

	public void setCompraCompraId(CompraDto compraCompraId) {
		this.compraCompraId = compraCompraId;
	}

	public ServicoDto getServicoServicoId() {
		return servicoServicoId;
	}

	public void setServicoServicoId(ServicoDto servicoServicoId) {
		this.servicoServicoId = servicoServicoId;
	}
}
