package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "AnnoContabile")
public class AnnoContabile {
	//Costanti
	public static final String PROPERTY_idAnno = "idanno";
	public static final String PROPERTY_descrizione = "descrizione";
	public static final String PROPERTY_datainizio = "datainizio";
	public static final String PROPERTY_datafine = "datafine";
	//Attributi
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idanno;
	
	 @Column(name = "Descrizione")
	 @NotBlank(message = "Il campo non può essere vuoto")
	 private String descrizione;
	 
	 @Column(name = "DataInizio")
	 @NotBlank(message = "Il campo non può essere vuoto")
	 private Date datainizio;
	 
	 @Column(name = "DataFine")
	 @NotBlank(message = "Il campo non può essere vuoto")
	 private Date datafine;
	 
	 //Get e Set
	 public int getIdanno() {
			return idanno;
		}

		public void setIdanno(int idanno) {
			this.idanno = idanno;
		}

		public String getDescrizione() {
			return descrizione;
		}

		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}

		public Date getDatainizio() {
			return datainizio;
		}

		public void setDatainizio(Date datainizio) {
			this.datainizio = datainizio;
		}

		public Date getDatafine() {
			return datafine;
		}

		public void setDatafine(Date datafine) {
			this.datafine = datafine;
		}

	 
	 
	 //Costruttori
	 public AnnoContabile() {
		 this.inizializza();
	 }
	 
	
	private void inizializza() {
		 this.idanno=0;
		 this.descrizione=null;
		 this.datafine=null;
		 this.datainizio=null;
	 }
}
