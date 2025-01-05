package com.nttdata.accountBank.api;

import com.nttdata.accountBank.model.ErrorResponse;
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
 * A delegate to be called by the {@link TransactionsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-05T05:43:09.924039800-05:00[America/Lima]")
public interface TransactionsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /transactions : Create a new transaction
     *
     * @param transactionRequest  (required)
     * @return Transaction created (status code 201)
     *         or Invalid request (status code 400)
     * @see TransactionsApi#createTransaction
     */
    default ResponseEntity<TransactionResponse> createTransaction(TransactionRequest transactionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"amount\" : 0.8008281904610115, \"productId\" : \"productId\", \"description\" : \"description\", \"id\" : \"id\", \"type\" : \"type\", \"transactionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /transactions/{id} : Delete a transaction by ID
     *
     * @param id  (required)
     * @return Transaction deleted (status code 204)
     *         or Transaction not found (status code 404)
     * @see TransactionsApi#deleteTransaction
     */
    default ResponseEntity<Void> deleteTransaction(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /transactions : Get all transactions
     *
     * @return List of transactions (status code 200)
     *         or Internal server error (status code 500)
     * @see TransactionsApi#getAllTransactions
     */
    default ResponseEntity<List<TransactionResponse>> getAllTransactions() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"amount\" : 0.8008281904610115, \"productId\" : \"productId\", \"description\" : \"description\", \"id\" : \"id\", \"type\" : \"type\", \"transactionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /transactions/{id} : Get a transaction by ID
     *
     * @param id  (required)
     * @return Transaction found (status code 200)
     *         or Transaction not found (status code 404)
     * @see TransactionsApi#getTransactionById
     */
    default ResponseEntity<TransactionResponse> getTransactionById(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"amount\" : 0.8008281904610115, \"productId\" : \"productId\", \"description\" : \"description\", \"id\" : \"id\", \"type\" : \"type\", \"transactionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /transactions/{id} : Update a transaction by ID
     *
     * @param id  (required)
     * @param transactionRequest  (required)
     * @return Transaction updated (status code 200)
     *         or Invalid request (status code 400)
     * @see TransactionsApi#updateTransaction
     */
    default ResponseEntity<TransactionResponse> updateTransaction(String id,
        TransactionRequest transactionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"amount\" : 0.8008281904610115, \"productId\" : \"productId\", \"description\" : \"description\", \"id\" : \"id\", \"type\" : \"type\", \"transactionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
