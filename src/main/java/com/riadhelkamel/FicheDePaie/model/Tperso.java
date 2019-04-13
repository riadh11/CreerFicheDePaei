package com.riadhelkamel.FicheDePaie.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tperso implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Matri; 
	private String Nom;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date DtNais;
	
	private String Adres;
	private String SF;
	private int NENF ;
	
	     @Column
	    @ElementCollection(targetClass=Integer.class)
	private List<Tsalaire> tsalaire = new  ArrayList<Tsalaire>();
	
	public Tperso() {		
	}
	
	public Tperso( String nom, Date dtNais, String adres, String sF, int nENF) {
		super();
	
		Nom = nom;
		DtNais = dtNais;
		Adres = adres;
		SF = sF;
		NENF = nENF;
	}
		public Long getMatri() {
		return Matri;
	}

	public void setMatri(Long matri) {
		Matri = matri;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public Date getDtNais() {
		return DtNais;
	}

	public void setDtNais(Date dtNais) {
		DtNais = dtNais;
	}

	public String getAdres() {
		return Adres;
	}

	public void setAdres(String adres) {
		Adres = adres;
	}

	public String getSF() {
		return SF;
	}

	
	public void setSF(String sF) {
		SF = sF;
	}

	public int getNENF() {
		return NENF;
	}

	public void setNENF(int nENF) {
		NENF = nENF;
	}
	@OneToMany(targetEntity=Tsalaire.class , mappedBy = "tperso" , fetch=FetchType.EAGER , cascade=CascadeType.ALL)
	public List<Tsalaire> getTsalaire() {
		return tsalaire;
	}

	public void setTsalaire(List<Tsalaire> tsalaire) {
		this.tsalaire = tsalaire;
	}
	
	
	
}