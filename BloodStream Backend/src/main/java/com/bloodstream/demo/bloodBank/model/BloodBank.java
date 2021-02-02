package com.bloodstream.demo.bloodBank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blood_bank")
public class BloodBank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long blood_bank_id;
	
	private String name, email, password, contact_number, role, address, location;

	public Long getBlood_bank_id() {
		return blood_bank_id;
	}

	public void setBlood_bank_id(Long blood_bank_id) {
		this.blood_bank_id = blood_bank_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "BloodBank [blood_bank_id=" + blood_bank_id + ", name=" + name + ", email=" + email + ", password="
				+ password + ", contact_number=" + contact_number + ", role=" + role + ", address=" + address
				+ ", location=" + location + "]";
	}

}
