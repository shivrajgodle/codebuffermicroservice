package com.dailycodebuffer.user.controller;

import com.dailycodebuffer.user.VO.ResponceTemplateVO;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("in saveuser method of Usercontroller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponceTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("in getUserDepartmet method of Usercontroller");
        return userService.getUserWithDepartment(userId);
    }

}











