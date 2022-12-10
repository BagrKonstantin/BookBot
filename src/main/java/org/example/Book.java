package org.example;

import java.util.Arrays;

public class Book {
    private String name;
    private int year;
    private String[] authors;

    Book(String name, int year, String[] authors) {
        this.name = name;
        this.year = year;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(' ');
        stringBuilder.append(year);
        stringBuilder.append(' ');
        for (String author: authors) {
            stringBuilder.append(author);
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }
}
