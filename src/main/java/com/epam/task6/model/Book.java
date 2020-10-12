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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (title != null ? !title.equals(book.title) : book.title != null){
            return false;
        }
        if (authors != null ? !authors.equals(book.authors) : book.authors != null){
            return false;
        }
        if (publisher != null ? !publisher.equals(book.publisher) : book.publisher != null){
            return false;
        }
        if (year != null ? !year.equals(book.year) : book.year != null){
            return false;
        }
        return numberPage != null ? numberPage.equals(book.numberPage) : book.numberPage == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (numberPage != null ? numberPage.hashCode() : 0);
        return result;
    }
}
