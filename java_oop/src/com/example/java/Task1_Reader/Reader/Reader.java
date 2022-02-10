package com.example.java.Task1_Reader.Reader;


import com.example.java.Task1_Reader.Book.Book;

public class Reader {
    private String fio;
    private int numbOfTicket;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fio, int numbOfTicket, String faculty, String birthDate, String phone) {
        this.fio = fio;
        this.numbOfTicket = numbOfTicket;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }
//    public Reader (String fio){
//        this.fio = fio;
//    }

    public void setFio(String fio) {
        this.fio = fio;
    }
    public String getFio(){
        return fio;
    }
    public void setNumbOfTicket(int numbOfTicket) {
        this.numbOfTicket = numbOfTicket;
    }
    public int getNumbOfTicket(){
        return numbOfTicket;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getFaculty(){
        return faculty;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }

    // получение книг
    public void takeBook (int quantity){
        System.out.println(fio+" взял(а) книг: "+quantity+" шт.");
    }
    public void takeBook (String[] books){
        System.out.print(fio+" взял(а) книги: ");
        for (int i = 0; i<books.length; i++ ){
            if (i == books.length-1){
                System.out.println(books[i]+".");
            }
            else {
                System.out.print(books[i] + ", ");
            }
        }
    }
    public void takeBook (Book[] books){
        System.out.print(fio+" взял(а) книги: ");
        for (int i = 0; i<books.length; i++ ) {
            if (i == books.length - 1) {
                if (books[i].getAuthor() != null) {
                    System.out.println(books[i].getBookName()+" - "+books[i].getAuthor()+".");
                }
                else {
                    System.out.println(books[i].getBookName() + ".");
                }
            } else {
                if (books[i].getAuthor() != null) {
                    System.out.print(books[i].getBookName()+" - "+books[i].getAuthor() + ", ");
                }
                else {
                    System.out.print(books[i].getBookName() + ", ");
                }
            }
        }
    }

    // возврат книг
    public void returnBook (int quantity){
        System.out.println(fio+" вернул(а) книг: "+quantity+" шт.");
    }

    public void returnBook (String[] books){
        System.out.print(fio+" вернул(а) книги: ");
        for (int i = 0; i<books.length; i++ ){
            if (i == books.length-1){
                System.out.println(books[i]+".");
            }
            else {
                System.out.print(books[i] + ", ");
            }
        }
    }

    public void returnBook (Book[] books){
        System.out.print(fio+" вернул(а) книги: ");
        for (int i = 0; i<books.length; i++ ) {
            if (i == books.length - 1) {
                if (books[i].getAuthor() != null) {
                    System.out.println(books[i].getBookName()+" - "+books[i].getAuthor() + ".");
                }
                else {
                    System.out.println(books[i].getBookName() + ".");
                }
            } else {
                if (books[i].getAuthor() != null) {
                    System.out.print(books[i].getBookName()+" - "+books[i].getAuthor()+ ", ");
                }
                else {
                    System.out.print(books[i].getBookName() + ", ");
                }
            }
        }
    }
}

