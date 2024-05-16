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
        Book cleanCode = new Book();
        cleanCode.setName("Clean Code");
        cleanCode.setPage(200);
        books[0] = cleanCode;
        Book dune = new Book();
        dune.setName("Dune");
        dune.setPage(800);
        books[1] = dune;
        Book gp = new Book();
        gp.setName("Data Warehousing with Greenplum");
        gp.setPage(2000);
        books[2] = gp;
        Book td = new Book();
        td.setName("Teradata SQL");
        td.setPage(1000);
        books[3] = td;
        showBooks(books);
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        showBooks(books);
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.println("Имя книжки '" + books[i].getName() + "' кол-во стр. " + books[i].getPage());
            }
        }
    }
}
