package com.nttdata.accountBank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-05T05:43:09.924039800-05:00[America/Lima]")
public class TransactionRequest   {
  @JsonProperty("productId")
  private String productId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DEPOSIT("deposit"),
    
    WITHDRAWAL("withdrawal"),
    
    PAYMENT("payment"),
    
    PURCHASE("purchase");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("transactionDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionDate;

  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    COMPLETED("completed"),
    
    PENDING("pending"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public TransactionRequest productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public TransactionRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TransactionRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransactionRequest transactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Get transactionDate
   * @return transactionDate
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  public TransactionRequest description(String description) {
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

  public TransactionRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    TransactionRequest transactionRequest = (TransactionRequest) o;
    return Objects.equals(this.productId, transactionRequest.productId) &&
        Objects.equals(this.type, transactionRequest.type) &&
        Objects.equals(this.amount, transactionRequest.amount) &&
        Objects.equals(this.transactionDate, transactionRequest.transactionDate) &&
        Objects.equals(this.description, transactionRequest.description) &&
        Objects.equals(this.status, transactionRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, type, amount, transactionDate, description, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequest {\n");
    
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

