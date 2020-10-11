package com.epam.task6.data.comparator;


import com.epam.task6.model.Book;

import java.util.Comparator;

public class FirstAuthorComparator implements Comparator<Book> {


    @Override
    public int compare(Book bookOne, Book bookTwo) {

            String authorOne = bookOne.getAuthors(0);
            String authorTwo = bookTwo.getAuthors(0);

            return authorOne.compareToIgnoreCase(authorTwo);
    }
}
