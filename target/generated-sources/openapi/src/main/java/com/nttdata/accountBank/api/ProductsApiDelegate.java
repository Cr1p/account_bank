package com.nttdata.accountBank.api;

import com.nttdata.accountBank.model.ErrorResponse;
import com.nttdata.accountBank.model.FinancialProductRequest;
import com.nttdata.accountBank.model.FinancialProductResponse;
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
 * A delegate to be called by the {@link ProductsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-24T11:19:56.527457300-05:00[America/Lima]")
public interface ProductsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /products : Create a new financial product
     *
     * @param financialProductRequest  (required)
     * @return Financial product created (status code 201)
     *         or Invalid request (status code 400)
     * @see ProductsApi#createFinancialProduct
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
     * DELETE /products/{id} : Delete a financial product by ID
     *
     * @param id  (required)
     * @return Financial product deleted (status code 204)
     *         or Financial product not found (status code 404)
     * @see ProductsApi#deleteFinancialProduct
     */
    default ResponseEntity<Void> deleteFinancialProduct(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /products : Get all financial products
     *
     * @return List of financial products (status code 200)
     *         or Internal server error (status code 500)
     * @see ProductsApi#getAllFinancialProducts
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
     * GET /products/{id} : Get a financial product by ID
     *
     * @param id  (required)
     * @return Financial product found (status code 200)
     *         or Financial product not found (status code 404)
     * @see ProductsApi#getFinancialProductById
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
     * PUT /products/{id} : Update a financial product by ID
     *
     * @param id  (required)
     * @param financialProductRequest  (required)
     * @return Financial product updated (status code 200)
     *         or Invalid request (status code 400)
     * @see ProductsApi#updateFinancialProduct
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
