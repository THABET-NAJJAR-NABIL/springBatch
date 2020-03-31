package com.springBootPostgres.springBatch.Controller;

import com.springBootPostgres.springBatch.Model.PieModel;
import com.springBootPostgres.springBatch.Services.CustomerService;
import com.springBootPostgres.springBatch.Services.PieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PieController {
    @Autowired
    PieService pieService;

    @RequestMapping(path="feedPieData")
    public  void feedPieData() {
        pieService.saveUserData();
    }

    @GetMapping(path="getPieData")
    public ArrayList<PieModel> getPieData() {
        return pieService.getAll();
    }
}
