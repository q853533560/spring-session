package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SecondThymelaeafController {
        @GetMapping("/second")
        public String indexPage(Model model) {
            String message = "Hello, Thymeleaf!";
            User user = new User();
            user.setId(1);
            user.setName("优就业");
            user.setAge(18);
            model.addAttribute("message", message);
            model.addAttribute("user", user);


            List<User> list=new ArrayList<User>();
            User u1 = new User();
            u1.setId(1);
            u1.setName("优就业");
            u1.setAge(18);
            list.add(u1);

            User u2 = new User();
            u2.setId(2);
            u2.setName("中公教育");
            u2.setAge(28);
            list.add(u2);
            User u3 = new User();
            u3.setId(3);
            u3.setName("IT先锋");
            u3.setAge(88);
            list.add(u3);

            User u4 = new User();
            u4.setId(4);
            u4.setName("JAVA第一");
            u4.setAge(888);
            list.add(u4);

            model.addAttribute("list", list);
            return "index2";
        }




}
