package com.aerospike.springbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aerospike.springbootexample.model.Client;
import com.aerospike.springbootexample.service.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
 
	@RequestMapping(value = "/allclients", method = RequestMethod.GET)
	public List<Client> getAllClients() {
 
		return (List<Client>) clientService.listAllClients();
	}
 
	@RequestMapping(value = "/getclient/{Id}", method = RequestMethod.GET)
	public Client getclient(@PathVariable("Id") Integer Id) {
		return clientService.getClientById(Id);
	}
 
	@RequestMapping(value = "/createclient", method = RequestMethod.POST)
	public Client createclient(@RequestBody Client client) {
		client.setId(400);
		return clientService.saveClient(client);
	}
 
	@RequestMapping(value = "/updateclient/{Id}", method = RequestMethod.POST)
	public Client updateclient(@RequestBody Client client,@PathVariable("Id") Integer Id) {
		clientService.deleteClient(Id);
		return clientService.saveClient(client);
	}
	
	@RequestMapping(value = "/deleteclient/{Id}", method = RequestMethod.GET)
	public void deleteclient(@PathVariable("Id") Integer Id) {
		clientService.deleteClient(Id);
	}
}
