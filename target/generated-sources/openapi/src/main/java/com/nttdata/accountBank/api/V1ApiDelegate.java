package com.nttdata.accountBank.api;

import com.nttdata.accountBank.model.ClientRequest;
import com.nttdata.accountBank.model.ClientResponse;
import com.nttdata.accountBank.model.ErrorResponse;
import com.nttdata.accountBank.model.FinancialProductRequest;
import com.nttdata.accountBank.model.FinancialProductResponse;
import com.nttdata.accountBank.model.TransactionRequest;
import com.nttdata.accountBank.model.TransactionResponse;
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
 * A delegate to be called by the {@link V1ApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-23T19:32:27.478399600-05:00[America/Lima]")
public interface V1ApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /v1/clients : Create a new client
     *
     * @param clientRequest  (required)
     * @return Client created (status code 201)
     *         or Invalid request (status code 400)
     * @see V1Api#createClient
     */
    default ResponseEntity<ClientResponse> createClient(ClientRequest clientRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"phone\", \"name\" : \"name\", \"id\" : \"id\", \"type\" : \"type\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /v1/products : Create a new financial product
     *
     * @param financialProductRequest  (required)
     * @return Financial product created (status code 201)
     *         or Invalid request (status code 400)
     * @see V1Api#createFinancialProduct
     */
    default ResponseEntity<FinancialProductResponse> createFinancialProduct(FinancialProductRequest financialProductRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"fees\" : 1.4658129805029452, \"clientId\" : \"clientId\", \"balance\" : 0.8008281904610115, \"subtype\" : \"subtype\", \"creditLimit\" : 6.027456183070403, \"id\" : \"id\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /v1/transactions : Create a new transaction
     *
     * @param transactionRequest  (required)
     * @return Transaction created (status code 201)
     *         or Invalid request (status code 400)
     * @see V1Api#createTransaction
     */
    default ResponseEntity<TransactionResponse> createTransaction(TransactionRequest transactionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"amount\" : 0.8008281904610115, \"productId\" : \"productId\", \"id\" : \"id\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /v1/clients/{id} : Delete a client by ID
     *
     * @param id  (required)
     * @return Client deleted (status code 204)
     *         or Client not found (status code 404)
     * @see V1Api#deleteClient
     */
    default ResponseEntity<Void> deleteClient(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /v1/products/{id} : Delete a financial product by ID
     *
     * @param id  (required)
     * @return Financial product deleted (status code 204)
     *         or Financial product not found (status code 404)
     * @see V1Api#deleteFinancialProduct
     */
    default ResponseEntity<Void> deleteFinancialProduct(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /v1/clients : Get all clients
     *
     * @return List of clients (status code 200)
     *         or Internal server error (status code 500)
     * @see V1Api#getAllClients
     */
    default ResponseEntity<List<ClientResponse>> getAllClients() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"phone\", \"name\" : \"name\", \"id\" : \"id\", \"type\" : \"type\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /v1/products : Get all financial products
     *
     * @return List of financial products (status code 200)
     *         or Internal server error (status code 500)
     * @see V1Api#getAllFinancialProducts
     */
    default ResponseEntity<List<FinancialProductResponse>> getAllFinancialProducts() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"fees\" : 1.4658129805029452, \"clientId\" : \"clientId\", \"balance\" : 0.8008281904610115, \"subtype\" : \"subtype\", \"creditLimit\" : 6.027456183070403, \"id\" : \"id\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /v1/transactions : Get all transactions
     *
     * @return List of transactions (status code 200)
     *         or Internal server error (status code 500)
     * @see V1Api#getAllTransactions
     */
    default ResponseEntity<List<TransactionResponse>> getAllTransactions() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"amount\" : 0.8008281904610115, \"productId\" : \"productId\", \"id\" : \"id\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /v1/clients/{id} : Get a client by ID
     *
     * @param id  (required)
     * @return Client found (status code 200)
     *         or Client not found (status code 404)
     * @see V1Api#getClientById
     */
    default ResponseEntity<ClientResponse> getClientById(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"phone\", \"name\" : \"name\", \"id\" : \"id\", \"type\" : \"type\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /v1/products/{id} : Get a financial product by ID
     *
     * @param id  (required)
     * @return Financial product found (status code 200)
     *         or Financial product not found (status code 404)
     * @see V1Api#getFinancialProductById
     */
    default ResponseEntity<FinancialProductResponse> getFinancialProductById(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"fees\" : 1.4658129805029452, \"clientId\" : \"clientId\", \"balance\" : 0.8008281904610115, \"subtype\" : \"subtype\", \"creditLimit\" : 6.027456183070403, \"id\" : \"id\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /v1/clients/{id} : Update a client by ID
     *
     * @param id  (required)
     * @param clientRequest  (required)
     * @return Client updated (status code 200)
     *         or Invalid request (status code 400)
     * @see V1Api#updateClient
     */
    default ResponseEntity<ClientResponse> updateClient(String id,
        ClientRequest clientRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"phone\" : \"phone\", \"name\" : \"name\", \"id\" : \"id\", \"type\" : \"type\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /v1/products/{id} : Update a financial product by ID
     *
     * @param id  (required)
     * @param financialProductRequest  (required)
     * @return Financial product updated (status code 200)
     *         or Invalid request (status code 400)
     * @see V1Api#updateFinancialProduct
     */
    default ResponseEntity<FinancialProductResponse> updateFinancialProduct(String id,
        FinancialProductRequest financialProductRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"fees\" : 1.4658129805029452, \"clientId\" : \"clientId\", \"balance\" : 0.8008281904610115, \"subtype\" : \"subtype\", \"creditLimit\" : 6.027456183070403, \"id\" : \"id\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
