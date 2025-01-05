package com.nttdata.accountBank.mapper;

import com.nttdata.accountBank.model.ClientRequest;
import com.nttdata.accountBank.model.ClientResponse;
import com.nttdata.accountBank.model.entity.ClientEntity;

public class ClientMapper {

    public ClientEntity toEntity(ClientRequest clientRequest) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setName(clientRequest.getName());
        clientEntity.setEmail(clientRequest.getEmail());
        clientEntity.setPhone(clientRequest.getPhoneNumber());
        return clientEntity;
    }

    public ClientResponse toResponse(ClientEntity clientEntity) {
        ClientResponse clientResponse = new ClientResponse();
        clientResponse.setId(clientEntity.getId());
        clientResponse.setName(clientEntity.getName());
        clientResponse.setEmail(clientEntity.getEmail());
        clientResponse.setPhoneNumber(clientEntity.getPhone());
        return clientResponse;
    }
}
