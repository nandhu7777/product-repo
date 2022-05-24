package com.sapient.aem.model;

import java.time.LocalDate;

public class Customer {
	
	 private Integer customerid ;
	 private String customername;
	 private LocalDate birthdate;
	  private String address ;
	  private String email ;
	 private Long  mobile ;
	 
	 public Customer() {
		 
	 }

	public Customer(Integer customerid, String customername, LocalDate birthdate, String address, String email,
			Long mobile) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.birthdate = birthdate;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", birthdate=" + birthdate
				+ ", address=" + address + ", email=" + email + ", mobile=" + mobile + "]";
	}

	

}
