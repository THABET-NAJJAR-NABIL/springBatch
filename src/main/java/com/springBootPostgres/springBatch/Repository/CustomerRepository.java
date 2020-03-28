package com.springBootPostgres.springBatch.Repository;

import com.springBootPostgres.springBatch.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
