package com.riadhelkamel.FicheDePaie.model;

	import java.io.Serializable;
	import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.GenericGenerator;

	@Entity
	public class Tsalaire implements Serializable {
	     private static final long serialVersionUID = 1L;
	     
	     
	    @Id
	     @Column(name = "Matri", unique = true, nullable = false)
	     @GeneratedValue(generator = "gen")
	     @GenericGenerator(name = "gen", strategy = "foreign", 
	                       parameters = {@Parameter(name = "property", value = "Tperso") })
	     private long Matri;
	     private int Mois;
	     private Date Année;
	    private int NbreH;
	    private double Alloc;
	    private double SalMens;
	    private double retraite;
	    
	    
		
	    
	    private Tperso tperso;

	    public Tsalaire() {
			super();
		}
		public Tsalaire(int mois, Date année, int nbreH, double alloc, double salMens, double retraite) {
			super();
			Mois = mois;
			Année = année;
			NbreH = nbreH;
			Alloc = alloc;
			SalMens = salMens;
			this.retraite = retraite;
		}
		public int getMois() {
			return Mois;
		}
		public void setMois(int mois) {
			Mois = mois;
		}
		
		public Date getAnnée() {
			return Année;
		}
		public void setAnnée(Date année) {
			Année = année;
		}
		public int getNbreH() {
			return NbreH;
		}
		public void setNbreH(int nbreH) {
			NbreH = nbreH;
		}
		public double getAlloc() {
			return Alloc;
		}
		public void setAlloc(double alloc) {
			Alloc = alloc;
		}
		public double getSalMens() {
			return SalMens;
		}
		public void setSalMens(double salMens) {
			SalMens = salMens;
		}
		public double getRetraite() {
			return retraite;
		}
		public void setRetraite(double retraite) {
			this.retraite = retraite;
		}
		@ManyToOne
		@JoinColumn(name = "Matri")
		public Tperso getTperso() {
			return tperso;
		}
		public void setTperso(Tperso tperso) {
			this.tperso = tperso;
		}
		
		

	}

	
	
	
	
	
	
	
	
	
	

