package com.epam.task6.data;

import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCreator {
    private final static String SEPARATOR = "\n";
    private BookParser bookParser;

    public BookCreator(BookParser bookParser) {
        this.bookParser = bookParser;
    }

    public List<Book> createList(String data){
        String[] lines = data.split(SEPARATOR);
        List<Book> books = new ArrayList<Book>();

        for(int i = 0; i < lines.length; i++){
            Book book = bookParser.parseBook(lines[i]);
            books.add(book);
        }
        return books;
    }



}
