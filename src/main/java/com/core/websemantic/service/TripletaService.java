package com.core.websemantic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.websemantic.converter.Convertidor;
import com.core.websemantic.entity.Tripletas;
import com.core.websemantic.model.MTripleta;
import com.core.websemantic.reposiroty.TripletaRepository;

import org.springframework.beans.factory.annotation.Qualifier;



@Service("service")
public class TripletaService {
	
	@Autowired
	@Qualifier("repositorio")
	private TripletaRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public boolean crear(Tripletas tripleta) {
		try {
			repositorio.save(tripleta);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean actualziar(Tripletas tripleta) {
		try {
			repositorio.save(tripleta);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	
	public List<MTripleta>obtener(){
		return convertidor.convertirLista(repositorio.findAll());
	}
	
	
	public List<MTripleta>obtenerSujeto(String sujeto){
		return convertidor.convertirLista(repositorio.findBySujeto(sujeto));
	}
	

}
