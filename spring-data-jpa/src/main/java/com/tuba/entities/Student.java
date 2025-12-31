package com.tuba.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="first_name", nullable = false)
	private String firstName;
	
	@Column(name="last_namne",nullable = false)
	private String lastName;
	
	@Column(name = "birth_of_date",nullable = false)
	private Date birthOfDate;
}