package com.myspringboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {

  @Autowired
  private CurrencyServiceConfiguration configuration;

  @RequestMapping("/currency-configuration")
  public CurrencyServiceConfiguration retreiveCourses(){
    return configuration;
  }

}
