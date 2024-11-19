package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    
    @Test
    public void testGetTitle() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        assertEquals("The Great Gatsby", book.getTitle());
    }
    
    @Test
    public void testGetAuthor() {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");
        assertEquals("Harper Lee", book.getAuthor());
    }
    
    @Test
    public void testSetAvailability() {
        Book book = new Book("1984", "George Orwell");
        book.setAvailability(true);
        assertTrue(book.isAvailable());
    }
    
    // Add more test methods as needed
    
}