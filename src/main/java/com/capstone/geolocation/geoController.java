package com.capstone.geolocation;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//
//
//
//@Controller
//public class geoController {
//
//    @RequestMapping(value = "/")
//    public String getHome() {
//        return "home";
//    }
//
//
//}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class geoController {

    @GetMapping("/assessment")
    public String index() {
        return "index";
    }

}