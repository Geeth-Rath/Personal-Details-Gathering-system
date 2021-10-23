package com.DetailsMangmentSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teachers")
public class Teacher {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tid;
	
	@Column(name = "first_name", nullable = false)
	private String tFirstName;
	
	@Column(name = "last_name")
	private String tLastName;
	
	@Column(name = "email")
	private String tEmail;
	
	

	public Teacher() {
		
	}
	

	public Teacher(String tFirstName, String tLastName, String tEmail) {
		super();
		this.tid = tid;
		this.tFirstName = tFirstName;
		this.tLastName = tLastName;
		this.tEmail = tEmail;
	}


	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String gettFirstName() {
		return tFirstName;
	}

	public void settFirstName(String tFirstName) {
		this.tFirstName = tFirstName;
	}

	public String gettLastName() {
		return tLastName;
	}

	public void settLastName(String tLastName) {
		this.tLastName = tLastName;
	}

	public String gettEmail() {
		return tEmail;
	}

	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}
	
	
	
	}