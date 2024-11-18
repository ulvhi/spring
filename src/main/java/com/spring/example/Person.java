package com.spring.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Scope("prototype")
public class Person {
}
