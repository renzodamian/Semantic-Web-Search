package com.core.websemantic.reposiroty;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.core.websemantic.entity.Tripletas;

@Repository("repositorio")
public interface TripletaRepository  extends JpaRepository<Tripletas, Serializable>{

	
	
	
	public abstract List<Tripletas> findBySujeto(String sujeto);
	
	public abstract List<Tripletas> findByPredicado(String predicado);
	

	public abstract Tripletas findBySujetoAndPredicadoAndComplemento (String sujeto,String predicado,String complemento);


}
