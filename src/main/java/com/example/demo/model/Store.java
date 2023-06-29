package com.example.demo.model;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class Store {

    private final Map<Integer, Item> items;

    private int idGen = 1;

    public Store() {
        this.items = new HashMap<>();
        items.put(idGen, new Item(idGen++, "Носки"));
        items.put(idGen, new Item(idGen++, "Джинсы"));
        items.put(idGen, new Item(idGen++, "Кросовки"));
    }

    public Collection<Item> get() {
        return items.values();
    }

    public void add(Item item) {
        items.put(item.getId(), item);
    }

    public void update(Item item) {
        if (items.containsKey(item.getId())) {
            items.replace(item.getId(), item);

        }
    }

    public Item remove(int id) {
        return items.remove(id);
    }

}
