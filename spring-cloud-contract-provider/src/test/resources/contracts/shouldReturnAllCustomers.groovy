import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

Contract.make {
    description "return all customers"

    request {
        url "/api/customers"
        method GET()
    }

    response {
        status 200
        headers {
            header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE)
        }
        body("data": [[id: 1L, name: "sam"], [id: 2L, name: "andy"]])
        //body("""{"data":[{"id":1,"name":"sam"},{"id":2,"name":"andy"}]}""")

    }
}







