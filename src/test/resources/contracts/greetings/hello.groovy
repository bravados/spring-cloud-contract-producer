import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/greeting'
    }
    response {
        status OK()
    }
}
