package com.nttdata.accountBank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClientResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-05T05:43:09.924039800-05:00[America/Lima]")
public class ClientResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("documentType")
  private String documentType;

  @JsonProperty("documentNumber")
  private String documentNumber;

  @JsonProperty("clientType")
  private String clientType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("address")
  private String address;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  public ClientResponse id(String id) {
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

  public ClientResponse documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
  */
  @ApiModelProperty(value = "")


  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public ClientResponse documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
  */
  @ApiModelProperty(value = "")


  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public ClientResponse clientType(String clientType) {
    this.clientType = clientType;
    return this;
  }

  /**
   * Get clientType
   * @return clientType
  */
  @ApiModelProperty(value = "")


  public String getClientType() {
    return clientType;
  }

  public void setClientType(String clientType) {
    this.clientType = clientType;
  }

  public ClientResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ClientResponse address(String address) {
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

  public ClientResponse phoneNumber(String phoneNumber) {
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
    ClientResponse clientResponse = (ClientResponse) o;
    return Objects.equals(this.id, clientResponse.id) &&
        Objects.equals(this.documentType, clientResponse.documentType) &&
        Objects.equals(this.documentNumber, clientResponse.documentNumber) &&
        Objects.equals(this.clientType, clientResponse.clientType) &&
        Objects.equals(this.name, clientResponse.name) &&
        Objects.equals(this.email, clientResponse.email) &&
        Objects.equals(this.address, clientResponse.address) &&
        Objects.equals(this.phoneNumber, clientResponse.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentType, documentNumber, clientType, name, email, address, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

