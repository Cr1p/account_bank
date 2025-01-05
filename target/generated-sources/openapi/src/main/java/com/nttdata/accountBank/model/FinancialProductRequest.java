package com.nttdata.accountBank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinancialProductRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-05T05:43:09.924039800-05:00[America/Lima]")
public class FinancialProductRequest   {
  @JsonProperty("productType")
  private String productType;

  @JsonProperty("subType")
  private String subType;

  @JsonProperty("clientId")
  private String clientId;

  @JsonProperty("balance")
  private BigDecimal balance;

  @JsonProperty("creditLimit")
  private JsonNullable<BigDecimal> creditLimit = JsonNullable.undefined();

  @JsonProperty("interestRate")
  private JsonNullable<BigDecimal> interestRate = JsonNullable.undefined();

  @JsonProperty("owners")
  @Valid
  private List<String> owners = null;

  @JsonProperty("authorizedSigners")
  @Valid
  private List<String> authorizedSigners = null;

  public FinancialProductRequest productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public FinancialProductRequest subType(String subType) {
    this.subType = subType;
    return this;
  }

  /**
   * Get subType
   * @return subType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public FinancialProductRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public FinancialProductRequest balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public FinancialProductRequest creditLimit(BigDecimal creditLimit) {
    this.creditLimit = JsonNullable.of(creditLimit);
    return this;
  }

  /**
   * Get creditLimit
   * @return creditLimit
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BigDecimal> getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(JsonNullable<BigDecimal> creditLimit) {
    this.creditLimit = creditLimit;
  }

  public FinancialProductRequest interestRate(BigDecimal interestRate) {
    this.interestRate = JsonNullable.of(interestRate);
    return this;
  }

  /**
   * Get interestRate
   * @return interestRate
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BigDecimal> getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(JsonNullable<BigDecimal> interestRate) {
    this.interestRate = interestRate;
  }

  public FinancialProductRequest owners(List<String> owners) {
    this.owners = owners;
    return this;
  }

  public FinancialProductRequest addOwnersItem(String ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

  /**
   * Get owners
   * @return owners
  */
  @ApiModelProperty(value = "")


  public List<String> getOwners() {
    return owners;
  }

  public void setOwners(List<String> owners) {
    this.owners = owners;
  }

  public FinancialProductRequest authorizedSigners(List<String> authorizedSigners) {
    this.authorizedSigners = authorizedSigners;
    return this;
  }

  public FinancialProductRequest addAuthorizedSignersItem(String authorizedSignersItem) {
    if (this.authorizedSigners == null) {
      this.authorizedSigners = new ArrayList<>();
    }
    this.authorizedSigners.add(authorizedSignersItem);
    return this;
  }

  /**
   * Get authorizedSigners
   * @return authorizedSigners
  */
  @ApiModelProperty(value = "")


  public List<String> getAuthorizedSigners() {
    return authorizedSigners;
  }

  public void setAuthorizedSigners(List<String> authorizedSigners) {
    this.authorizedSigners = authorizedSigners;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialProductRequest financialProductRequest = (FinancialProductRequest) o;
    return Objects.equals(this.productType, financialProductRequest.productType) &&
        Objects.equals(this.subType, financialProductRequest.subType) &&
        Objects.equals(this.clientId, financialProductRequest.clientId) &&
        Objects.equals(this.balance, financialProductRequest.balance) &&
        Objects.equals(this.creditLimit, financialProductRequest.creditLimit) &&
        Objects.equals(this.interestRate, financialProductRequest.interestRate) &&
        Objects.equals(this.owners, financialProductRequest.owners) &&
        Objects.equals(this.authorizedSigners, financialProductRequest.authorizedSigners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productType, subType, clientId, balance, creditLimit, interestRate, owners, authorizedSigners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialProductRequest {\n");
    
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    authorizedSigners: ").append(toIndentedString(authorizedSigners)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

