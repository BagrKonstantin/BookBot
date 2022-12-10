package org.example;

import java.util.*;

public class Library implements List<Record> {
    final private ArrayList<Record> storage;

    public Library(Record[] new_books) {
        storage = new ArrayList<>(List.of(new_books));
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getBook().getName().equalsIgnoreCase((String) o) && storage.get(i).getAmount() > 0) {
                return true;
            }
        }
        return false;
    }

    public Optional<Book> takeBook(Book book) {
        for (Record record : storage) {
            if (record.getBook().equals(book)) {
                if (record.getAmount() == 0) return Optional.empty();
                record.minusOne();
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public void returnBook(Book book) {
        for (Record record : storage) {
            if (record.getBook().equals(book)) {
                record.plusOne();
                return;
            }
        }
    }

    public ArrayList<Book> askBook(String name) {
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getBook().getName().equalsIgnoreCase(name)) {
                books.add(storage.get(i).getBook());
            }
        }
        return books;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Record record: storage) {
            stringBuilder.append(record);
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    @Override
    public Record get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public Iterator<Record> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Record record) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Record> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Record> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }


    @Override
    public Record set(int index, Record element) {
        return null;
    }

    @Override
    public void add(int index, Record element) {

    }

    @Override
    public Record remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Record> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Record> listIterator(int index) {
        return null;
    }

    @Override
    public List<Record> subList(int fromIndex, int toIndex) {
        return null;
    }
}
