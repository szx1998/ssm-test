package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/show")
    public String show(@RequestParam(value = "id",defaultValue = "1")int id, Model model){
        User user = userService.fandUserById(id);
        model.addAttribute("user",user);
        return "show";
    }
}
