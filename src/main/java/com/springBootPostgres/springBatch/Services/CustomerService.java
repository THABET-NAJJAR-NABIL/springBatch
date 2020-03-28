package com.springBootPostgres.springBatch.Services;

import com.springBootPostgres.springBatch.Model.Customer;
import com.springBootPostgres.springBatch.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    String line = "";
    public void  saveUserData() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/customers.csv"));

            while ((line = br.readLine() )!= null){
                String [] data = line.split(",");
                Customer customer = new Customer(data[0], data[1], data[2], data[3]);
                customerRepository.save(customer);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
