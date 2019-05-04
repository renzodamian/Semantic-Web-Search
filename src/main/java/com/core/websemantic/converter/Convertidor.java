package com.core.websemantic.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.core.websemantic.entity.Tripletas;
import com.core.websemantic.model.MTripleta;

@Component("convertidor")
public class Convertidor {
	
	public List<MTripleta> convertirLista(List<Tripletas> tripletas){
		List<MTripleta> mtripletas = new ArrayList<>();
		for (Tripletas tripleta : tripletas) {
			mtripletas.add(new MTripleta(tripleta));
		}
		return mtripletas ;
	}
	

}
