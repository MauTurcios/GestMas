package com.DevMast.GestMas.models.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Notas")

public class Notas implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NIE")
	@NotEmpty
	private int NIE;
	
	@Column(name="N1P1")
	@NotEmpty
	private int nota1Periodo1;
	
	@Column(name="N2P1")
	@NotEmpty
	private int nota2Periodo1;
	
	@Column(name="N3P1")
	@NotEmpty
	private int nota3Periodo1;
	
	@Column(name="NF1")
	@NotEmpty
	private int notaFinal1;
	
	@Column(name="N1P2")
	@NotEmpty
	private int nota1Periodo2;
	
	@Column(name="N2P2")
	@NotEmpty
	private int nota2Periodo2;
	
	@Column(name="N3P2")
	@NotEmpty
	private int nota3Periodo2;
	
	@Column(name="NF2")
	@NotEmpty
	private int notaFinal2;
	
	@Column(name="N1P3")
	@NotEmpty
	private int nota1Periodo3;
	
	@Column(name="N2P3")
	@NotEmpty
	private int nota2Periodo3;
	
	@Column(name="N3P3")
	@NotEmpty
	private int nota3Periodo3;
	
	@Column(name="NF3")
	@NotEmpty
	private int notaFinal3;
	
	@Column(name="NF")
	@NotEmpty
	private int notaFinal;
	
}
