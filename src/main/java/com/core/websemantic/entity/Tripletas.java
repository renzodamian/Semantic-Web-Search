package com.core.websemantic.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="TRIPLETA")
@Entity
public class Tripletas  implements Serializable{
	
	
	
	
	public Tripletas() {
	
	}


	public Tripletas(long id, String sujeto, String predicado, String complemento) {
		this.id = id;
		this.sujeto = sujeto;
		this.predicado = predicado;
		this.complemento = complemento;
	}


	@GeneratedValue
	@Id
	@Column(name="ID_TRIPLETA")
	private long id;
	
	@Column(name="SUJETO")
	private  String sujeto;
	
	
	@Column(name="PREDICADO")
	private  String predicado;
	 
	
	@Column(name="COMPLEMENTO")
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
