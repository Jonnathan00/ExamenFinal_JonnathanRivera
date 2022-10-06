package com.examen.examenFinal.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.examen.examenFinal.entity.Profesor;


public interface ProfesorService {
	
	public Iterable<Profesor> findAll();
	
	public Page<Profesor> findAll(Pageable pageable);
	
	public Optional<Profesor> findById(Long id);
	
	public Profesor save(Profesor usuario);
	
	public void deleteById(Long id);
}
