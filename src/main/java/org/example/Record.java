package org.example;

public class Record {
    private Book book;
    private int amount;
    Record(Book book, int amount) {
        this.book = book;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return book.toString() + " в колличестве " + amount + " штук";
    }

    public Book getBook() {
        return book;
    }

    public int getAmount() {
        return amount;
    }

    public void minusOne() {
        amount -= 1;
    }

    public void plusOne() {
        amount += 1;
    }
}
