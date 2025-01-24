package org.example.ex4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }


    public List<Book> getBooks() {
        return this.books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    public Book getBookAt(int index) {
        return this.books.get(index);
    }


    public List<Book> getOrderedBooks() {
        List<Book> orderedBooks = new ArrayList<Book>(this.books);
        orderedBooks.sort(null);
        return orderedBooks;
    }

}
