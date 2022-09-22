package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("Should return even when parameter is even")
    request {
        method GET()
        url("/validate/prime-number") {
            queryParameters {
                parameter("number", 2)
            }
        }
    }

    response {
        body("Even")
        status(200)
    }
}
