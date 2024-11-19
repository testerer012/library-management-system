package com.library;

import java.time.LocalDate;

public class Transaction {
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate dueDate;

    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.borrowDate = LocalDate.now();
        this.dueDate = borrowDate.plusDays(14); // Assuming the due date is 14 days from the borrow date
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void returnBook() {
        book.setAvailability(true);
    }
}