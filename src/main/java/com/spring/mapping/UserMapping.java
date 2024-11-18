package com.spring.mapping;

import com.spring.model.response.UserDetailsResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Iterator;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class UserMapping {
    @Autowired
            private UserDetailsResponse userDetailsResponse;

    HashMap<Long, UserDetailsResponse> users = new HashMap<>();
    UserDetailsResponse ulvi = UserDetailsResponse.builder()
            .name("Ulvi")
            .lastName("Huseynov")
            .age(19)
            .email("ulvi.1769@gmail.com")
            .number("0559971769")
            .build();
    UserDetailsResponse fred = UserDetailsResponse.builder()
            .name("Fred")
            .lastName("Rodrigues")
            .age(31)
            .email("fred@gmail.com")
            .number("0777779797")
            .build();
    UserDetailsResponse maxi = UserDetailsResponse.builder()
            .name("Maxi")
            .lastName("Saint")
            .age(27)
            .email("maxi@gmail.com")
            .number("0777779797")
            .build();
    public void init(){
        users.put(1L, ulvi);
        users.put(2L, fred);
        users.put(3L, maxi);
    }
    public UserDetailsResponse getUserById(Long id) {
        init();
        return users.get(id);
    }
    public String getUserNameById(Long id) {
        init();
        return users.get(id).getName();
    }
    public String getUserLastNameById(Long id) {
        init();
        return users.get(id).getLastName();
    }
    public int getUserAgeById(Long id) {
        init();
        return users.get(id).getAge();
    }
    public String getUserEmailById(Long id) {
        init();
        return users.get(id).getEmail();
    }
    public String getUserNumberById(Long id) {
        init();
        return users.get(id).getNumber();
    }


//    public void updateUserName(Long id, String name) {
//        init();
//        users.get(id).setName(name);
//    }
//    public void updateUserLastName(Long id, String lastName) {
//        init();
//        users.get(id).setName(lastName);
//    }
}
