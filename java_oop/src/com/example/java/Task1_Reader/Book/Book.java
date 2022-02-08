package com.example.java.Task1_Reader.Book;

public class Book {
    private String bookName;
    private String author;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }
}
