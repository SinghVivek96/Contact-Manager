package com.scm.contact_manager.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "USER")
@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter@Setter
	private int id;
	@Getter@Setter
	private String name;
	@Getter@Setter
	@Column(unique = true)
	private String email;
	@Getter@Setter
	private String password;
	@Getter@Setter
	private String role;
	@Getter@Setter
	private boolean enabled;
	@Getter@Setter
	private String imageURL;
	@Getter@Setter
	@Column(length = 500)
	private String about;
	
	@Getter@Setter
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Contact> contacts = new ArrayList<Contact>();
	
	public User(String name, String email, String password, String role, boolean enabled, String imageURL,
			String about) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
		this.imageURL = imageURL;
		this.about = about;
	}
	
	
}
