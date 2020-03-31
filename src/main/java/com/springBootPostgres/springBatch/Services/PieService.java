package com.springBootPostgres.springBatch.Services;

import com.springBootPostgres.springBatch.Model.Customer;
import com.springBootPostgres.springBatch.Model.PieModel;
import com.springBootPostgres.springBatch.Repository.CustomerRepository;
import com.springBootPostgres.springBatch.Repository.PieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

@Service
public class PieService {
    @Autowired
    private PieRepository  pieRepository;
    String line = "";
    public void  saveUserData() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/pie_dataset.csv"));
            br.readLine();
            while ((line = br.readLine() )!= null){
                System.out.println(line);
                String [] data = line.split(",");
                PieModel pieModel = new PieModel(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2]);
                pieRepository.save(pieModel);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<PieModel> getAll() {

        return  (ArrayList<PieModel>) pieRepository.findAll();
    }
}
