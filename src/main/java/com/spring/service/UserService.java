package com.spring.service;


import com.spring.mapping.UserMapping;
import com.spring.model.response.UserDetailsResponse;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class UserService {
   @Autowired
   private final UserMapping userMapping;
    public UserService(UserMapping userMapping) {
        this.userMapping = userMapping;
    }
    public  UserDetailsResponse getUser(Long id){
       System.out.println("id of th user:"+id);
        System.out.println(userMapping.getUserById(id));
           return userMapping.getUserById(id);
       }
    public  String getUserNameById(Long id){
        System.out.println("id of th user:"+id);
        System.out.println(userMapping.getUserNameById(id));
        return userMapping.getUserNameById(id);
    }
    public  String getUserLastNameById(Long id){
        System.out.println("id of th user:"+id);
        System.out.println(userMapping.getUserLastNameById(id));
        return userMapping.getUserLastNameById(id);
    }
    public  int getUserAgeById(Long id){
        System.out.println("id of th user:"+id);
        System.out.println(userMapping.getUserAgeById(id));
        return userMapping.getUserAgeById(id);
    }
    public  int getUserEmailById(Long id){
        System.out.println("id of th user:"+id);
        System.out.println(userMapping.getUserEmailById(id));
        return userMapping.getUserAgeById(id);
    }
    public  int getUserNumberById(Long id){
        System.out.println("id of th user:"+id);
        System.out.println(userMapping.getUserNumberById(id));
        return userMapping.getUserAgeById(id);
    }
//       public void updateUserName(Long id, String name){
//        System.out.println("id of th user:"+id);
//        userMapping.updateUserName(id,name);
//       }
//    public void updateUserLastName(Long id, String lastName){
//        System.out.println("id of th user:"+id);
//        userMapping.updateUserName(id,lastName);
//    }

}
