package com.examen.examenFinal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 70687550406231779L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prof_id;

	private Long depto_id;

	@Column(length = 25)
	private String nombre;
	@Column(length = 200)
	private String direccion;
	@Column(length = 200)
	private String telefono;

	public Long getProf_id() {
		return prof_id;
	}

	public void setProf_id(Long prof_id) {
		this.prof_id = prof_id;
	}

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
