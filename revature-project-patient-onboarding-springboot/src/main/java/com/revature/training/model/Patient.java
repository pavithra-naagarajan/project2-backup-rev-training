package com.revature.training.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patientstable")
public class Patient {

	@Id
	@GeneratedValue
	private long patientId;
	private String password;
	private String patientName;
	private String gender;
	private int patientAge;
	private String mobileNumber;
	private String mailId;
	private String address;
	
	
	public Patient() {
		
	}


	public Patient(long patientId, String address, String gender, String mailId, String mobileNumber, String password,int patientAge,
			String patientName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.patientAge = patientAge;
		this.mobileNumber = mobileNumber;
		this.mailId = mailId;
		this.address = address;
		this.password = password;
	}


	public long getPatientId() {
		return patientId;
	}


	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getPatientAge() {
		return patientAge;
	}


	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getMailId() {
		return mailId;
	}


	public void setMailId(String mailId) {
		this.mailId = mailId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", password=" + password + ", patientName=" + patientName
				+ ", gender=" + gender + ", patientAge=" + patientAge + ", mobileNumber=" + mobileNumber + ", mailId="
				+ mailId + ", address=" + address + "]";
	}


	
	




	
}
