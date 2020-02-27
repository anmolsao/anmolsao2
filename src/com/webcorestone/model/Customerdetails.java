package com.webcorestone.model;

public class Customerdetails {
	
	private String Name;
	private String lastname;
	private String DOB;
	private String panno;
	private String email;
	private long Adharno;
	private long Accountno;
	private long Mobileno;
	private long accountbal;
	

	public long getAccountbal() {
		return accountbal;
	}
	public void setAccountbal(long accountbal) {
		this.accountbal = accountbal;
	}
	
	public long getMobileno() {
		return Mobileno;
	}
	public void setMobileno(long mobileno) {
		this.Mobileno = mobileno;
	}
	
	public long getAccountno() {
		return Accountno;
	}
	public void setAccountno(long accountno) {
		this.Accountno = accountno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAdharno() {
		return Adharno;
	}
	public void setAdharno(long adharno) {
		this.Adharno = adharno;
	}
	
	
}
