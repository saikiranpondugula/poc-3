package com.poc4.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="job")
public class Job1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int jobId;
	//@Autowired
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "userId")
	private UserInfo userInfo;   

	private String jobTiltle;
	private String jobDescription;
	private String country;
	private String state;
	private String availability;
	private int replyRate;
	private int payRate;
	private int experiance;
	private String skills;
	private String language;
	private String jobType;
	
	
	public String getJobTiltle() {
		return jobTiltle;
	}
	public void setJobTiltle(String jobTiltle) {
		this.jobTiltle = jobTiltle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public int getReplyRate() {
		return replyRate;
	}
	public void setReplyRate(int replyRate) {
		this.replyRate = replyRate;
	}
	public int getPayRate() {
		return payRate;
	}
	public void setPayRate(int payRate) {
		this.payRate = payRate;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
public Job1() {
		
	}
	public Job1(int jobId, String jobTiltle, String jobDescription, String country, String state, String availability,
			int replyRate, int payRate, int experiance, String skills, String language, String jobType,
			UserInfo userInfo) {
		
		this.jobId = jobId;
		this.jobTiltle = jobTiltle;
		this.jobDescription = jobDescription;
		this.country = country;
		this.state = state;
		this.availability = availability;
		this.replyRate = replyRate;
		this.payRate = payRate;
		this.experiance = experiance;
		this.skills = skills;
		this.language = language;
		this.jobType = jobType;
		this.userInfo = userInfo;
	}
	
	
	
}
