/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public List<String> sayHelo() {
        List<String> data = new ArrayList<String>();
        data.add("Hendro Steve");
        data.add("Welcome to Spring Boot");
        return data;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hitung/{var1}/{var2}")
    public List<String> hitung(@PathVariable("var1") int var1,
            @PathVariable("var2") int var2) {
        int hasil = var1 + var2;
        List<String> data = new ArrayList<String>();
        data.add("Hasil");
        data.add(hasil + "");
        return data;
    }

}
