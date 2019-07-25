package com.apidata.QuailSmartFarm.controllers.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping(value = "")
    public String index() throws Exception {
        return "Welcome to api data quail smart farm";
    }
}
