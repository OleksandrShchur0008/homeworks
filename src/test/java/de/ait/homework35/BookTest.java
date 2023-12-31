package de.ait.homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book testBook;

    @BeforeEach
    void setUp() {
        testBook = new Book("N1", "Unit-testing", "Java");
    }

    @Test
    void testCreateBookHappyPath() {
        assertNotNull(testBook);
    }

    @Test
    void testGetIsbn() {
        assertEquals("N1", testBook.getIsbn());
    }

    @Test
    void testSetIsbn() {
        testBook.setIsbn("N8");
        assertEquals("N8", testBook.getIsbn());
    }

}