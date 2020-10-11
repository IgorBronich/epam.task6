package com.epam.task6;


import com.epam.task6.data.BookCreator;
import com.epam.task6.data.BookParser;
import com.epam.task6.data.DaoBook;
import com.epam.task6.data.FileDataReader;
import com.epam.task6.data.factory.BookField;
import com.epam.task6.exception.DataException;
import com.epam.task6.model.Book;
import org.apache.log4j.Logger;

import java.util.List;

public class Main {
    private final static org.apache.log4j.Logger LOGGER = Logger.getLogger(Main.class);
    private final static String INPUT = "data.txt";

    public static void main(String[] args) throws DataException {


        FileDataReader reader = new FileDataReader(INPUT);
        String data = reader.readFromFile();

        BookCreator creator = new BookCreator(new BookParser());
        List<Book> books = creator.createList(data);

        DaoBook daoBook = new DaoBook();
        daoBook.addBook(books);

        Book book = books.get(0);

        daoBook.removeBook(book);

        daoBook.sortByTag(BookField.AUTHORS);

        List<Book> searchedBooks = daoBook.findByTeg(BookField.AUTHORS, "Bronich");

        System.out.println(searchedBooks);

        LOGGER.info("The end!");







    }
}
