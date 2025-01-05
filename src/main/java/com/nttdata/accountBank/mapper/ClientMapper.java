package com.nttdata.accountBank.mapper;

import com.nttdata.accountBank.model.ClientRequest;
import com.nttdata.accountBank.model.ClientResponse;
import com.nttdata.accountBank.model.entity.ClientEntity;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ClientMapper {

    public ClientEntity toEntity(ClientRequest clientRequest) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setName(clientRequest.getName());
        clientEntity.setEmail(clientRequest.getEmail());
        clientEntity.setPhone(clientRequest.getPhone());
        if (clientRequest.getType() != null) {
            clientEntity.setType(clientRequest.getType().name());
        }
        return clientEntity;
    }

    public ClientResponse toResponse(ClientEntity clientEntity) {
        ClientResponse clientResponse = new ClientResponse();
        clientResponse.setId(clientEntity.getId());
        clientResponse.setName(clientEntity.getName());
        clientResponse.setEmail(clientEntity.getEmail());
        clientResponse.setPhone(clientEntity.getPhone());
        return clientResponse;
    }
}
