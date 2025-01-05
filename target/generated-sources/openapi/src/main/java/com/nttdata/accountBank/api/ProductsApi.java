/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.nttdata.accountBank.api;

import com.nttdata.accountBank.model.ErrorResponse;
import com.nttdata.accountBank.model.FinancialProductRequest;
import com.nttdata.accountBank.model.FinancialProductResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-31T08:06:04.022124800-05:00[America/Lima]")
@Validated
@Api(value = "products", description = "the products API")
public interface ProductsApi {

    default ProductsApiDelegate getDelegate() {
        return new ProductsApiDelegate() {};
    }

    /**
     * POST /products : Create a new financial product
     *
     * @param financialProductRequest  (required)
     * @return Financial product created (status code 201)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "Create a new financial product", nickname = "createFinancialProduct", notes = "", response = FinancialProductResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Financial product created", response = FinancialProductResponse.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorResponse.class) })
    @PostMapping(
        value = "/products",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<FinancialProductResponse> createFinancialProduct(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FinancialProductRequest financialProductRequest) {
        return getDelegate().createFinancialProduct(financialProductRequest);
    }


    /**
     * DELETE /products/{id} : Delete a financial product by ID
     *
     * @param id  (required)
     * @return Financial product deleted (status code 204)
     *         or Financial product not found (status code 404)
     */
    @ApiOperation(value = "Delete a financial product by ID", nickname = "deleteFinancialProduct", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Financial product deleted"),
        @ApiResponse(code = 404, message = "Financial product not found", response = ErrorResponse.class) })
    @DeleteMapping(
        value = "/products/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> deleteFinancialProduct(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        return getDelegate().deleteFinancialProduct(id);
    }


    /**
     * GET /products : Get all financial products
     *
     * @return List of financial products (status code 200)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(value = "Get all financial products", nickname = "getAllFinancialProducts", notes = "", response = FinancialProductResponse.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of financial products", response = FinancialProductResponse.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponse.class) })
    @GetMapping(
        value = "/products",
        produces = { "application/json" }
    )
    default ResponseEntity<List<FinancialProductResponse>> getAllFinancialProducts() {
        return getDelegate().getAllFinancialProducts();
    }


    /**
     * GET /products/{id} : Get a financial product by ID
     *
     * @param id  (required)
     * @return Financial product found (status code 200)
     *         or Financial product not found (status code 404)
     */
    @ApiOperation(value = "Get a financial product by ID", nickname = "getFinancialProductById", notes = "", response = FinancialProductResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Financial product found", response = FinancialProductResponse.class),
        @ApiResponse(code = 404, message = "Financial product not found", response = ErrorResponse.class) })
    @GetMapping(
        value = "/products/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<FinancialProductResponse> getFinancialProductById(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        return getDelegate().getFinancialProductById(id);
    }


    /**
     * PUT /products/{id} : Update a financial product by ID
     *
     * @param id  (required)
     * @param financialProductRequest  (required)
     * @return Financial product updated (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "Update a financial product by ID", nickname = "updateFinancialProduct", notes = "", response = FinancialProductResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Financial product updated", response = FinancialProductResponse.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorResponse.class) })
    @PutMapping(
        value = "/products/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<FinancialProductResponse> updateFinancialProduct(@ApiParam(value = "",required=true) @PathVariable("id") String id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody FinancialProductRequest financialProductRequest) {
        return getDelegate().updateFinancialProduct(id, financialProductRequest);
    }

}
