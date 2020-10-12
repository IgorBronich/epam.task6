package com.epam.task6.data.factory;


import com.epam.task6.data.comparator.*;
import com.epam.task6.model.Book;

import java.util.Comparator;

public class ComparatorFactory {

    public Comparator<Book> create(BookField field){
        switch (field){
            case TITLE:
                return new TitleBookComparator();
            case AUTHORS:
                return new FirstAuthorComparator();
            case YEAR:
                return new YearComparator();
            case PUBLISHER:
                return new PublisherComparator();
            case NUMBER_PAGES:
                return new NumberPagesComparator();
            default:
                throw new IllegalArgumentException();
        }
    }
}
