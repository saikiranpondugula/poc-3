package com.poc4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc4.entity.Job1;
import com.poc4.entity.UserInfo;
import com.poc4.service.UserService;


@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/createuser")
	public UserInfo createUser(@RequestBody UserInfo user) {
		return service.createUser(user);
	}
	@PostMapping("/createjob")
	public Job1 createJob(@RequestBody Job1 job) {
		return service.createJob(job);
	}
	
	@GetMapping("/getjob/{id}")
	public Job1 getJobById(@PathVariable("id") Integer id) {
		return service.getJobById(id);
	}


	@GetMapping("/jobbytype/{type}")     
	public List<Job1> findByJobType(@PathVariable String type) { 
		return service.getJobByType(type);  
		}
	
	@GetMapping("/getalljobs")
	public Iterable<Job1> getAllJobs() {
		return service.getAllJobs();
	}
	
	@GetMapping("/getByPayRate/{low}/{high}")
	public Job1 getJobByPayRate(@PathVariable("payRate") int payRate){
		return service.getJobByPayRate(payRate);
		
	}
	
}
