package com.coffee.kubernetes.project.firstContainer;

import java.beans.JavaBean;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coffee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NonNull
	private String brand;
	
	@NonNull
	private String name;
	
	@NonNull
	private String beanType;
	
	@NonNull
	private String notes;
	
	private int score;
	
	private String reviewer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeanType() {
		return beanType;
	}

	public void setBeanType(String beanType) {
		this.beanType = beanType;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}
}
