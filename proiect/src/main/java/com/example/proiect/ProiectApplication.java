package com.example.proiect;
import com.example.proiect.entities.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProiectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProiectApplication.class, args);
        System.out.println("Hello world!");

        Book b = new Book("Titlul unei carti faine!");
        Author a = new Author("Ionescu Andreea");

        b.addAuthor(a);

        int indexCap1 = b.createChapter("Capitolul 1");
        Chapter c1 = b.getChapter(indexCap1);
        int indexSubcap1 = c1.createSubchapter("Subcapitolul 1.1");
        Subchapter sc1 = c1.getSubchapter(indexSubcap1);

        sc1.createNewParagraph("Paragraf 1");
        sc1.createNewParagraph("Paragraf 2");
        sc1.createNewImage("Imagine 1");
        sc1.createNewParagraph("Paragraf 3");
        sc1.createNewTable("Tabel 1");

        sc1.print();

    }

}
