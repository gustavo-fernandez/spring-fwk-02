package com.spring.config;

import com.spring.business.impl.CustomerBusinessImpl;
import com.spring.business.spi.CustomerBusiness;
import com.spring.repository.impl.postgres.PostgresCustomerRepository;
import com.spring.repository.impl.sqlserver.SqlServerCustomerRepository;
import com.spring.repository.spi.CustomerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/application.properties")
public class SpringConfiguration {

  @Bean
  CustomerBusiness customerBusiness(CustomerRepository customerRepository) {
    return new CustomerBusinessImpl(customerRepository);
  }

  @Bean
  CustomerRepository customerRepository(@Value("${repository.implementation}") DatabaseType dbType) {
    if (dbType == DatabaseType.POSTGRESQL) {
      return new PostgresCustomerRepository();
    }
    if (dbType == DatabaseType.SQL_SERVER) {
      return new SqlServerCustomerRepository();
    }
    throw new IllegalStateException("Db Type invalido");
  }

}
