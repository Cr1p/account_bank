package com.nttdata.accountBank.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "client")
public class ClientEntity {

    @Id
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String documentType;
    @NotNull
    private String documentNumber;
    @NotNull
    private String email;
    @NotNull
    private String type;
    @NotNull
    private String phone;
}
