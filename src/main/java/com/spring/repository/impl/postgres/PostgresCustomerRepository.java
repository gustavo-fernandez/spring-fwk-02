package com.spring.repository.impl.postgres;

import com.spring.repository.spi.CustomerEntity;
import com.spring.repository.spi.CustomerRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostgresCustomerRepository implements CustomerRepository {
  @Override
  public CustomerEntity findById(String id) {
    return CustomerEntity.builder()
      .id("2")
      .name("Jorge PostgreSQL")
      .build();
  }
}
