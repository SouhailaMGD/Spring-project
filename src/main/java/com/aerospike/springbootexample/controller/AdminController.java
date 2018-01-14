package com.aerospike.springbootexample.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aerospike.springbootexample.model.Admin;
import com.aerospike.springbootexample.service.AdminService;

@RestController
@RequestMapping("/api/Admins")
public class AdminController {
	
	@Autowired
	private AdminService AdminService;
 
	@RequestMapping(value = "/allAdmins", method = RequestMethod.GET)
	public List<Admin> getAllAdmins() {
 
		return (List<Admin>) AdminService.listAllAdmins();
	}
 
	@RequestMapping(value = "/getAdmin/{Id}", method = RequestMethod.GET)
	public Admin getAdmin(@PathVariable("Id") Integer Id) {
		return AdminService.getAdminById(Id);
	}
 
	@RequestMapping(value = "/createAdmin", method = RequestMethod.POST)
	public Admin createAdmin(@RequestBody Admin Admin) {
		Random randomGenerator = new Random();
		Admin.setId_admin(randomGenerator.nextInt(100));
		return AdminService.saveAdmin(Admin);
	}
 
	@RequestMapping(value = "/updateAdmin/{Id}", method = RequestMethod.POST)
	public Admin updateAdmin(@RequestBody Admin Admin,@PathVariable("Id") Integer Id) {
		return AdminService.saveAdmin(Admin);
	}
	
	@RequestMapping(value = "/deleteAdmin/{Id}", method = RequestMethod.GET)
	public void deleteAdmin(@PathVariable("Id") Integer Id) {
		AdminService.deleteAdmin(Id);
	}
}
