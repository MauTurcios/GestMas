package com.DevMast.GestMas.models.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
 
@Entity
@Table(name="AlumnoRetirado")

public class AlumnoRetirado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Primer_nombre")
	@NotEmpty
	private String alumno1Nombre;
	
	@Column(name="Segundo_nombre")
	@NotEmpty
	private String alumno2Nombre;
	
	@Column(name="alumnoSegundoAp")
	@NotEmpty
	private String alumno1Apellido;
	
	@Column(name="Segundo_apellido")
	@NotEmpty
	private String alumno2Apellido;
	
	@Column(name="NIE")
	@NotEmpty
	private int NIE;
	
	@Column(name="Edad")
	@NotEmpty
	private int Edad;
	
	@Column(name="Genero")
	@NotEmpty
	private String Genero;
	
	@Column(name="Nacionalidad")
	@NotEmpty
	private String Nacionalidad;
	
	@Temporal(TemporalType.DATE)
	private Date fechaDeNacimiento;
	
	@Column(name="Lugar_Nacimiento")
	@NotEmpty
	private String lugarDeNacimiento;
	
	@Column(name="Direccion")
	@NotEmpty
	private String Direccion;
	
	@Column(name="Municipio")
	@NotEmpty
	private String Municipio;
	
	@Column(name="Departamento")
	@NotEmpty
	private String Departamento;
	
	@Column(name="Nom_Responsable")
	@NotEmpty
	private String nombreDelResponsable;
	
	@Column(name="Tel_Responsable")
	@NotEmpty
	private String telefonoDelResponsable;
	
	@Column(name="Inst_Procedencia")
	@NotEmpty
	private String institucionDeProcedencia;
	
	@Column(name="Grado")
	@NotEmpty
	private String Grado;
	
	@Column(name="Seccion")
	@NotEmpty
	private String Seccion;
}