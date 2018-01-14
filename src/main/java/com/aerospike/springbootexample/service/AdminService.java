package com.aerospike.springbootexample.service;

import com.aerospike.springbootexample.model.Admin;

public interface AdminService {
	Iterable<Admin> listAllAdmins();

    Admin getAdminById(Integer id);

    Admin saveAdmin(Admin Admin);

    void deleteAdmin(Integer id);
}
