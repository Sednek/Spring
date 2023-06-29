package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/order")
public class ItemBasketController {

    private final BasketService basketService;

    public ItemBasketController(BasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping(path = "/add")
    public void addItem(@RequestParam List<Integer> ids) {
        basketService.add(ids);
    }

    @GetMapping(path = "/get")
    public List<Item> getItem() {
        return basketService.get();
    }
}
