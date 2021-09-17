package com.spring.repository.impl.sqlserver;

import com.spring.repository.spi.CustomerEntity;
import com.spring.repository.spi.CustomerRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SqlServerCustomerRepository implements CustomerRepository {
  @Override
  public CustomerEntity findById(String id) {
    return CustomerEntity.builder()
      .id("1")
      .name("Juan SQL Server")
      .build();
  }
}
