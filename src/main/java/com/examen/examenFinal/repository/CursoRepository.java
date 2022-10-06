package com.examen.examenFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examenFinal.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
