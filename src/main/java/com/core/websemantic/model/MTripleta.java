package com.core.websemantic.model;

import com.core.websemantic.entity.Tripletas;

public class MTripleta {
	
	public MTripleta() {

	}
	
	public MTripleta(Tripletas tripleta) {
		this.id = tripleta.getId();
		this.sujeto = tripleta.getSujeto();
		this.predicado = tripleta.getPredicado();
		this.complemento =tripleta.getComplemento();
	}

	public MTripleta(long id, String sujeto, String predicado, String complemento) {
		this.id = id;
		this.sujeto = sujeto;
		this.predicado = predicado;
		this.complemento = complemento;
	}
	private long id;
	
	private  String sujeto;
	
	private  String predicado;
	 
	private  String complemento;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSujeto() {
		return sujeto;
	}

	public void setSujeto(String sujeto) {
		this.sujeto = sujeto;
	}

	public String getPredicado() {
		return predicado;
	}

	public void setPredicado(String predicado) {
		this.predicado = predicado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	

}
