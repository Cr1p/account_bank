package com.nttdata.accountBank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClientRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-05T05:43:09.924039800-05:00[America/Lima]")
public class ClientRequest   {
  @JsonProperty("documentType")
  private String documentType;

  @JsonProperty("documentNumber")
  private String documentNumber;

  /**
   * Gets or Sets clientType
   */
  public enum ClientTypeEnum {
    PERSONAL("personal"),
    
    BUSINESS("business");

    private String value;

    ClientTypeEnum(String value) {
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
    public static ClientTypeEnum fromValue(String value) {
      for (ClientTypeEnum b : ClientTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("clientType")
  private ClientTypeEnum clientType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("address")
  private String address;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  public ClientRequest documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public ClientRequest documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public ClientRequest clientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
    return this;
  }

  /**
   * Get clientType
   * @return clientType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public ClientTypeEnum getClientType() {
    return clientType;
  }

  public void setClientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
  }

  public ClientRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@javax.validation.constraints.Email
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ClientRequest address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ClientRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientRequest clientRequest = (ClientRequest) o;
    return Objects.equals(this.documentType, clientRequest.documentType) &&
        Objects.equals(this.documentNumber, clientRequest.documentNumber) &&
        Objects.equals(this.clientType, clientRequest.clientType) &&
        Objects.equals(this.name, clientRequest.name) &&
        Objects.equals(this.email, clientRequest.email) &&
        Objects.equals(this.address, clientRequest.address) &&
        Objects.equals(this.phoneNumber, clientRequest.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentType, documentNumber, clientType, name, email, address, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientRequest {\n");
    
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

