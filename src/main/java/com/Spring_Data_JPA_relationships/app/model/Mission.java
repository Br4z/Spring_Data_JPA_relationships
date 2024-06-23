package com.Spring_Data_JPA_relationships.app.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Mission {
	@Id
	@GeneratedValue
	private Integer identifier;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private LocalDate start_date;

	@Column(nullable = false)
	private LocalDate end_date;

	@ManyToMany(mappedBy = "missions")
	private List <Employee> employees;
}
