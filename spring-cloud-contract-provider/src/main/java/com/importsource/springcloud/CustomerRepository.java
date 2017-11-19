package com.importsource.springcloud;

import com.importsource.springcloud.common.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hezhuofan
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}