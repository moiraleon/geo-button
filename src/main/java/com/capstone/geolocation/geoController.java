package com.capstone.geolocation;


import org.springframework.format.datetime.joda.MillisecondInstantPrinter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


@Controller
public class geoController {

    Calendar calendar;


    @RequestMapping(value = "/")
    @ResponseBody
    public String getHome() {
//        System.out.println("button clicked at:"+ System.currentTimeMillis()); prints out time in millis// System.out.println(System.nanoTime());+ (Calendar.RFC_1123_DATE_TIME)
        System.out.println("Time Data collected when button clicked");
        System.out.println("button clicked at:"+ System.currentTimeMillis() + " milliseconds");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + " hour/minutes");
        System.out.println("RFC_1123_DATE_TIME" + DateTimeFormatter.RFC_1123_DATE_TIME.format(ZonedDateTime.now()));
        System.out.println("ISO_ZONED_DATE_TIME" + DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now()));
        System.out.println("Location Data collected when button clicked");

        return "<html><h1>Welcome</h1><button value=\"time\" display=\"time\" type=\"submit\" onclick=\"console.log('button clicked - check server for info')\" >Download</button></html>";
    }

//    onclick="myFunction()"
}
