package org.example.ex4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LibraryTest {
    static Library library;
    static List<Book> booksToAdd;
    static List<Book> reorderedBooks;


    @BeforeAll
    static void setUp() {
        library = new Library();
        booksToAdd =
                new ArrayList<Book>(Stream.of("Jurassic Park", "Robin Hood", "Bilbo the Hobbit", "Lolita", "Frankenstein", "There is Light", "Farewell to Arms").map(Book::new).toList());
        booksToAdd.forEach(library.getBooks()::add);
        reorderedBooks = new ArrayList<Book>(booksToAdd);
        reorderedBooks.sort(Comparator.comparing(Book::getTitle));

    }

    @Test
    void testsOrderedAndUnorderedInsertionAndUniquelyInsertedElement() {
        assertThat(library.getBooks())
                .asList()
                .containsExactlyElementsOf(booksToAdd)
                .containsAnyElementsOf(reorderedBooks)
                .containsOnlyOnce(booksToAdd.get(1));
    }

    @Test
    void testAbsentElement() {
        library.getBooks().removeIf(book -> book.getTitle().equals("Robin Hood"));
        assertThat(library.getBooks())
                .asList()
                .doesNotContain(booksToAdd.get(1));
    }

}