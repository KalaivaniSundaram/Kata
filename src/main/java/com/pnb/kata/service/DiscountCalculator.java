package com.pnb.kata.service;

public class DiscountCalculator {
    public static double getDiscount(int distinctCount) {
        return switch (distinctCount) {
            case 2 -> 0.05;
            case 3 -> 0.10;
            case 4 -> 0.20;
            case 5 -> 0.25;
            default -> 0.0;
        };
    }
}
