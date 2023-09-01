package com.excercise.day6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ChildrenDetails")
public class ChildEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int babyId;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String motherName;
	private String address;
	public ChildEntity(int babyId, String firstName, String lastName, String fatherName, String motherName,
			String address) {
		super();
		this.babyId = babyId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
	}
	public ChildEntity() {
		super();
		
	}
	public int getBabyId() {
		return babyId;
	}
	public void setBabyId(int babyId) {
		this.babyId = babyId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
