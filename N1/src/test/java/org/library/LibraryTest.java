package org.library;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    static Library library;

    @BeforeAll
    static void setUp() {
        library = new Library();
    }

    @Test
    void testGetBooks() {
        assertNotEquals(null, library.getBooks(), "Book collection null");
    }

    @Test
    void testSetBooks() {
        int num = library.initializeSomeBooks();
        assertEquals(num, library.getBooks().size(), "Incorrect book collection size");
    }

    @Test
    void testAddBookAt() {
        int num = library.initializeSomeBooks();
        library.addBookAt("The Lion King", num);
        library.addBookAt("White Malice", 0);
        assertEquals("White Malice", library.getBooks().getFirst(), "Incorrect insertion position - first");
        assertEquals("The Lion King", library.getBooks().getLast(), "Incorrect insertion position - last");
        assertEquals(num + 2, library.getBooks().size(), "Incorrect size after insertion");
    }

    @Test
    void testDuplicate() {
        library.initializeSomeBooks();
        assertEquals(new HashSet<String>(library.getBooks()).size(), library.getBooks().size(), "Duplicates in book collection");
    }

    @Test
    void testGetBookAt() {
        int num = library.initializeSomeBooks();
        assertNotNull(library.getBookAt((int) Math.floor((double) num / 2)), "No book retrieved by getBookAt");
    }

    @Test
    void testEliminateBook() {
        int num = library.initializeSomeBooks();
        String book = library.getBookAt((int) Math.floor((double) num / 2));
        library.eliminateBook(book);
        assertEquals(num - 1, library.getBooks().size(), "Incorrect size after elimination");
        assertFalse(library.getBooks().contains(book), "Book not eliminated");
    }

    @Test
    void testInitializeSomeBooks() {
        int num = library.initializeSomeBooks();
        List<String> booksToAdd =
                Arrays.asList("Robin Hood", "Jurassic Park", "Bilbo the Hobbit", "Lolita", "Frankenstein", "There is Light", "Farewell to Arms", "1984", "To Kill a Mockingbird", "Pride and Prejudice", "The Great Gatsby", "Moby Dick", "War and Peace", "The Catcher in the Rye", "The Lord of the Rings", "The Hobbit", "Brave New World", "The Odyssey", "Crime and Punishment", "The Alchemist", "The Little Prince", "The Brothers Karamazov", "Anna Karenina", "The Divine Comedy", "The Sun Also Rises", "The Picture of Dorian Gray", "Wuthering Heights", "Jane Eyre", "The Scarlet Letter", "The Adventures of Huckleberry Finn", "The Iliad", "Don Quixote", "Les Misérables", "The Count of Monte Cristo", "The Stranger", "One Hundred Years of Solitude", "The Handmaid's Tale", "The Road", "The Book Thief", "The Kite Runner", "The Da Vinci Code", "The Shining", "The Hitchhiker's Guide to the Galaxy", "The Chronicles of Narnia", "The Hunger Games", "Harry Potter and the Sorcerer's Stone", "The Girl with the Dragon Tattoo", "Gone with the Wind", "The Secret Garden", "The Wind in the Willows");
        assertEquals("Robin Hood", library.getBooks().getFirst(), "Wrong book in first position");
        assertEquals(booksToAdd.get(num - 1), library.getBooks().getLast(), "Wrong book in last position");
    }

    @Test
    void testAlphabeticalOrder() {
        List<String> booksToAdd = new ArrayList<String>(List.of(new String[]{"Robin Hood", "Jurassic Park", "Bilbo the Hobbit", "Lolita", "Frankenstein"}));
        library.setBooks(new ArrayList<String>(booksToAdd));
        booksToAdd.sort(null);
        assertNotEquals(booksToAdd, library.getBooks(), "Unexpectedly correct alphabetical order -- test not working");
        assertEquals(booksToAdd, library.getOrderedBooks(), "Incorrect alphabetical order");
        booksToAdd.removeIf(item -> item.equals("Robin Hood"));
        library.eliminateBook("Robin Hood");
        assertEquals(booksToAdd, library.getOrderedBooks(), "Incorrect alphabetical order after elimination");
    }
}