package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> ids;

    public Basket(List<Integer> ids) {
        this.ids = ids;
    }

    public void add(List<Integer> ids) {
        this.ids.addAll(ids);
    }

    public List<Integer> getIds() {
        return ids;
    }
}
