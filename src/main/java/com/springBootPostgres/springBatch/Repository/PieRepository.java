package com.springBootPostgres.springBatch.Repository;

import com.springBootPostgres.springBatch.Model.Customer;
import com.springBootPostgres.springBatch.Model.PieModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieRepository extends CrudRepository<PieModel, Integer> {
}
