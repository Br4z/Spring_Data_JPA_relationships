package com.Spring_Data_JPA_relationships.app.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer identifier;

	@Column(nullable = false)
	private String first_name;

	@Column(nullable = false)
	private String last_name;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private LocalDate birthdate;

	@Enumerated(EnumType.STRING)
	private EmployeeRole role;

	@OneToOne
	private Address address;

	@ManyToOne
	private Department department;

	@ManyToMany
	@JoinTable(
		joinColumns = @JoinColumn(name = "employee_id"),
		inverseJoinColumns = @JoinColumn(name = "mission_id")
	)
	private List <Mission> missions;
}
