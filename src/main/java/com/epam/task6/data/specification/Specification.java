package com.epam.task6.data.specification;

import com.epam.task6.model.Book;

import java.util.List;

public interface Specification<T> {
    List<Book> find(List<Book> books, T value);

}
