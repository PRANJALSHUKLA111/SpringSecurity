package com.JwtAuthentications.SpringsecurityJwt.SpringServiceImpl;

import com.JwtAuthentications.SpringsecurityJwt.Entity.Springjwt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Springservice {
    public List<Springjwt> list=new ArrayList<>();
    public Springservice(){
        list.add(new Springjwt("raj","raj","988@gmailcom"));
        list.add(new Springjwt("jain","jain","988@gmailcom"));
    }
    public List<Springjwt> list(){
        return this.list;
    }
    public Springjwt getname(String name){
        return list.stream().filter(Springjwt->Springjwt.getSusername().equals(name)).findAny().orElse(null);
    }
    public Springjwt postdata(Springjwt post){
        list.add(post);
        return post;

    }
}
