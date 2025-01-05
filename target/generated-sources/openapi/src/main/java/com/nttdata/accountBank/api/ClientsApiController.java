package com.nttdata.accountBank.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-05T05:43:09.924039800-05:00[America/Lima]")
@Controller
@RequestMapping("${openapi.financialSystem.base-path:}")
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
