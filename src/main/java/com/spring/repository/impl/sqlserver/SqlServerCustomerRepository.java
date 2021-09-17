package com.spring.repository.impl.sqlserver;

import com.spring.repository.spi.CustomerEntity;
import com.spring.repository.spi.CustomerRepository;

public class SqlServerCustomerRepository implements CustomerRepository {
  @Override
  public CustomerEntity findById(String id) {
    return null;
  }
}
