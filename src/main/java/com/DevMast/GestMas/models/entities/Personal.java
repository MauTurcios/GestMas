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
@Table(name = "personal")

public class Personal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Primer_nombre")
	private String docente1Nombre;

	@Column(name = "Segundo_nombre")
	private String docente2Nombre;

	@Column(name = "Primer_apellido")
	private String docente1Apellido;

	@Column(name = "Segundo_apellido")
	private String docente2Apellido;

	@Column(name = "Genero")
	private String docenteGenero;

	@Column(name = "DUI")
	private String docenteDui;

	@Column(name = "NIT")
	private String docenteNit;

	@Column(name = "NIP")
	private String docenteNip;

	@Column(name = "Nacionalidad")
	private String docenteNacionalidad;

	@Temporal(TemporalType.DATE)
	private Date Fecha_Nacimiento;

	@Column(name = "Lugar_Nacimiento")
	private String docenteLugarNacimiento;

	@Column(name = "Est_civil")
	private String docenteEstadoCivil;

	@Column(name = "Telefono")
	private int docenteTelefono;

	@Column(name = "Direccion")
	private String docenteDireccion;

	@Column(name = "Municipio")
	private String docenteMunicipio;

	@Column(name = "Departamento")
	private String docenteDepartamento;

	@Column(name = "Email")
	private String docenteEmail;

	@Column(name = "Especialidad")
	private String docenteEspecialidad;

	@Column(name = "Cargo")
	private String docenteCargo;

	@Column(name = "Grado")
	private int docenteGrado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocente1Nombre() {
		return docente1Nombre;
	}

	public void setDocente1Nombre(String docente1Nombre) {
		this.docente1Nombre = docente1Nombre;
	}

	public String getDocente2Nombre() {
		return docente2Nombre;
	}

	public void setDocente2Nombre(String docente2Nombre) {
		this.docente2Nombre = docente2Nombre;
	}

	public String getDocente1Apellido() {
		return docente1Apellido;
	}

	public void setDocente1Apellido(String docente1Apellido) {
		this.docente1Apellido = docente1Apellido;
	}

	public String getDocente2Apellido() {
		return docente2Apellido;
	}

	public void setDocente2Apellido(String docente2Apellido) {
		this.docente2Apellido = docente2Apellido;
	}

	public String getDocenteGenero() {
		return docenteGenero;
	}

	public void setDocenteGenero(String docenteGenero) {
		this.docenteGenero = docenteGenero;
	}

	public String getDocenteDui() {
		return docenteDui;
	}

	public void setDocenteDui(String docenteDui) {
		this.docenteDui = docenteDui;
	}

	public String getDocenteNit() {
		return docenteNit;
	}

	public void setDocenteNit(String docenteNit) {
		this.docenteNit = docenteNit;
	}

	public String getDocenteNip() {
		return docenteNip;
	}

	public void setDocenteNip(String docenteNip) {
		this.docenteNip = docenteNip;
	}

	public String getDocenteNacionalidad() {
		return docenteNacionalidad;
	}

	public void setDocenteNacionalidad(String docenteNacionalidad) {
		this.docenteNacionalidad = docenteNacionalidad;
	}

	public Date getDocenteFechaNacimiento() {
		return Fecha_Nacimiento;
	}

	public void setDocenteFechaNacimiento(Date docenteFechaNacimiento) {
		this.Fecha_Nacimiento = docenteFechaNacimiento;
	}

	public String getDocenteLugarNacimiento() {
		return docenteLugarNacimiento;
	}

	public void setDocenteLugarNacimiento(String docenteLugarNacimiento) {
		this.docenteLugarNacimiento = docenteLugarNacimiento;
	}

	public String getDocenteEstadoCivil() {
		return docenteEstadoCivil;
	}

	public void setDocenteEstadoCivil(String docenteEstadoCivil) {
		this.docenteEstadoCivil = docenteEstadoCivil;
	}

	public int getDocenteTelefono() {
		return docenteTelefono;
	}

	public void setDocenteTelefono(int docenteTelefono) {
		this.docenteTelefono = docenteTelefono;
	}

	public String getDocenteDireccion() {
		return docenteDireccion;
	}

	public void setDocenteDireccion(String docenteDireccion) {
		this.docenteDireccion = docenteDireccion;
	}

	public String getDocenteMunicipio() {
		return docenteMunicipio;
	}

	public void setDocenteMunicipio(String docenteMunicipio) {
		this.docenteMunicipio = docenteMunicipio;
	}

	public String getDocenteDepartamento() {
		return docenteDepartamento;
	}

	public void setDocenteDepartamento(String docenteDepartamento) {
		this.docenteDepartamento = docenteDepartamento;
	}

	public String getDocenteEmail() {
		return docenteEmail;
	}

	public void setDocenteEmail(String docenteEmail) {
		this.docenteEmail = docenteEmail;
	}

	public String getDocenteEspecialidad() {
		return docenteEspecialidad;
	}

	public void setDocenteEspecialidad(String docenteEspecialidad) {
		this.docenteEspecialidad = docenteEspecialidad;
	}

	public String getDocenteCargo() {
		return docenteCargo;
	}

	public void setDocenteCargo(String docenteCargo) {
		this.docenteCargo = docenteCargo;
	}

	public String getDocenteGrado() {
		return docenteGrado;
	}

	public void setDocenteGrado(String docenteGrado) {
		this.docenteGrado = docenteGrado;
	}

}
