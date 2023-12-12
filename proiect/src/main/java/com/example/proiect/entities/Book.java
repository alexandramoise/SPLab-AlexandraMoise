package com.example.proiect.entities;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }

    public void print() {
        super.print();
        System.out.println("Autori: ");
        for (Author a : authors) {
            a.print();
        }
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element e) {
        super.add(e);
    }

    public void accept(Visitor v) {
        v.visitBook(this);
    }
}
