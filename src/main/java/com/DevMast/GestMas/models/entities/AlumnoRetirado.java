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

@Entity
@Table(name = "alumnoretirado")

public class AlumnoRetirado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Primer_nombre")
	private String alumno1Nombre;

	@Column(name = "Segundo_nombre")
	private String alumno2Nombre;

	@Column(name = "Primer_apellido")
	private String alumno1Apellido;

	@Column(name = "Segundo_apellido")
	private String alumno2Apellido;

	@Column(name = "NIE")
	private int NIE;

	@Column(name = "Edad")
	private int Edad;

	@Column(name = "Genero")
	private String Genero;

	@Column(name = "Nacionalidad")
	private String Nacionalidad;

	@Temporal(TemporalType.DATE)
	private Date Fecha_Nacimiento;

	@Column(name = "Lugar_Nacimiento")
	private String lugarDeNacimiento;

	@Column(name = "Direccion")
	private String Direccion;

	@Column(name = "Municipio")
	private String Municipio;

	@Column(name = "Departamento")
	private String Departamento;

	@Column(name = "Nom_Responsable")
	private String nombreDelResponsable;

	@Column(name = "Tel_Responsable")
	private String telefonoDelResponsable;

	@Column(name = "Inst_Procedencia")
	private String institucionDeProcedencia;

	@Column(name = "Grado")
	private String Grado;

	@Column(name = "Seccion")
	private String Seccion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlumno1Nombre() {
		return alumno1Nombre;
	}

	public void setAlumno1Nombre(String alumno1Nombre) {
		this.alumno1Nombre = alumno1Nombre;
	}

	public String getAlumno2Nombre() {
		return alumno2Nombre;
	}

	public void setAlumno2Nombre(String alumno2Nombre) {
		this.alumno2Nombre = alumno2Nombre;
	}

	public String getAlumno1Apellido() {
		return alumno1Apellido;
	}

	public void setAlumno1Apellido(String alumno1Apellido) {
		this.alumno1Apellido = alumno1Apellido;
	}

	public String getAlumno2Apellido() {
		return alumno2Apellido;
	}

	public void setAlumno2Apellido(String alumno2Apellido) {
		this.alumno2Apellido = alumno2Apellido;
	}

	public int getNIE() {
		return NIE;
	}

	public void setNIE(int nIE) {
		NIE = nIE;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public Date getFechaDeNacimiento() {
		return Fecha_Nacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.Fecha_Nacimiento = fechaDeNacimiento;
	}

	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public String getNombreDelResponsable() {
		return nombreDelResponsable;
	}

	public void setNombreDelResponsable(String nombreDelResponsable) {
		this.nombreDelResponsable = nombreDelResponsable;
	}

	public String getTelefonoDelResponsable() {
		return telefonoDelResponsable;
	}

	public void setTelefonoDelResponsable(String telefonoDelResponsable) {
		this.telefonoDelResponsable = telefonoDelResponsable;
	}

	public String getInstitucionDeProcedencia() {
		return institucionDeProcedencia;
	}

	public void setInstitucionDeProcedencia(String institucionDeProcedencia) {
		this.institucionDeProcedencia = institucionDeProcedencia;
	}

	public String getGrado() {
		return Grado;
	}

	public void setGrado(String grado) {
		Grado = grado;
	}

	public String getSeccion() {
		return Seccion;
	}

	public void setSeccion(String seccion) {
		Seccion = seccion;
	}

}