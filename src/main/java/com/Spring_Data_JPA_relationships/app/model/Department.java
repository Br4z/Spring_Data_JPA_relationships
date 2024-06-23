package com.Spring_Data_JPA_relationships.app.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Department {
	@Id
	@GeneratedValue
	private Integer identifier;

	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "department")
	private List <Employee> employees;
}
