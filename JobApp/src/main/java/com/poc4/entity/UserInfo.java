package com.poc4.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="user_info")
public class UserInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	//@Autowired
//	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "jobId")
	//private int jobId;
	
	private String userName;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public UserInfo() {
		
	}

	public UserInfo(int userId, String userName) {
		
		this.userId = userId;
		this.userName = userName;
	}

	public UserInfo(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
}
