package com.nttdata.accountBank.api.impl;

import com.nttdata.accountBank.api.ClientsApiDelegate;
import com.nttdata.accountBank.model.ClientRequest;
import com.nttdata.accountBank.model.ClientResponse;
import com.nttdata.accountBank.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientApiDelegateImpl implements  ClientsApiDelegate {

    @Autowired
    ClientService clientService;

    public ResponseEntity<ClientResponse> createClient(ClientRequest clientRequest) {
        ///
        return ResponseEntity.ok(clientService.createClient(clientRequest));

    }
}
