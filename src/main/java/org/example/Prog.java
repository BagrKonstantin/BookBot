package org.example;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Prog {
    static Scanner input;
    static Library library;
    static ArrayList<Book> booksTaken;

    Prog() {
        Record[] records = new Record[5];
        records[0] = new Record(new Book("Автостопом по галактике", 1979, new String[]{"Дуглас Адамс"}), 5);
        records[1] = new Record(new Book("Ресторан в конце Вселенной", 1980, new String[]{"Дуглас Адамс"}), 1);
        records[2] = new Record(new Book("1984", 1948, new String[]{"Джордж Оруэлл"}), 1);
        records[3] = new Record(new Book("1984", 1949, new String[]{"Джордж Оруэлл"}), 1);
        records[4] = new Record(new Book("Понедельник начинается в субботу", 1965, new String[]{"Борис Натанович Стругацкий", "Аркадий Натанович Стругацкий"}), 1);

        library = new Library(records);
        input = new Scanner(System.in);
        booksTaken = new ArrayList<>();
    }

    public void run() {
        while (true) {
            System.out.println("Введите команду (get, put, list, all)");
            String command = input.nextLine();
            switch (command) {
                case "get":
                    askAboutBook();
                    break;
                case "put":
                    library.returnBook(booksTaken.get(0));
                    booksTaken.remove(0);
                    break;
                case "list":
                    for (Book book : booksTaken) {
                        System.out.println(book);
                    }
                    break;
                case "all":
                    System.out.println(library);
                    break;
            }
        }
    }

    private void askAboutBook() {
        System.out.println("Введите название книги которую вы ищите");
        String name = input.nextLine();
        ArrayList<Book> books = library.askBook(name);
        for (int i = 0; i < books.size(); i++) {
            System.out.print(i + 1);
            System.out.print(' ');
            System.out.print(books.get(i));
            System.out.println();
        }
        if (books.size() == 0) {
            System.out.println("Такой Книги нет");
            return;
        }
        System.out.println("Введите номер книги которую хотите взять");
        int number = input.nextInt() - 1;
        Optional<Book> book = library.takeBook(books.get(number));
        if (book.isPresent()) {
            booksTaken.add(book.get());
        } else {
            System.out.println("Извините этой книги нет в библиотеке");
        }

    }
}
