package com.mobile.jsn.entidade;

import java.io.Serializable;
import java.util.Set;
public class AssinaturaDto implements Serializable{

private Integer assinaturaId;
private java.util.Date assinaturaData;
private java.util.Date assinaturaValidade;
private double assinaturaValor;
private double assinaturaDesconto;
private double assinaturaValortotal;
private String assinaturaContrato;
private String assinaturaTermos;
private PlanoDto planoPlanoId;
private java.util.List<AssinaturaStatusDto> assinaturaStatusList;
private java.util.List<PagamentoAssinaturaDto> pagamentoAssinaturaList;

public AssinaturaDto(){
}












}
