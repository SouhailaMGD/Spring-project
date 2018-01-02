package com.aerospike.springbootexample.service;

import com.aerospike.springbootexample.model.Client;

public interface ClientService {
	Iterable<Client> listAllClients();

    Client getClientById(Integer id);

    Client saveClient(Client client);

    void deleteClient(Integer id);
}
