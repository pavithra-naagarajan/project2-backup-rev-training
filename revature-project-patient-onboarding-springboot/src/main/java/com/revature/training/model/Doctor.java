
  package com.revature.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Doctor {
	  @Id
	  	private int doctorId;
	  	
	  	private String branch;
		private String doctorName;
		private String domain;
		private int experienceInYrs;
		private String gender;
		private String mobileNumber;
		private String password;
		private String status;
		
		
		public Doctor() {
			
		}


		public Doctor(int doctorId,String branch, String doctorName, String domain, int experienceInYrs, String gender,
				String mobileNumber, String password,String status) {
			super();
			this.doctorId = doctorId;
			this.branch = branch;
			this.doctorName = doctorName;
			this.domain = domain;
			this.experienceInYrs = experienceInYrs;
			this.gender = gender;
			this.mobileNumber = mobileNumber;
			this.password=password;
			this.status = status;
			
		}


		public int getDoctorId() {
			return doctorId;
		}


		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}


		public String getBranch() {
			return branch;
		}


		public void setBranch(String branch) {
			this.branch = branch;
		}


		public String getDoctorName() {
			return doctorName;
		}


		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}


		public String getDomain() {
			return domain;
		}


		public void setDomain(String domain) {
			this.domain = domain;
		}


		public int getExperienceInYrs() {
			return experienceInYrs;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String available) {
			this.status = available;
		}


		public void setExperienceInYrs(int experienceInYrs) {
			this.experienceInYrs = experienceInYrs;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getMobileNumber() {
			return mobileNumber;
		}


		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		@Override
		public String toString() {
			return "Doctor [doctorId=" + doctorId + ", branch=" + branch + ", doctorName=" + doctorName + ", domain="
					+ domain + ", experienceInYrs=" + experienceInYrs + ", gender=" + gender + ", mobileNumber="
					+ mobileNumber + ", password=" + password + ", status=" + status + "]";
		}


		

		
		
		
  }
 
