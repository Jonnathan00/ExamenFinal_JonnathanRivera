package com.examen.examenFinal.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.examen.examenFinal.entity.Curso;

public interface CursoService {

public Iterable<Curso> findAll();
	
	public Page<Curso> findAll(Pageable pageable);
	
	public Optional<Curso> findById(Long id);
	
	public Curso save(Curso usuario);
	
	public void deleteById(Long id);
}
