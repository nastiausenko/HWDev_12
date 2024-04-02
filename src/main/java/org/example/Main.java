package org.example;

import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.services.ClientService;
import org.example.services.PlanetService;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        PlanetService planetService = new PlanetService();

        //create new client
        Client newClient = new Client();
        newClient.setName("Jack");
        clientService.save(newClient);
        System.out.println("Client id = 11, name = " + clientService.findById(11L).getName());

        //update client
        Client client = clientService.findById(11L);
        client.setName("Andrew");
        clientService.update(client);
        System.out.println("Updated client id = 11, name = " + clientService.findById(11L).getName());

        //delete client
        clientService.delete(client);
        System.out.println(clientService.getAllClients());

        //create new planet
        Planet newPlanet = new Planet();
        newPlanet.setId("MERC");
        newPlanet.setName("Mercury");
        planetService.save(newPlanet);
        System.out.println("New planet: " + planetService.findById("MERC"));

        //update planet
        Planet planet = planetService.findById("MERC");
        planet.setName("Mercury02");
        planetService.update(planet);
        System.out.println("Updated planet: " + planetService.findById("MERC"));

        //delete planet
        planetService.delete(planet);
        System.out.println(planetService.getAllPlanets());

        HibernateUtil.getInstance().close();
    }
}
