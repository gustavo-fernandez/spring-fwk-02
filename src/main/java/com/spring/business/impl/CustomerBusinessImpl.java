package com.spring.business.impl;

import com.spring.business.spi.CustomerBusiness;
import com.spring.business.spi.CustomerDto;
import com.spring.repository.spi.CustomerEntity;
import com.spring.repository.spi.CustomerRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerBusinessImpl implements CustomerBusiness {

  private final CustomerRepository customerRepository;

  public CustomerBusinessImpl(@Qualifier("sqlServerCustomerRepository") CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public CustomerDto findById(String id) {
    return mapToDto(customerRepository.findById(id));
  }

  private CustomerDto mapToDto(CustomerEntity customerEntity) {
    return new CustomerDto(customerEntity.getName());
  }

}
