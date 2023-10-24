package contracts

import org.springframework.cloud.contract.spec.Contract
Contract.make {
    name("Orders Contract")
    request{
        method GET()
        urlPath(regex("/order/[1-3]"))
    }
    response{
        body (
            id: $(fromRequest().path(1)),
            product: $(c(anyOf("aple, banana, cherry")), p(anyAlphaNumeric())),
            price: $(c(1.5d), p(anyDouble())),
        )
        status OK()
    }
}

