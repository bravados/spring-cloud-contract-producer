import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method "GET"
        url "/hello"
    }
    response {
        status OK()
        body(
                name: "World",
                message: "Hello my dear"
        )
    }
}
