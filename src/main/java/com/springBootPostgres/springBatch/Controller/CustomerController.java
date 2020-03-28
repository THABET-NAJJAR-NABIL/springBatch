package com.springBootPostgres.springBatch.Controller;

import com.springBootPostgres.springBatch.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(path="feedCustomerData")
    public  void feedCustomerData() {
        customerService.saveUserData();
    }
}
