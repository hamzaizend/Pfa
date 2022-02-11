package com.PfaKids.Pfa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contenu")
public class Contenu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private String url ;
	public Contenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contenu(Long id, String url, String type, String description, Float duree, String icon) {
		super();
		this.id = id;
		this.url = url;
		this.type = type;
		this.description = description;
		this.duree = duree;
		this.icon = icon;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getDuree() {
		return duree;
	}
	public void setDuree(Float duree) {
		this.duree = duree;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	private String type ;
	private String description ;
	private Float duree ;
	private String icon ;
	
	
	
}