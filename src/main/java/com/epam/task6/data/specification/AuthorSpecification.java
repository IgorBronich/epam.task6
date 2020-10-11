package com.epam.task6.data.specification;

import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorSpecification implements Specification<String> {
    @Override
    public List<Book> find(List<Book> books,  String value) {
        List<Book> searchedBooks = new ArrayList<Book>();

        for(Book book: books){
            List<String> authorBooks = book.getAuthors();
            for(String author: authorBooks){
                if(author.equalsIgnoreCase(value)) {
                    searchedBooks.add(book);
                }
            }
        }
        return searchedBooks;
    }
}
