

package com.example.demo.models;

import jakarta.persistence.*;
//Para decir que es un modelo real
@Entity
@Table(name = "usuario")
public class UsuarioModel{
	//Le estamos diciendo que es el id que se va generar , va ser unico y no puede ser nulo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	
	
	private String nombre;
	private String email;
	private Integer prioridad;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}
	
	
	
	
}