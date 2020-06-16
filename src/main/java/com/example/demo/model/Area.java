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
@Table(name = "Area")
public class Area {
 // Costanti
 public static final String PROPERTY_idArea = "idarea";
 public static final String PROPERTY_codice = "codice";
 // Attributi
 
 @Column(name = "id")
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int idarea;
 

 @Column(name = "Codice")
 @NotBlank(message = "Il campo non può essere vuoto")
 private String codice;
 
 @Column(name = "Area")
 @NotBlank(message = "Il campo non può essere vuoto")
 private String area;
 // Get e Set


 public String getArea() {
  return area;
 }

 public void setArea(String area) {
  this.area = area;
 }

 public int getIdarea() {
  return idarea;
 }

 public void setIdarea(int idarea) {
  this.idarea = idarea;
 }



 public String getCodice() {
  return codice;
 }

 public void setCodice(String codice) {
  this.codice = codice;
 }

 // Costruttori
 public Area() {
  this.inizializza();
 }

 private void inizializza() {
  this.idarea = 0;
  this.codice = null;
 }
}