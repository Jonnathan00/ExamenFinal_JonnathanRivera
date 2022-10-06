package com.examen.examenFinal.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.examen.examenFinal.entity.Departamento;

public interface DepartamentoService {

public Iterable<Departamento> findAll();
	
	public Page<Departamento> findAll(Pageable pageable);
	
	public Optional<Departamento> findById(Long id);
	
	public Departamento save(Departamento usuario);
	
	public void deleteById(Long id);
}
