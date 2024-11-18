package com.spring.example;

import org.springframework.stereotype.Component;

@Component
public class PersonFactory {
    Person create(){
        return new Person();
    }

}
