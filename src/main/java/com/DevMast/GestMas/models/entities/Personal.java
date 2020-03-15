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
@Table(name="personal")

public class Personal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Primer_nombre")
	@NotEmpty
	private String docente1Nombre;
	
	@Column(name="Segundo_nombre")
	@NotEmpty
	private String docente2Nombre;
	
	@Column(name="Primer_apellido")
	@NotEmpty
	private String docente1Apellido;
	
	@Column(name="Segundo_apellido")
	@NotEmpty
	private String docente2Apellido;
	
	@Column(name="Genero")
	@NotEmpty
	private String docenteGenero;
	
	@Column(name="DUI")
	@NotEmpty
	private String docenteDui;
	
	@Column(name="NIT")
	@NotEmpty
	private String docenteNit;
	
	@Column(name="NIP")
	@NotEmpty
	private String docenteNip;
	
	@Column(name="Nacionalidad")
	@NotEmpty
	private String docenteNacionalidad;	
	
	@Temporal(TemporalType.DATE)
	private Date docenteFechaNacimiento;
	
	@Column(name="Lugar_Nacimiento")
	@NotEmpty
	private String docenteLugarNacimiento;
	
	@Column(name="Est_civil")
	@NotEmpty
	private String docenteEstadoCivil;
	
	@Column(name="Telefono")
	@NotEmpty
	private int docenteTelefono;
	
	@Column(name="Direccion")
	@NotEmpty
	private String docenteDireccion;
	
	@Column(name="Municipio")
	@NotEmpty
	private String docenteMunicipio;
	
	@Column(name="Departamento")
	@NotEmpty
	private String docenteDepartamento;
	
	@Column(name="Email")
	@NotEmpty
	private String docenteEmail;
	
	@Column(name="Especialidad")
	@NotEmpty
	private String docenteEspecialidad;
	
	@Column(name="Cargo")
	@NotEmpty
	private String docenteCargo;
	
	@Column(name="Grado")
	@NotEmpty
	private String docenteGrado;
	
}
