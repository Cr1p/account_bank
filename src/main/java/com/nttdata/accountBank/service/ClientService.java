package com.nttdata.accountBank.service;

import com.nttdata.accountBank.model.ClientRequest;
import com.nttdata.accountBank.model.ClientResponse;

public interface ClientService {

    ClientResponse createClient(ClientRequest clientRequest);
}
