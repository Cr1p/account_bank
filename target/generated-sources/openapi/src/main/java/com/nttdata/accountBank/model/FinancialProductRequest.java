package com.nttdata.accountBank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinancialProductRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-24T11:19:56.527457300-05:00[America/Lima]")
public class FinancialProductRequest   {
  @JsonProperty("clientId")
  private String clientId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ACCOUNT("account"),
    
    CREDIT("credit"),
    
    CREDIT_CARD("credit_card");

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

  /**
   * Gets or Sets subtype
   */
  public enum SubtypeEnum {
    SAVINGS("savings"),
    
    CHECKING("checking"),
    
    FIXED_TERM("fixed-term"),
    
    PERSONAL("personal"),
    
    BUSINESS("business");

    private String value;

    SubtypeEnum(String value) {
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
    public static SubtypeEnum fromValue(String value) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("subtype")
  private SubtypeEnum subtype;

  @JsonProperty("balance")
  private BigDecimal balance;

  @JsonProperty("creditLimit")
  private BigDecimal creditLimit;

  @JsonProperty("fees")
  private BigDecimal fees;

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

  public FinancialProductRequest type(TypeEnum type) {
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

  public FinancialProductRequest subtype(SubtypeEnum subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * Get subtype
   * @return subtype
  */
  @ApiModelProperty(value = "")


  public SubtypeEnum getSubtype() {
    return subtype;
  }

  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
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
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Get creditLimit
   * @return creditLimit
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }

  public FinancialProductRequest fees(BigDecimal fees) {
    this.fees = fees;
    return this;
  }

  /**
   * Get fees
   * @return fees
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFees() {
    return fees;
  }

  public void setFees(BigDecimal fees) {
    this.fees = fees;
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
    return Objects.equals(this.clientId, financialProductRequest.clientId) &&
        Objects.equals(this.type, financialProductRequest.type) &&
        Objects.equals(this.subtype, financialProductRequest.subtype) &&
        Objects.equals(this.balance, financialProductRequest.balance) &&
        Objects.equals(this.creditLimit, financialProductRequest.creditLimit) &&
        Objects.equals(this.fees, financialProductRequest.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, type, subtype, balance, creditLimit, fees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialProductRequest {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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

