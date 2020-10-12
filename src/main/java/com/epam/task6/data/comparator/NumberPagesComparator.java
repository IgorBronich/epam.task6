package com.epam.task6.data.comparator;


import com.epam.task6.model.Book;

import java.util.Comparator;

public class NumberPagesComparator implements Comparator<Book> {
    @Override
    public int compare(Book bookOne, Book bookTwo) {

       Integer numPageOne = bookOne.getNumberPage();
       Integer numPageTwo = bookTwo.getNumberPage();


        return numPageOne.compareTo(numPageTwo);
    }
}
