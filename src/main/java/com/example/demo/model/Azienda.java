package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Azienda")
public class Azienda {
	 // Costanti
	 public static final String PROPERTY_idAzienda = "idazienda";
	 public static final String PROPERTY_ContractID= "contractID";
	 public static final String PROPERTY_indirizzo = "indirizzo";
	 public static final String PROPERTY_ragioneSociale= "ragioneSociale";
	 public static final String PROPERTY_idGruppo = "idGruppo";
	 
	//Attributi
		 @Column(name = "id")
		 @Id
		 @GeneratedValue(strategy = GenerationType.AUTO)
		 private int idazienda;
		 
		 
		 @Column(name = "ContractId")
		 @NotBlank(message = "Il campo non può essere vuoto")
		 private String contractid;
		 
		 @Column(name = "Indirizzo")
		 @NotBlank(message = "Il campo non può essere vuoto")
		 private String indirizzo;
		 
		 @Column(name = "RagioneSociale")
		 @NotBlank(message = "Il campo non può essere vuoto")
		 private String ragioneSociale;
		 
		 @ManyToOne
		 @JoinColumn(name="idgruppo")
		 @NotNull(message="il campo non può essere nullo")
		 private Gruppo oGruppo;

		 
		 //Get e Set
		 
		 public int getIdazienda() {
				return idazienda;
			}

			public void setIdazienda(int idazienda) {
				this.idazienda = idazienda;
			}

			public String getContractid() {
				return contractid;
			}

			public void setContractid(String contractid) {
				this.contractid = contractid;
			}

			public String getIndirizzo() {
				return indirizzo;
			}

			public void setIndirizzo(String indirizzo) {
				this.indirizzo = indirizzo;
			}

			public String getRagioneSociale() {
				return ragioneSociale;
			}

			public void setRagioneSociale(String ragioneSociale) {
				this.ragioneSociale = ragioneSociale;
			}

			public Gruppo getoGruppo() {
				return oGruppo;
			}

			public void setoGruppo(Gruppo oGruppo) {
				this.oGruppo = oGruppo;
			}
		 
		 
}
