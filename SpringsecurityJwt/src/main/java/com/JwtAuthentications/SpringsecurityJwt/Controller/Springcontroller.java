package com.JwtAuthentications.SpringsecurityJwt.Controller;

import com.JwtAuthentications.SpringsecurityJwt.Entity.Springjwt;
import com.JwtAuthentications.SpringsecurityJwt.SpringServiceImpl.Springservice;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/head")
public class Springcontroller {
    @Autowired
    public Springservice springservice;
    @GetMapping("/getlist")
    public List<Springjwt> list(){
        return springservice.list;
    }
    @GetMapping("/{name}")
    public Springjwt getname(@PathVariable String name){
        return springservice.getname(name);
    }
    @PostMapping("/postdata")
    public Springjwt postdata(@RequestBody Springjwt post){
        return springservice.postdata(post);
    }

}
