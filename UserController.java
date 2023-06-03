package com.OnetoMany.Onetomany.Controller;

import com.OnetoMany.Onetomany.Dto.UserDtoResponse;
import com.OnetoMany.Onetomany.Dto.Userdto;
import com.OnetoMany.Onetomany.Entity.Customer;
import com.OnetoMany.Onetomany.Repository.Customerrepository;
import com.OnetoMany.Onetomany.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private Customerrepository customerrepository;
    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/Placeorder")
    public Customer placeorder(@RequestBody Userdto request){
        return customerrepository.save(request.getCustomer());
    }
    @GetMapping("/getall")
    public List<Customer> getallrecords(){
        return customerrepository.findAll();
    }
    @GetMapping("/getallinfo")
    public List<UserDtoResponse> getjoininformation(){
        return customerrepository.getinformation();
}}
