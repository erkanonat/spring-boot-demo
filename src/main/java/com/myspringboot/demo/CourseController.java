package com.myspringboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

  @RequestMapping("/courses")
  public List<Course> retreiveCourses(){
       return Arrays.asList(new Course(1,"java","erkan"),new Course(2,"halil","python"),new Course(3,"maho","go"));
  }

}
