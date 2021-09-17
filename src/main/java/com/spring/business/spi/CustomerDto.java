package com.spring.business.spi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// POJO: Plain Old Java Object
// Campos y Funcional definidas en la especificación de Java Beans
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

  private String name;

}
