package com.spring.ioc;

import com.spring.business.impl.CustomerBusinessImpl;
import com.spring.business.spi.CustomerBusiness;
import com.spring.repository.impl.postgres.PostgresCustomerRepository;
import com.spring.repository.spi.CustomerRepository;

public class IoCFactory {

  public static CustomerBusiness getCustomerBusiness() {
    CustomerRepository customerRepository = new PostgresCustomerRepository();
    return new CustomerBusinessImpl(customerRepository);
  }

}
