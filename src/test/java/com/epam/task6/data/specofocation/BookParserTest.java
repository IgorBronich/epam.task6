package com.epam.task6.data.specofocation;

import com.epam.task6.data.BookParser;
import com.epam.task6.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookParserTest {
    private final static String LINE = "NewBook Art 2019 515 Bronich Stankevich";
    @Test
    public void BookParseTestShouldParseLine(){
        //given
        BookParser bookParser = new BookParser();

        //when
        Book book = bookParser.parseBook(LINE);

        //then
        Assert.assertEquals(book, new Book("NewBook", "Art", 2019, 515, createList()));
    }

    private List<String> createList() {
        List<String> authors = new ArrayList<String>();
        authors.add("Bronich");
        authors.add("Stankevich");
        return authors;
    }

}
