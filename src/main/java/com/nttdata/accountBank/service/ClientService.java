package com.nttdata.accountBank.service;

import com.nttdata.accountBank.model.ClientRequest;
import com.nttdata.accountBank.model.ClientResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ClientService {

    ClientResponse saveClient(ClientRequest request);  // Guardar un cliente
    ClientResponse getClientById(String id);         // Obtener un cliente por ID
    List<ClientResponse> getAllClients();                 // Obtener todos los clientes
    Void deleteClientById(String id);             // Eliminar un cliente por ID

}
