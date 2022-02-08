package com.example.java.Task1_Reader.run;

import com.example.java.Task1_Reader.Book.Book;
import com.example.java.Task1_Reader.Reader.Reader;

public class run {
    public static void main(String[] args) {
        Reader[] readers = new Reader[]{new Reader("Карден И.В", 1111, "Chemical faculty", "11.01.2001", "093-000-00-00" ), new Reader("Петров В.В", 3333, "Faculty of arts", "22.10.1990", "066-000-00-00")};
        System.out.println(readers[0].getFio()+", "+readers[0].getBirthDate()+", "+readers[0].getFaculty()+", № "+ readers[0].getNumbOfTicket()+", "+ readers[0].getPhone());
        readers[0].takeBook(4);
        readers[0].takeBook(new String[]{"Мастер и Маргарита", "Энциклопедия Вокруг Света", "Социальная Психология", "Основы Java"});
        System.out.println("-----------------------------------------------");
        System.out.println(readers[1].getFio()+", "+readers[1].getBirthDate()+", "+readers[1].getFaculty()+", № "+ readers[1].getNumbOfTicket()+", "+ readers[1].getPhone());
        readers[1].takeBook(2);
        readers[1].takeBook(new String[]{"Война и Мир", "Основы Python"});
        System.out.println("-----------------------------------------------");
        Reader readerIvanova = new Reader("Иванова А.А", 1111, "Engineering faculty", "12.02.2002", "099-000-00-00");
        System.out.println(readerIvanova.getFio()+", "+readerIvanova.getBirthDate()+", "+readerIvanova.getFaculty()+", № "+ readerIvanova.getNumbOfTicket()+", "+ readerIvanova.getPhone());
        readerIvanova.takeBook(3);
        readerIvanova.takeBook(new Book[]{new Book("Приключения Тома Соейра"), new Book("Преступление и наказание"), new Book("12 правил жизни", "Джордан Питерсон")});
        System.out.println("-------------------returns books----------------------------");
        readers[0].returnBook(2);
        readers[0].returnBook(new String[]{"Энциклопедия Вокруг Света", "Мастер и Маргарита"});
        readers[1].returnBook(1);
        readers[1].returnBook(new String[]{"Война и Мир"});
        readerIvanova.returnBook(2);
        readerIvanova.returnBook(new Book[]{new Book("Приключения Тома Соейра", "Марк Твен"), new Book("Преступление и наказание", "Федор Достаевский")});

    }
}
