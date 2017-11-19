package com.importsource.springcloud;


import com.importsource.springcloud.common.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @author hezhuofan
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringCloudContractConsumerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureStubRunner(ids = {"com.importsource.springcloud:spring-cloud-contract-provider:+:8080"}, workOffline = true)
public class SpringCloudContractConsumerApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testGetCustomers() {
        ParameterizedTypeReference<Page> ptf =
                new ParameterizedTypeReference<Page>() {
                };
        ResponseEntity<Page> responseEntity =
                restTemplate.exchange("http://localhost:8080/api/customers", HttpMethod.GET, null, ptf);
        Assert.assertEquals("size error!", 2, responseEntity.getBody().getData().size());
    }
}
