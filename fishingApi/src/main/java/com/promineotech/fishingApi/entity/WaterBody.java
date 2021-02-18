package com.promineotech.fishingApi.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class WaterBody {
	
	private Long water_id;
 
	private String name;
	private String fishery_type;
	private String species;
	private Set<User> users;
	@OneToMany(mappedBy="waterBody")
	private Set<Results> results;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getWater_id() {
		return water_id;
	}
	
	public void setWater_id(Long water_id) {
		this.water_id = water_id;
	}
     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFishery_type() {
		return fishery_type;
	}

	public void setFishery_type(String fishery_type) {
		this.fishery_type = fishery_type;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "fishing_hole",
	joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "water_id", referencedColumnName = "user_id"))
	public Set<User> getUsers() {
		return users;
	}

	public Set<Results> getResults() {
		return results;
	}

	public void setResults(Set<Results> results) {
		this.results = results;
	}

}
