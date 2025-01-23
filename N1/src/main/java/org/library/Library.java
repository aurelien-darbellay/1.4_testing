package org.library;

import java.util.ArrayList;
import java.util.Arrays;
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

    public void addBookAt(String book, int index) {
        this.books.add(index, book);
    }

    public void addBooks(List<String> books) {
        books.forEach(book -> addBookAt(book, this.books.size() - 1));
    }

    public String getBookAt(int index) {
        return this.books.get(index);
    }

    public void eliminateBook(String target) {
        this.books.removeIf(book -> book.equals(target));
    }

    public List<String> getOrderedBooks() {
        List<String> orderedBooks = new ArrayList<String>(this.books);
        orderedBooks.sort(null);
        return orderedBooks;
    }

    int initializeSomeBooks() {
        int num = (int) Math.floor(Math.random() * 50);
        List<String> booksToAdd =
                Arrays.asList("Robin Hood", "Jurassic Park", "Bilbo the Hobbit", "Lolita", "Frankenstein", "There is Light", "Farewell to Arms", "1984", "To Kill a Mockingbird", "Pride and Prejudice", "The Great Gatsby", "Moby Dick", "War and Peace", "The Catcher in the Rye", "The Lord of the Rings", "The Hobbit", "Brave New World", "The Odyssey", "Crime and Punishment", "The Alchemist", "The Little Prince", "The Brothers Karamazov", "Anna Karenina", "The Divine Comedy", "The Sun Also Rises", "The Picture of Dorian Gray", "Wuthering Heights", "Jane Eyre", "The Scarlet Letter", "The Adventures of Huckleberry Finn", "The Iliad", "Don Quixote", "Les Misérables", "The Count of Monte Cristo", "The Stranger", "One Hundred Years of Solitude", "The Handmaid's Tale", "The Road", "The Book Thief", "The Kite Runner", "The Da Vinci Code", "The Shining", "The Hitchhiker's Guide to the Galaxy", "The Chronicles of Narnia", "The Hunger Games", "Harry Potter and the Sorcerer's Stone", "The Girl with the Dragon Tattoo", "Gone with the Wind", "The Secret Garden", "The Wind in the Willows")
                        .subList(0, num);
        this.setBooks(new ArrayList<String>(booksToAdd));
        return num;
    }

}
