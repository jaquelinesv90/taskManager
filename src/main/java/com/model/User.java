package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.*;


@Entity
@Table(name = "User_task" , uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	
	@Id   
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private String name; 
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(
					name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
					name = "role_id", referencedColumnName = "id"))
	private Collection < Role > roles;
	
	public User() {}
	
	public User(String email,String name,String password) {
		this.email = email;
		this.name = name;
		this.password = password;
	}
	
	public User(String email,String name,String password,Collection < Role > roles) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.roles = roles;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}