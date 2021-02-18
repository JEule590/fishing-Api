package com.promineotech.fishingApi.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Notes {
	
	private Long note_id;
	private Long results_id;
	private Set<Notes> notes;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getNote_id() {
		return note_id;
	}
	
	public void setNote_id(Long note_id) {
		this.note_id = note_id;
	}

	public Long getResults_id() {
		return results_id;
	}

	@OneToOne
	@JoinColumn(name="results_Id")
	public void setResults_id(Long results_id) {
		this.results_id = results_id;
	}

	public Set<Notes> getNotes() {
		return notes;
	}

	public void setNotes(Set<Notes> notes) {
		this.notes = notes;
	}

}
