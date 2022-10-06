package com.examen.examenFinal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6052446959868641065L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long depto_id;
	
	@Column(length = 25)
	private String nombre;
	@Column(length = 200)
	private String director;
	@Column(length = 200)
	private String descripcion;

	public Long getDepto_id() {
		return depto_id;
	}

	public void setDepto_id(Long depto_id) {
		this.depto_id = depto_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
