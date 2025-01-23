package org.library;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    static Library library;

    @BeforeAll
    static void init(){
        library = new Library();
    }
    @Test
    void testGetBooks() {
        assertNotEquals(null, library.getBooks());
    }

    @Test
    void testSetBooks() {
        initializeSomeBooks();
        assertEquals(3,library.getBooks().size());
    }

    @Test
    void testAddBookAt() {
        initializeSomeBooks();
        library.addBookAt("The Lion King",2);
        library.addBookAt("White Malice", 1);
        assertEquals("White Malice",library.getBooks().get(1));
        assertEquals("The Lion King",library.getBooks().get(3));
    }

    @Test
    void addBooks() {
    }

    @Test
    void getBookAt() {
    }

    @Test
    void eliminateBook() {
    }

    private void initializeSomeBooks(){
        List<String> booksToAdd = new ArrayList<String>();
        booksToAdd.add("Robin Hood");
        booksToAdd.add("Mary Poppins");
        booksToAdd.add("The Ethnic Cleansing of Palestine");
        library.setBooks(booksToAdd);
    }
}