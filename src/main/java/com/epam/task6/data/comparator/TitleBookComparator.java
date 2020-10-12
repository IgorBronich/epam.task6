package com.epam.task6.data.comparator;

import com.epam.task6.model.Book;

import java.util.Comparator;

public class TitleBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book bookOne, Book bookTwo) {

        String titleOne = bookOne.getTitle();
        String titleTwo = bookOne.getTitle();

        return titleOne.compareToIgnoreCase(titleTwo);
    }
}
