package com.examen.examenFinal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -544127404337621930L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long curso_Id;

	private Long prof_id;

	@Column(length = 25)
	private String nombre;
	@Column(length = 200)
	private String nivel;
	@Column(length = 200)
	private String descripcion;

	public Long getCurso_Id() {
		return curso_Id;
	}

	public void setCurso_Id(Long curso_Id) {
		this.curso_Id = curso_Id;
	}

	public Long getProf_id() {
		return prof_id;
	}

	public void setProf_id(Long prof_id) {
		this.prof_id = prof_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
