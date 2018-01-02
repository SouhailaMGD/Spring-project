package com.aerospike.springbootexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerospike.springbootexample.model.Client;
import com.aerospike.springbootexample.repository.ClientRepository;
@Service 
public class ClientServiceImpl implements ClientService  {
	
	
	@Autowired
	private ClientRepository clientRepository; 
	@Override
	public Iterable<Client> listAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public Client getClientById(Integer id) {
		return clientRepository.findOne(id);
	}

	@Override
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void deleteClient(Integer id) {
		clientRepository.delete(id);
		
	}

}
