package com.nttdata.accountBank.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-24T11:19:56.527457300-05:00[America/Lima]")
@Controller
@RequestMapping("${openapi.bankSystem.base-path:}")
public class ClientsApiController implements ClientsApi {

    private final ClientsApiDelegate delegate;

    public ClientsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ClientsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ClientsApiDelegate() {});
    }

    @Override
    public ClientsApiDelegate getDelegate() {
        return delegate;
    }

}
