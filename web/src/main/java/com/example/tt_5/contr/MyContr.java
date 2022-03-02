package com.example.tt_5.contr;

import com.example.tt_5.entity.MyMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class MyContr {


    @GetMapping("/m")
    public String get() {
        return MyMessage.MESS;
    }
}
