package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message = "is requored")
	@Size(min=1,message="is Required")
	private String lastName;
	
	@NotNull(message = "is requored")
	@Min(value=0, message="Must be greator than or eual to zero")
	@Max(value=10, message ="Must be less than or equal ten")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message = "ONLY 5 chars or digits")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	
	
	

}
