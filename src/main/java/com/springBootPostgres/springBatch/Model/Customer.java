package com.springBootPostgres.springBatch.Model;

import org.hibernate.id.IntegralDataTypeHolder;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String dept;
    private  String salary;

    public Customer(){}
    public Customer(String _id, String _name, String _dept, String _salary){
        this.id = _id;
        this.name = _name;
        this.dept = _dept;
        this.salary = _salary;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
