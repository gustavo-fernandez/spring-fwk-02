package com.spring.repository.spi;

public interface CustomerRepository {

  CustomerEntity findById(String id);

}
