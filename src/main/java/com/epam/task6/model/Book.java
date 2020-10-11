package com.epam.task6.model;


import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String title;
    private final List<String> authors;
    private final String publisher;
    private final Integer year;
    private final Integer numberPage;

    public Book(String title, String publisher, int year, int numberPage, List<String> authors) {
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.numberPage = numberPage;
    }

    public String getTitle() {
        return title;
    }

    public List <String> getAuthors() {
        List<String> clone = new ArrayList<String>();
        clone.addAll(authors);
        return clone;
    }

    public String getAuthors(int index){
        return authors.get(index);
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getNumberPage() {
        return numberPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Book book = (Book) o;

        if (year != book.year){
            return false;
        }
        if (numberPage != book.numberPage){
            return false;
        }
        if (!title.equals(book.title)){
            return false;
        }
        if (!authors.equals(book.authors)){
            return false;
        }
        return publisher.equals(book.publisher);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + authors.hashCode();
        result = 31 * result + publisher.hashCode();
        result = 31 * result + year;
        result = 31 * result + numberPage;
        return result;
    }
}
