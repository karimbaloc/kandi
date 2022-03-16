package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class kan {

        @RequestMapping("/")
        public String kar() {
            return "helloworld";

        }

}
