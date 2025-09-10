package part1.week6.ül101;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> matches = new ArrayList<>();
        for (Book book : books) {
            if (book.title().toLowerCase().trim().contains(title.toLowerCase().trim())) {
                matches.add(book);
            }
        }

        return matches;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> matches = new ArrayList<>();
        for (Book book : books) {
            if (book.publisher().toLowerCase().trim().contains(publisher.toLowerCase().trim())) {
                matches.add(book);
            }
        }

        return matches;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> matches = new ArrayList<>();
        for (Book book : books) {
            if (book.year() == year) {
                matches.add(book);
            }
        }

        return matches;
    }
}
