package com.pnb.kata.service;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.pnb.kata.model.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.pnb.kata.constants.ApplicationConstants.SINGLE_BOOK_PRICE;

public class PriceCalculator {

    private Multiset<Book> books = HashMultiset.create();
    public void addBooks(Book book){
        books.add(book);
    }

    public Double getTotalPrice(){
        return applyDiscounts(books);
    }

    private Double applyDiscounts(Multiset<Book> books) {
        double totalPrice = 0.0;
        while (!books.isEmpty()) {
            Set<Book> uniqueGroup = new HashSet<>();
            List<Book> booksToDiscard = new ArrayList<>();
            for (Multiset.Entry<Book> entry : books.entrySet()) {
                if (entry.getCount() > 0) {
                    uniqueGroup.add(entry.getElement());
                    booksToDiscard.add(entry.getElement());
                    if (uniqueGroup.size() == books.size())
                        break;
                }
            }
            removeBookForEachPass(booksToDiscard);
            int distinctCount = uniqueGroup.size();
            totalPrice = totalPrice +
                    distinctCount * SINGLE_BOOK_PRICE * (1 - DiscountCalculator.getDiscount(distinctCount));
        }
        return totalPrice;
    }


    private void removeBookForEachPass(List<Book> booksToDiscard){
        for (Book book : booksToDiscard) {
            books.remove(book, 1); // Removes one copy of the book
        }
    }

}
