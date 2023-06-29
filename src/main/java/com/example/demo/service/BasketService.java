package com.example.demo.service;

import com.example.demo.model.Item;

import java.util.List;

public interface BasketService {

    void add(List<Integer> ids);
    List<Item> get();

}
