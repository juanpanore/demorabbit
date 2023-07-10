package com.example.demo.domain.client;

import java.util.Date;


public class Client {

	private String id;
	private String documentType;
	private String documentNumber;
	private String firstName;
	private String secondName;
	private String lastName;
	private String secondSurname;
	private String sex;
	private Date birthDate;
	private String email;
	private Number cellphone;
	private Date createdDate;
	private Date modifiedDate;
	
	public Client() {
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Number getCellphone() {
		return cellphone;
	}

	public void setCellphone(Number cellphone) {
		this.cellphone = cellphone;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
		

	@Override
	public String toString() {
		return "Client [id=" + id + ", documentType=" + documentType + ", documentNumber=" + documentNumber
				+ ", firstName=" + firstName + ", secondName=" + secondName + ", lastName=" + lastName
				+ ", secondSurname=" + secondSurname + ", sex=" + sex + ", birthDate=" + birthDate + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + ", getBirthDate()=" + getBirthDate()
				+ ", getCreatedDate()=" + getCreatedDate() + ", getModifiedDate()=" + getModifiedDate() + ", getId()="
				+ getId() + ", getDocumentType()=" + getDocumentType() + ", getDocumentNumber()=" + getDocumentNumber()
				+ ", getFirstName()=" + getFirstName() + ", getSecondName()=" + getSecondName() + ", getLastName()="
				+ getLastName() + ", getSecondSurname()=" + getSecondSurname() + ", getsex()=" + getSex()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


}
