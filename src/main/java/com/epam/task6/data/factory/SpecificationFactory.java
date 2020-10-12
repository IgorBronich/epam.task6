package com.epam.task6.data.factory;

import com.epam.task6.data.specification.*;

public class SpecificationFactory {

    public Specification create(BookField type){

        switch (type){
            case TITLE:
                return new TitleSpecification();
            case AUTHORS:
                return new AuthorSpecification();
            case PUBLISHER:
                return new PublisherSpecification();
            case YEAR:
                return new YearSpecification();
            case NUMBER_PAGES:
                return new NumberPagesSpecification();
            default:
                throw  new IllegalArgumentException();
        }
    }
}
