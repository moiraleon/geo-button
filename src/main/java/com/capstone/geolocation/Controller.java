package com.capstone.geolocation;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String homePage(Model model) {
        System.out.println("Home page connected");
//        try {
            return "home";
//        } catch
//        (Exception e) {
//            System.out.println("Something went wrong.");
//            return "home";
//        }
    }
}
