package com.nttdata.accountBank.service.impl;

import com.nttdata.accountBank.mapper.ClientMapper;
import com.nttdata.accountBank.model.ClientRequest;
import com.nttdata.accountBank.model.ClientResponse;
import com.nttdata.accountBank.model.repository.ClientRepository;
import com.nttdata.accountBank.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClientMapper clientMapper;


    @Override
    public ClientResponse saveClient(ClientRequest request) {
        if (!clientRepository.existsByDocumentTypeAndDocumentNumber(request.getDocumentType().name(), request.getDocumentNumber())) {
            return clientMapper.toResponse(clientRepository.save(clientMapper.toEntity(request)));
        }
        return new ClientResponse();
    }

    @Override
    public ClientResponse getClientById(String id) {
        return null;
    }

    @Override
    public List<ClientResponse> getAllClients() {
        return List.of();
    }

    @Override
    public Void deleteClientById(String id) {
        return null;
    }


}
