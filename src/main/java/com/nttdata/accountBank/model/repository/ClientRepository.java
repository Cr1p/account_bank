package com.nttdata.accountBank.model.repository;

import com.nttdata.accountBank.model.entity.ClientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import reactor.core.publisher.Mono;

public interface ClientRepository extends MongoRepository<ClientEntity, String> {
    Boolean existsByDocumentTypeAndDocumentNumber(String documentType, String documentNumber); // Validar si un cliente ya existe por email
}
