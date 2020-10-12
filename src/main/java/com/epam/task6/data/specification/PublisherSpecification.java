package com.epam.task6.data.specification;

import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.List;

public class PublisherSpecification implements Specification<String> {
    @Override
    public List<Book> find(List<Book> books, String value) {
        List<Book> searchedBooks = new ArrayList<Book>();

        for(Book book: books){
            String publisherBook = book.getPublisher();
            if(publisherBook.equalsIgnoreCase(value)){
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
}
