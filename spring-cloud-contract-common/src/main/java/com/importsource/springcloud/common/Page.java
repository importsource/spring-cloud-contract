package com.importsource.springcloud.common;

import lombok.Data;

import java.util.Collection;

/**
 * @author hezhuofan
 */
@Data
public class Page {
    private Collection<Customer> data;
}