package com.nttdata.accountBank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-05T05:43:09.924039800-05:00[America/Lima]")
public class TransactionResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("productId")
  private String productId;

  @JsonProperty("type")
  private String type;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("transactionDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionDate;

  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  @JsonProperty("status")
  private String status;

  public TransactionResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransactionResponse productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(value = "")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public TransactionResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TransactionResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransactionResponse transactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Get transactionDate
   * @return transactionDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  public TransactionResponse description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public TransactionResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return Objects.equals(this.id, transactionResponse.id) &&
        Objects.equals(this.productId, transactionResponse.productId) &&
        Objects.equals(this.type, transactionResponse.type) &&
        Objects.equals(this.amount, transactionResponse.amount) &&
        Objects.equals(this.transactionDate, transactionResponse.transactionDate) &&
        Objects.equals(this.description, transactionResponse.description) &&
        Objects.equals(this.status, transactionResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, type, amount, transactionDate, description, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

