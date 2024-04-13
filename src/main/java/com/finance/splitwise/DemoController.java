package com.finance.splitwise;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/expenses", method = RequestMethod.GET)
    public String x() {
        return "Add expense request";
    }
}
