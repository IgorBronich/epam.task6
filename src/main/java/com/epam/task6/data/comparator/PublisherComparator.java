package com.epam.task6.data.comparator;

import com.epam.task6.model.Book;

import java.util.Comparator;

public class PublisherComparator implements Comparator<Book> {
    @Override
    public int compare(Book bookOne, Book bookTwo) {

            String publisherOne = bookOne.getPublisher();
            String publisherTwo = bookOne.getPublisher();

            return publisherOne.compareToIgnoreCase(publisherTwo);
    }
}
