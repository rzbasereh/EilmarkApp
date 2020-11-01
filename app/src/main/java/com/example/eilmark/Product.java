package com.example.eilmark;

import java.security.PublicKey;

public class Product {
    private String title;
    private int price;

    public Product(String title, int price) {
        this.price = price;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
