package com.woopi.project.api.date.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DateContoller
 */
@RestController
@RequestMapping("/time")
public class DateContoller {

    @GetMapping("/get/current/date")
    public String getCurrentDate () {
        return "111111";
    }
    
    
}