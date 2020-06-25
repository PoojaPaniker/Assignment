package com.abc.assignment.stock.repository;

import com.abc.assignment.stock.model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends CrudRepository<Stock,Integer> {
}
