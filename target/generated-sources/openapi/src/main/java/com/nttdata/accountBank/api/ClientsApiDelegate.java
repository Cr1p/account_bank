package com.nttdata.accountBank.api;

import com.nttdata.accountBank.model.ClientRequest;
import com.nttdata.accountBank.model.ClientResponse;
import com.nttdata.accountBank.model.ErrorResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ClientsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-05T05:43:09.924039800-05:00[America/Lima]")
public interface ClientsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /clients : Create a new client
     *
     * @param clientRequest  (required)
     * @return Client created (status code 201)
     *         or Invalid request (status code 400)
     * @see ClientsApi#createClient
     */
    default ResponseEntity<ClientResponse> createClient(ClientRequest clientRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"clientType\" : \"clientType\", \"address\" : \"address\", \"phoneNumber\" : \"phoneNumber\", \"documentType\" : \"documentType\", \"documentNumber\" : \"documentNumber\", \"name\" : \"name\", \"id\" : \"id\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /clients/{id} : Delete a client by ID
     *
     * @param id  (required)
     * @return Client deleted (status code 204)
     *         or Client not found (status code 404)
     * @see ClientsApi#deleteClient
     */
    default ResponseEntity<Void> deleteClient(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /clients : Get all clients
     *
     * @return List of clients (status code 200)
     *         or Internal server error (status code 500)
     * @see ClientsApi#getAllClients
     */
    default ResponseEntity<List<ClientResponse>> getAllClients() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"clientType\" : \"clientType\", \"address\" : \"address\", \"phoneNumber\" : \"phoneNumber\", \"documentType\" : \"documentType\", \"documentNumber\" : \"documentNumber\", \"name\" : \"name\", \"id\" : \"id\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /clients/{id} : Get a client by ID
     *
     * @param id  (required)
     * @return Client found (status code 200)
     *         or Client not found (status code 404)
     * @see ClientsApi#getClientById
     */
    default ResponseEntity<ClientResponse> getClientById(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"clientType\" : \"clientType\", \"address\" : \"address\", \"phoneNumber\" : \"phoneNumber\", \"documentType\" : \"documentType\", \"documentNumber\" : \"documentNumber\", \"name\" : \"name\", \"id\" : \"id\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /clients/{id} : Update a client by ID
     *
     * @param id  (required)
     * @param clientRequest  (required)
     * @return Client updated (status code 200)
     *         or Invalid request (status code 400)
     * @see ClientsApi#updateClient
     */
    default ResponseEntity<ClientResponse> updateClient(String id,
        ClientRequest clientRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"clientType\" : \"clientType\", \"address\" : \"address\", \"phoneNumber\" : \"phoneNumber\", \"documentType\" : \"documentType\", \"documentNumber\" : \"documentNumber\", \"name\" : \"name\", \"id\" : \"id\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
