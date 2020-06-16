package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "AliquotaIva")
public class AliquotaIva {
	// Costanti
	public static final String PROPERTY_idAliquota = "idaliquota";
	public static final String PROPERTY_aliquota = "aliquota";	
	public static final String PROPERTY_descrizione = "descrizione";	

	//Attributi
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idaliquota;

	@Column(name = "Aliquota")
	@NotBlank(message = "Il campo non può essere vuoto")
	private Integer aliquota;

	@Column(name = "Descrizione")
	@NotBlank(message = "Il campo non può essere vuoto")
	private String descrizione;

	//Get e Set
	public int getIdaliquota() {
		return idaliquota;
	}

	public void setIdaliquota(int idaliquota) {
		this.idaliquota = idaliquota;
	}

	public Integer getAliquota() {
		return aliquota;
	}

	public void setAliquota(Integer aliquota) {
		this.aliquota = aliquota;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	//Costruttori
	public AliquotaIva() {
		this.inizializza();
	}
	private void inizializza() {
		this.idaliquota=0;
		this.aliquota=null;
		this.descrizione=null;
	}

}
