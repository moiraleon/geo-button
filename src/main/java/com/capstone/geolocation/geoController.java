package com.capstone.geolocation;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class geoController {

    public geoController() {
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getHome() {
        return "home";
    }

//    @RequestMapping("/")
//    public String homePage(Model model) {
//        System.out.println("Home page connected");
//            return "home.html";
//    }
//}


//    @RequestMapping("/")
//    public String homePage(Model model) {
//        System.out.println("Home page connected");
//        try {
//        return "home.html";
//        } catch
//        (Exception e) {
//            System.out.println("Something went wrong.");
//            return "home";
//        }
//    }
//}

}