package com.crud264.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JsonIgnoreProperties("reservas")
    @JoinColumn(name = "num_serie")
    private Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "dni")
    @JsonIgnoreProperties("reservas")
    private Investigador investigador;
    
	private LocalDate  fecha_comienzo;
	private LocalDate  fecha_final;
	public Reserva(int id, Equipo equipo, Investigador investigador, LocalDate  fecha_comienzo, LocalDate  fecha_final) {
		super();
		this.id = id;
		this.equipo = equipo;
		this.investigador = investigador;
		this.fecha_comienzo = fecha_comienzo;
		this.fecha_final = fecha_final;
	}
	public Reserva() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public Investigador getInvestigador() {
		return investigador;
	}
	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}
	public LocalDate  getFecha_comienzo() {
		return fecha_comienzo;
	}
	public void setFecha_comienzo(LocalDate  fecha_comienzo) {
		this.fecha_comienzo = fecha_comienzo;
	}
	public LocalDate  getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(LocalDate  fecha_final) {
		this.fecha_final = fecha_final;
	}
	
	
	
	

}
