package com.abc.assignment.stock.controller;

import com.abc.assignment.stock.model.Stock;
import com.abc.assignment.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping("/stock")
    public String checkService() {
        //dummy endpoint to check service sanity
        return "Up and Running";
    }

    @GetMapping("/stock/{itemId}")
    public Stock getStock(@PathVariable("itemId") int itemId) {
        return stockService.getStock(itemId);
    }

    @PutMapping("/stock/{itemId}/{count}")
    public void updateStock(@PathVariable("itemId") int itemId,
                            @PathVariable("count") int count,
                            @RequestBody Stock stock) {
        stockService.updateStock(itemId, count);
    }
}
