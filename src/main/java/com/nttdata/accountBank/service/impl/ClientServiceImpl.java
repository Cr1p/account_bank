package com.nttdata.accountBank.service.impl;

import com.nttdata.accountBank.mapper.ClientMapper;
import com.nttdata.accountBank.model.ClientRequest;
import com.nttdata.accountBank.model.ClientResponse;
import com.nttdata.accountBank.model.repository.ClientRepository;
import com.nttdata.accountBank.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClientMapper clientMapper;

    @Override
    public ClientResponse createClient(ClientRequest clientRequest) {
        return clientMapper.toResponse(clientRepository.save(clientMapper.toEntity(clientRequest)));
    }
}
