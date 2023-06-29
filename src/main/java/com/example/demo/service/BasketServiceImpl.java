package com.example.demo.service;

import com.example.demo.model.Basket;
import com.example.demo.model.Item;
import com.example.demo.model.Store;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BasketServiceImpl implements BasketService {
    private final Basket basket;
    private final Store store;

    public BasketServiceImpl(Basket basket, Store store) {
        this.basket = basket;
        this.store = store;
    }

    public void add(List<Integer> ids) {
        basket.add(ids);
    }

    public List<Item> get() {
        return store.get().stream()
                .filter(item -> basket.getIds().contains(item.getId()))
                .collect(Collectors.toList());
    }
}
