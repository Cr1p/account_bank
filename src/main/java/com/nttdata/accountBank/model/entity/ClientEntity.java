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
    private String name;
    @NotNull
    private String documentType;
    @NotNull
    private String documentNumber;
    private String email;
    private String type;
    private String phone;
}
