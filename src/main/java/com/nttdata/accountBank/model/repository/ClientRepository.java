package com.nttdata.accountBank.model.repository;

import com.nttdata.accountBank.model.entity.ClientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<ClientEntity, String> {
}
