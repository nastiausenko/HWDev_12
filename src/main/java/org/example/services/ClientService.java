package org.example.services;

import org.example.crudService.ClientDao;
import org.example.entity.Client;

import java.util.List;

public class ClientService {
    private ClientDao clientclientDao = new ClientDao();

    public void save(Client client) {
        clientclientDao.save(client);
    }

    public Client findById(Long id) {
       return clientclientDao.findById(id);
    }

    public void update(Client client) {
        clientclientDao.update(client);
    }

    public void delete(Client client) {
        clientclientDao.delete(client);
    }

    public List<Client> getAllClients() {
        return clientclientDao.getAllClients();
    }
}
