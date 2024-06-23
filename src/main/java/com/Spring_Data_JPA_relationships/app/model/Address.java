package com.Spring_Data_JPA_relationships.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Address {
	@Id
	@GeneratedValue
	private Integer identifier;

	@Column(nullable = false)
	private String street;

	@Column(nullable = false)
	private String house_number;
}
