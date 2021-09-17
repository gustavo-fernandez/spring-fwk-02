package com.spring.runner;

import com.spring.business.spi.CustomerBusiness;
import com.spring.business.spi.CustomerDto;
import com.spring.config.SpringConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    ConfigurableApplicationContext beanFactory = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    try (beanFactory) {
      CustomerBusiness customerBean = beanFactory.getBean(CustomerBusiness.class);
      CustomerDto customer = customerBean.findById("X");
      System.out.println("Su nombre es: " + customer.getName());
      System.out.println("Spring is running");
    }
  }

}
