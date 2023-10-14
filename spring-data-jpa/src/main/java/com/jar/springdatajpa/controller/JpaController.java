package com.jar.springdatajpa.controller;

import com.jar.springdatajpa.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @GetMapping("/one-to-one")
    public String processOneToOne(){
        jpaService.processOneToOne();
        return "Request accepted for processOneToOne";
    }

    @GetMapping("/one-to-many")
    public String processOneToMany(){
        jpaService.processOneToMany();
        return "Request accepted for processOneToMany";
    }

    @GetMapping("/many-to-one")
    public String processManyToOne(){
        jpaService.processManyToOne();
        return "Request accepted for processManyToOne";
    }

    @GetMapping("/many-to-many")
    public String processManyToMany(){
        jpaService.processManyToMany();
        return "Request accepted for processManyToMany";
    }

    @GetMapping("/native-query")
    public String processNativeQuery(){
        jpaService.processNativeQuery();
        return "Request accepted for processNativeQuery";
    }
}
