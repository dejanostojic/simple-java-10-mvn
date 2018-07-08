package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/testJava10")
public class RestController {

    @RequestMapping(method = RequestMethod.GET, path = "/echo")
    public String echoParam(@RequestParam String val,
                            @RequestParam(value="toUpper", required = false, defaultValue = "false")
                                    boolean toUpper){
        if (val == null){
            throw new RuntimeException("Bad request. Param val is required");
        }
        if (toUpper){
            return val.toUpperCase();
        }

        return val;
    }


}
