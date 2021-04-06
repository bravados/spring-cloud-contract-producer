import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/goodbye'
    }
    response {
        status OK()
    }
}
