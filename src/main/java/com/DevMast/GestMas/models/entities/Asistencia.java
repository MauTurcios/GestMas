package com.DevMast.GestMas.models.entities;

import java.io.Serializable; 
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="asistencia")

public class Asistencia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NIE")
	@NotEmpty
	private int NIE;
	
	@Temporal(TemporalType.DATE)
	private Date Fecha;
	
	@Column(name="Estado")
	@NotEmpty
	private String estadoDeAsistencia;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable=false)
	private Alumnos alumnos;
}
