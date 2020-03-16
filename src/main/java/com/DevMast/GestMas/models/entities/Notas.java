package com.DevMast.GestMas.models.entities;

import java.io.Serializable; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="notas")

public class Notas implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NIE")
	private int NIE;
	
	@Column(name="N1P1")
	private int nota1Periodo1;
	
	@Column(name="N2P1")
	private int nota2Periodo1;
	
	@Column(name="N3P1")
	private int nota3Periodo1;
	
	@Column(name="NF1")
	private int notaFinal1;
	
	@Column(name="N1P2")
	private int nota1Periodo2;
	
	@Column(name="N2P2")
	private int nota2Periodo2;
	
	@Column(name="N3P2")
	private int nota3Periodo2;
	
	@Column(name="NF2")
	private int notaFinal2;
	
	@Column(name="N1P3")
	private int nota1Periodo3;
	
	@Column(name="N2P3")
	private int nota2Periodo3;
	
	@Column(name="N3P3")
	private int nota3Periodo3;
	
	@Column(name="NF3")
	private int notaFinal3;
	
	@Column(name="NF")
	private int notaFinal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNIE() {
		return NIE;
	}

	public void setNIE(int nIE) {
		NIE = nIE;
	}

	public int getNota1Periodo1() {
		return nota1Periodo1;
	}

	public void setNota1Periodo1(int nota1Periodo1) {
		this.nota1Periodo1 = nota1Periodo1;
	}

	public int getNota2Periodo1() {
		return nota2Periodo1;
	}

	public void setNota2Periodo1(int nota2Periodo1) {
		this.nota2Periodo1 = nota2Periodo1;
	}

	public int getNota3Periodo1() {
		return nota3Periodo1;
	}

	public void setNota3Periodo1(int nota3Periodo1) {
		this.nota3Periodo1 = nota3Periodo1;
	}

	public int getNotaFinal1() {
		return notaFinal1;
	}

	public void setNotaFinal1(int notaFinal1) {
		this.notaFinal1 = notaFinal1;
	}

	public int getNota1Periodo2() {
		return nota1Periodo2;
	}

	public void setNota1Periodo2(int nota1Periodo2) {
		this.nota1Periodo2 = nota1Periodo2;
	}

	public int getNota2Periodo2() {
		return nota2Periodo2;
	}

	public void setNota2Periodo2(int nota2Periodo2) {
		this.nota2Periodo2 = nota2Periodo2;
	}

	public int getNota3Periodo2() {
		return nota3Periodo2;
	}

	public void setNota3Periodo2(int nota3Periodo2) {
		this.nota3Periodo2 = nota3Periodo2;
	}

	public int getNotaFinal2() {
		return notaFinal2;
	}

	public void setNotaFinal2(int notaFinal2) {
		this.notaFinal2 = notaFinal2;
	}

	public int getNota1Periodo3() {
		return nota1Periodo3;
	}

	public void setNota1Periodo3(int nota1Periodo3) {
		this.nota1Periodo3 = nota1Periodo3;
	}

	public int getNota2Periodo3() {
		return nota2Periodo3;
	}

	public void setNota2Periodo3(int nota2Periodo3) {
		this.nota2Periodo3 = nota2Periodo3;
	}

	public int getNota3Periodo3() {
		return nota3Periodo3;
	}

	public void setNota3Periodo3(int nota3Periodo3) {
		this.nota3Periodo3 = nota3Periodo3;
	}

	public int getNotaFinal3() {
		return notaFinal3;
	}

	public void setNotaFinal3(int notaFinal3) {
		this.notaFinal3 = notaFinal3;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	
	
	
}
