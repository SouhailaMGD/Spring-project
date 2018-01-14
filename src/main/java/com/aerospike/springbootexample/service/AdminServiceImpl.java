package com.aerospike.springbootexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aerospike.springbootexample.model.Admin;

import com.aerospike.springbootexample.repository.AdminRepository;
@Service 
public class AdminServiceImpl implements AdminService  {
	@Autowired
	private AdminRepository adminRepository; 
	@Override
	public Iterable<Admin> listAllAdmins() {
		
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(Integer id) {
		return adminRepository.findOne(id);
	}

	@Override
	public Admin saveAdmin(Admin Admin) {
		return adminRepository.save(Admin);
	}

	@Override
	public void deleteAdmin(Integer id) {
		adminRepository.delete(id);
		
	}
	

}
