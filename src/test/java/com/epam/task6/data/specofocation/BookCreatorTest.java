package com.epam.task6.data.specofocation;

import com.epam.task6.data.BookCreator;
import com.epam.task6.data.BookParser;
import com.epam.task6.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookCreatorTest {
    private final static String LINE = "NewBook Art 2019 515 Bronich Stankevich";

    @Test
    public void BookCreatorTestShouldCreateListBook(){
    //given
    BookCreator creator = new BookCreator(new BookParser());

    //when
    List<Book> books = creator.createList(LINE);

    //then
    Assert.assertEquals(books, createActualList());
    }
    private List<Book> createActualList(){
        List<Book> actualList = new ArrayList<Book>();
        Book book = new Book("NewBook", "Art", 2019, 515, createList());
        actualList.add(book);
        return actualList;
    }
    private List<String> createList() {
        List<String> authors = new ArrayList<String>();
        authors.add("Bronich");
        authors.add("Stankevich");
        return authors;
    }
}
