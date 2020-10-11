package com.epam.task6.data.specification;

import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.List;

public class YearSpecification implements Specification<Integer>{
    @Override
    public List<Book> find(List<Book> books, Integer value) {

            List<Book> searchedBooks = new ArrayList<Book>();

            for(Book book: books){
                int yearBook = book.getYear();
                if(yearBook == value){
                    searchedBooks.add(book);
                }
            }
            return searchedBooks;
    }
}
