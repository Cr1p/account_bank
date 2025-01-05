package com.nttdata.accountBank.model.entity;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Builder;

@Data
@Builder
@Document(collation = "client")
public class Client {
    @Id
    private String id;
    private String name;
    private String email;
    private String type;
}
