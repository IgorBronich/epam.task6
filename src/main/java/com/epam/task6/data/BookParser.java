package com.epam.task6.data;

import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookParser {

    private final static String SEPARATOR = "\\s+";

    public Book parseBook(String line){
        String[] scopes = line.split(SEPARATOR);

        String title = scopes[0];
        String publisher = scopes[1];
        int year = Integer.parseInt(scopes[2]);
        int numberPage = Integer.parseInt(scopes[3]);
        List<String> authors = new ArrayList<String>();

        for(int i = 4; i < scopes.length; i++){
            authors.add(scopes[i]);
        }
        return new Book(title, publisher, year, numberPage, authors);
    }
}
