package com.pnb.kata;

import com.pnb.kata.model.Book;
import com.pnb.kata.service.PriceCalculator;

public class Main {
    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addBooks(new Book("Clean Code", "Robert Martin", 2008));
        priceCalculator.addBooks(new Book("Clean Coder", "Robert Martin", 2008));
        double price = priceCalculator.getTotalPrice();
        System.out.println(price);

    }
}