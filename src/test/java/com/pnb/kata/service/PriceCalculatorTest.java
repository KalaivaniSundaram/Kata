package com.pnb.kata.service;

import com.pnb.kata.model.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void addBooks() {

    }

    @Test
    public void getTotalPriceForOneBook() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addBooks(new Book("Clean Code", "Robert Martin", 2008));
        assertEquals(50.0,priceCalculator.getTotalPrice(),0.01);
    }

    @Test
    public void getTotalPriceFor2DifferentBooks() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addBooks(new Book("Clean Code", "Robert Martin", 2008));
        priceCalculator.addBooks(new Book("Clean Coder", "Robert Martin", 2008));
        assertEquals(95.0,priceCalculator.getTotalPrice(),0.01);
    }

    @Test
    public void getTotalPriceFor3DifferentBooks() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addBooks(new Book("Clean Code", "Robert Martin", 2008));
        priceCalculator.addBooks(new Book("Clean Coder", "Robert Martin", 2008));
        priceCalculator.addBooks(new Book("Clean Architecture", "Robert Martin", 2017));
        assertEquals(135.0,priceCalculator.getTotalPrice(),0.01);
    }

    @Test
    public void getTotalPriceFor4DifferentBooks() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addBooks(new Book("Clean Code", "Robert Martin", 2008));
        priceCalculator.addBooks(new Book("Clean Coder", "Robert Martin", 2008));
        priceCalculator.addBooks(new Book("Clean Architecture", "Robert Martin", 2017));
        priceCalculator.addBooks(new Book("Test Driven Development by Example", "Kent Beck", 2003));
        assertEquals(160.0,priceCalculator.getTotalPrice(),0.01);
    }

    @Test
    public void getTotalPriceFor5DifferentBooks() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addBooks(new Book("Clean Code", "Robert Martin", 2008));
        priceCalculator.addBooks(new Book("Clean Coder", "Robert Martin", 2008));
        priceCalculator.addBooks(new Book("Clean Architecture", "Robert Martin", 2017));
        priceCalculator.addBooks(new Book("Test Driven Development by Example", "Kent Beck", 2003));
        priceCalculator.addBooks(new Book("Working Effectively With Legacy Code", "Michael C. Feathers", 2004));
        assertEquals(187.5,priceCalculator.getTotalPrice(),0.01);
    }
}