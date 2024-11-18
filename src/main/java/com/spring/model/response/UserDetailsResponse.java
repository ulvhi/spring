package com.spring.model.response;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.HashMap;

@Data
@AllArgsConstructor
@Builder
@Component
@NoArgsConstructor
@Scope("prototype")
public class UserDetailsResponse {


    private String email;
    private String name;
    private String lastName;
    private int  age;
    private String number;




}


