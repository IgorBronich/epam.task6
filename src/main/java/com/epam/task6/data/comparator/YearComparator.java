package com.epam.task6.data.comparator;


import com.epam.task6.model.Book;

import java.util.Comparator;

public class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book bookOne, Book bookTwo) {
        Integer yearOne = bookOne.getYear();
        Integer yearTwo = bookOne.getYear();

        return yearOne.compareTo(yearTwo);
    }
}
