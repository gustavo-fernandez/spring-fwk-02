package com.spring.config;

import com.spring.business.impl.CustomerBusinessImpl;
import com.spring.business.spi.CustomerBusiness;
import com.spring.repository.impl.sqlserver.SqlServerCustomerRepository;
import com.spring.repository.spi.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

  @Bean
  CustomerBusiness customerBusiness() {
    CustomerRepository customerRepository = new SqlServerCustomerRepository();
    return new CustomerBusinessImpl(customerRepository);
  }

}
