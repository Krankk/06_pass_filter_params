package ru.neoflex.dev.spring.pass_filter_params.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class MyController {

    @PostMapping("/testcall1")
   // @ResponseStatus(HttpStatus.OK)
    public  String testCallOne(@RequestBody MyObject request) {
        return request.getDate() + request.getOtherValue() + request.getVeryOtherValue();
    }



    @GetMapping("/testcall2/{path}")
    public String testCallTwo(@PathVariable int path, FilterParams filter) {
        return path + filter.getAge() + filter.getName();
    }

   // "/testcall2/1/?name=test,age=5")


}
