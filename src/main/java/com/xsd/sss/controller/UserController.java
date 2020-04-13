package com.xsd.sss.controller;

import com.xsd.sss.entity.User;
import com.xsd.sss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    @ResponseBody
    public Map allUser(){
        System.err.println("users");
        HashMap map = new HashMap();
        List<User> userAll = userService.findUserAll();
        map.put("users", userAll);
        return map;
    }

    @RequestMapping("/test")
    public ModelAndView userTest(){
        ModelAndView view = new ModelAndView("/test");
        view.addObject("title", "Divine");
        return view;
    }

}
