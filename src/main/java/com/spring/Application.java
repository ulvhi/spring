package com.spring;

import com.spring.example.Person;
import com.spring.example.PersonFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.example");
        PersonFactory personFactory = context.getBean(PersonFactory.class) ;
        //System.out.println(personFactory);
        Person person1 = context.getBean(Person.class) ;
        //System.out.println(person1);
        Person person2 = context.getBean(Person.class) ;
        //System.out.println(person2);
        Account account = new Account();


    }

}
