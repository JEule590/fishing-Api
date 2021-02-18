package com.promineotech.fishingApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Results {
	
	private Long result_id;
	private Long user_id;
	private Long number;
	private Long largest;
	private String method_used;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getResult_id() {
		return result_id;
	}
	
	public void setResult_id(Long result_id) {
		this.result_id = result_id;
	}

	@ManyToOne
	@JoinColumn(name = "user_id")
	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getLargest() {
		return largest;
	}

	public void setLargest(Long largest) {
		this.largest = largest;
	}

	public String getMethod_used() {
		return method_used;
	}

	public void setMethod_used(String method_used) {
		this.method_used = method_used;
	}
		

}
