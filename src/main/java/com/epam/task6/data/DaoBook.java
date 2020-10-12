package com.epam.task6.data;


import com.epam.task6.data.factory.ComparatorFactory;
import com.epam.task6.data.factory.SpecificationFactory;
import com.epam.task6.data.factory.BookField;
import com.epam.task6.data.specification.Specification;
import com.epam.task6.exception.DataException;
import com.epam.task6.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DaoBook {
    private List<Book> books = new ArrayList<Book>();
    private SpecificationFactory factory = new SpecificationFactory();

    public void addBook(Book book) throws DataException {
        if(books.contains(book)){
            throw new DataException("List has book.");
        }
        books.add(book);
    }

    public void addBook(List<Book> books) throws DataException{
        for(Book book: books){
            addBook(book);
        }
    }

    public void removeBook(Book book) throws DataException{
        if(!books.contains(book)){
            throw new DataException("List hasn't book");
        }
        books.remove(book);
    }

    public <T> List<Book> findByTeg(BookField specificationType, T name){


        Specification specification = factory.create(specificationType);

        return specification.find(books, name);
    }

    public void sortByTag(BookField field){
        ComparatorFactory factory = new ComparatorFactory();
        Comparator comparator = factory.create(field);
        Collections.sort(books, comparator);
    }
}
