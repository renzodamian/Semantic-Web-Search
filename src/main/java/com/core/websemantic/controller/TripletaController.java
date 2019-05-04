package com.core.websemantic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.core.websemantic.model.MTripleta;
import com.core.websemantic.service.TripletaService;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;


@RestController
@RequestMapping("/v1")
public class TripletaController {
	@Autowired
	@Qualifier("service")
	TripletaService service;

	@GetMapping("/all")
	public List<MTripleta>obtenerTodasTripletas(){
		return service.obtener();
	}
	
	@GetMapping("/sujeto/{sujeto}")
	public List<MTripleta>obtenerSTripletas(@PathVariable("sujeto")String sujeto){
		
	return service.obtenerSujeto(sujeto);
	

	}


}
