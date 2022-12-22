package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "fname", nullable = false)
	private String fnme;
	@Column(name = "lname", nullable = false)
	private String lnme;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "mobile_no", nullable = false, length = 11)
	private long mno;
	@Column(name = "pass", nullable = false)
	private String pass;

	@Override
	public String toString() {
		return "Registration [id=" + id + ", fnme=" + fnme + ", lnme=" + lnme + ", email=" + email + ", mno=" + mno
				+ ", pass=" + pass + "]";
	}

	public Registration() {
		// TODO Auto-generated constructor stub
	}

	public Registration(long id, String fnme, String lnme, String email, long mno, String pass) {
		super();
		this.id = id;
		this.fnme = fnme;
		this.lnme = lnme;
		this.email = email;
		this.mno = mno;
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFnme() {
		return fnme;
	}

	public void setFnme(String fnme) {
		this.fnme = fnme;
	}

	public String getLnme() {
		return lnme;
	}

	public void setLnme(String lnme) {
		this.lnme = lnme;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMno() {
		return mno;
	}

	public void setMno(long mno) {
		this.mno = mno;
	}

}
