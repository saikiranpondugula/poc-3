package com.poc4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc4.entity.Job1;
import com.poc4.entity.UserInfo;
import com.poc4.repository.JobRepository;
import com.poc4.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	@Autowired
	private JobRepository jobrepo;
	
	public UserInfo createUser(UserInfo user) {
		return repo.save(user);
	}

	public Job1 createJob(Job1 job) {
		return jobrepo.save(job);
	}

	public Job1 getJobById(int id) {
		Job1 job = jobrepo.findById(id).orElse(new Job1());
		return jobrepo.save(job);
	}

	public List<Job1> getJobByType(String type) {       
		return jobrepo.findByJobType(type);  
		}
	public Iterable<Job1> getAllJobs() {
		return jobrepo.findAll();
	}

	
		

	public Job1 getJobByPayRate(int payRate) {
		Job1 job = jobrepo.findByPayRate(payRate).orElse(new Job1());
		return job;
	}


	

	

}
