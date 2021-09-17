package com.spring.runner;

import com.spring.business.spi.CustomerBusiness;
import com.spring.business.spi.CustomerDto;
import com.spring.ioc.IoCFactory;

public class Main {

  public static void main(String[] args) {
    CustomerBusiness customerBusiness = IoCFactory.getCustomerBusiness();
    CustomerDto customer = customerBusiness.findById("X");
    System.out.println("Su nombre es: " + customer.getName());
  }

}
