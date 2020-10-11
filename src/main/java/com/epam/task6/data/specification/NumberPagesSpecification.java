package com.epam.task6.data.specification;

import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.List;

public class NumberPagesSpecification implements Specification<Integer> {
    @Override
    public List<Book> find(List<Book> books, Integer value) {
        List<Book> searchedBooks = new ArrayList<Book>();

        for(Book book: books){
            int numberPagesBook = book.getNumberPage();
            if(numberPagesBook == value){
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
}
