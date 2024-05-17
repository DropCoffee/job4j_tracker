package ru.job4j.pojo;

public class Library {
    private static void showBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println("Имя книжки '" + books[i].getName() + "' кол-во стр. " + books[i].getPage());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean Code", 200);
        books[1] = new Book("Dune", 800);
        books[2] = new Book("Data Warehousing with Greenplum", 2000);
        books[3] = new Book("Teradata SQL", 1000);
        showBooks(books);
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        showBooks(books);
        for (int i = 0; i < books.length; i++) {
            if ("Clean Code".equals(books[i].getName())) {
                System.out.println("Имя книжки '" + books[i].getName() + "' кол-во стр. " + books[i].getPage());
            }
        }
    }
}
