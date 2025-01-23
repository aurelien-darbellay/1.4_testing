package org.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<String>();
    }

    public Library(List<String> books) {
        this.books = books;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }
    public void addBookAt(String book, int index){
        this.books.add(index,book);
    }
    public void addBooks(List<String> books){
        books.forEach(book->addBookAt(book,this.books.size()-1));
    }
    public String getBookAt(int index){
        return this.books.get(index);
    }
    public void eliminateBook(String target){
        this.books.removeIf(book->book.equals(target));
    }
}
