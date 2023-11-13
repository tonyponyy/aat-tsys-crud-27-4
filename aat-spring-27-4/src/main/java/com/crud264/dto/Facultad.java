package com.crud264.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "facultades")
public class Facultad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String nombre;

    @OneToMany(mappedBy = "facultad")  
    private List<Equipo> equipos;

    @OneToMany(mappedBy = "facultad")  
    private List<Investigador> investigadores;

	public Facultad(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Facultad() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
