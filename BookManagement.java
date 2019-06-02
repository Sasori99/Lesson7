package com.k001.quoc;

import java.util.Scanner;

class Book{
    private String id;
    private String name;
    private String author;
    private String publisher;
    private String major;
    private int numberOfPages;

    Book(){
        id = name = author = publisher = major = "";
        numberOfPages = 0;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getMajor() {
        return major;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
public class BookManagement extends Book{
    private static int numberOfBooks = 0;
    private static Book[] books = new Book[100];
    public void addBook(){
        Book newBook = new Book();
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose a major (Select a option):\n1. Information Technology\n2. Science - Life\n3. Literature - Art");
            option = scan.nextInt();
            switch (option) {
                case 1: {
                    newBook.setMajor("Information Technology");
                    break;
                }
                case 2: {
                    newBook.setMajor("Science - Life");
                    break;
                }
                case 3: {
                    newBook.setMajor("Literature - Art");
                    break;
                }
                default: {
                    System.out.println("Not Found!!!!");
                    System.out.println("Please make a choice!!!");
                }
            }
        } while (option > 3 || option < 1);

        String getSpareCharater = scan.nextLine();

        System.out.println("ID of book:");
        newBook.setId(scan.nextLine());

        System.out.println("Name of book:");
        newBook.setName(scan.nextLine());

        System.out.println("Name of Author:");
        newBook.setAuthor(scan.nextLine());

        System.out.println("Name of Publisher:");
        newBook.setPublisher(scan.nextLine());

        System.out.println("Number of Pages:");
        newBook.setNumberOfPages(scan.nextInt());

        numberOfBooks++;
        books[numberOfBooks] = newBook;
    }
    public void displayList() {
        for (int i = 1; i <= numberOfBooks; i++) {
            System.out.println("ID: " + books[i].getId());
            System.out.println("Name: " + books[i].getName());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Publisher: " + books[i].getPublisher());
            System.out.println("Major: " + books[i].getMajor());
            System.out.println("Number of Pages: " + books[i].getNumberOfPages());
        }
    }
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose an option:\n1. Add a book\n2. Dislay list of books\n0. Exit");
            option = scanner.nextInt();
            if (option == 1) {
                bookManagement.addBook();
            }
            if (option == 2) {
                bookManagement.displayList();
            }
        } while (option != 0);
        System.out.println("Thank you!!!!");
    }

}
