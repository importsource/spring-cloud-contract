package com.importsource.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author hezhuofan
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages={"com.importsource.springcloud"})
@EntityScan(basePackages={"com.importsource.springcloud.common"})
public class SpringCloudContractApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudContractApplication.class, args);
	}
}
