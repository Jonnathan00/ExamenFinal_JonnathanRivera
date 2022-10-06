package com.examen.examenFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.examenFinal.entity.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

}
