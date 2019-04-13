package com.riadhelkamel.FicheDePaie.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Bareme implements Serializable {

	private static final long serialVersionUID = 1L;
     
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Code;
	private double SalH;
	private String Grade;
  
	     @Column
	    @ElementCollection(targetClass=Integer.class)
	private List<Tperso>tpersonne = new ArrayList<Tperso>()   ;
	
	public Bareme() {
		super();
	
	}

	public Bareme(int code, double salH, String grade) {
		super();
		Code = code;
		SalH = salH;
		Grade = grade;
	}
	
	
	@OneToMany(targetEntity=Tperso.class , mappedBy = "Bareme" , fetch=FetchType.EAGER , cascade=CascadeType.ALL)
	public List<Tperso> getTpersonne() {
		return tpersonne;
	}

	public void setTpersonne(List<Tperso> tpersonne) {
		this.tpersonne = tpersonne;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public double getSalH() {
		return SalH;
	}

	public void setSalH(double salH) {
		SalH = salH;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	@Override
	public String toString() {
		return "Bareme [Code=" + Code + ", SalH=" + SalH + ", Grade=" + Grade + "]";
	}

	
}