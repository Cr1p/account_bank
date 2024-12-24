package com.nttdata.accountBank.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-24T11:19:56.527457300-05:00[America/Lima]")
@Controller
@RequestMapping("${openapi.bankSystem.base-path:}")
public class TransactionsApiController implements TransactionsApi {

    private final TransactionsApiDelegate delegate;

    public TransactionsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) TransactionsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new TransactionsApiDelegate() {});
    }

    @Override
    public TransactionsApiDelegate getDelegate() {
        return delegate;
    }

}
