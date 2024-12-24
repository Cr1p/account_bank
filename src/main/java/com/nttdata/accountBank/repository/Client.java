package com.nttdata.accountBank.repository;

import lombok.Data;

@Data
public class Client {
    private String id;
    private String name;
    private String email;
    private String type;
}
