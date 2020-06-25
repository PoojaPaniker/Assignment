package com.abc.assignment.stock.service;

import com.abc.assignment.stock.model.Stock;
import com.abc.assignment.stock.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class StockService {

    @Autowired
    StockRepo stockRepo;

    public void addStocks(List<Stock> stock) {
        stockRepo.saveAll(stock);

    }

    public void updateStock(int itemId, int count) {
        Stock stock = getStock(itemId);
        stock.setAvailableStock(stock.getAvailableStock() - count);
        stockRepo.save(stock);
    }

    public Stock getStock(int itemId) {
        return stockRepo.findById(itemId).get();

    }

    @PostConstruct
    public void loadData() {
        addStocks(Arrays.asList(new Stock(1, 10), new Stock(2, 50),new Stock(3, 0)));

    }
}
