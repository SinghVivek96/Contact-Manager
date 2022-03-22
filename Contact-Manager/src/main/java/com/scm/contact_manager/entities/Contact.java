package com.scm.contact_manager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CONTACT")
@ToString
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter@Setter int cId;
	@Getter@Setter private String name;
	@Getter@Setter private String secondName;
	@Getter@Setter private String work;
	@Column(unique = true)
	@Getter@Setter private String email;
	@Getter@Setter private String phone;
	@Column(length = 500)
	@Getter@Setter private String description;
	
	@Getter@Setter
	@ManyToOne
	private User user;
	
	public Contact(String name, String secondName, String work, String email, String phone,
			String description) {
		super();
		this.name = name;
		this.secondName = secondName;
		this.work = work;
		this.email = email;
		this.phone = phone;
		this.description = description;
	}
	
	
}
