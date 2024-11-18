package com.spring.controller;

import com.spring.model.response.UserDetailsResponse;
import com.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/users")
public class UserController {
    private final UserService userService;
    @GetMapping("/{id}")
    public UserDetailsResponse getUserById(@PathVariable Long id) {
        return userService.getUser(id);
    }
    @GetMapping("/{id}/name")
    public String getUserNameById(@PathVariable Long id) {
        return userService.getUserNameById(id);
    }
    @GetMapping("/{id}/lastname")
    public String getUserLastNameById(@PathVariable Long id) {
        return userService.getUserLastNameById(id);
    }
    @GetMapping("/{id}/age")
    public int getUserAgeById(@PathVariable Long id) {
        return userService.getUserAgeById(id);
    }
    @GetMapping("/{id}/email")
    public int getUserEmailById(@PathVariable Long id) {
        return userService.getUserEmailById(id);
    }
    @GetMapping("/{id}/number")
    public int getUserNumberById(@PathVariable Long id) {
        return userService.getUserNumberById(id);
    }

//    @PatchMapping("/{id}/updateName")
//    public void updateName(@PathVariable Long id, @RequestBody String name){
//        userService.updateUserName(id, name);
//    }
//    @PatchMapping("/{id}/updateLastName")
//    public void updateLastName(@PathVariable Long id, @RequestBody String lastName){
//        userService.updateUserName(id, lastName);
//    }

}
