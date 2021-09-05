
  package com.revature.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="onboardingadmin")
  public class Admin {
	@Id
	  private int adminId;
	  private String  adminPassword;
	  private String adminName;
	  
	  public Admin() {
		  
	  }
	public Admin(int adminId, String adminPassword, String adminName) {
		super();
		this.adminId = adminId;
		this.adminPassword = adminPassword;
		this.adminName = adminName;
	}
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPassword=" + adminPassword + ", adminName=" + adminName + "]";
	}
	  
	  

  }
 