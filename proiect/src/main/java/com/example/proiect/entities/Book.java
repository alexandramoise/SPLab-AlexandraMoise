package com.example.proiect.entities;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private TableOfContents tableOfContents;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Carte: " + title;
    }

    public void print() {
        System.out.println(this);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String chapterTitle) {
        Chapter chapter = new Chapter(chapterTitle);
        chapters.add(chapter);
        return chapters.size() - 1;
    }

    public Chapter getChapter(int index) throws IndexOutOfBoundsException {
        if(index >= 0 && index < chapters.size()) {
            return chapters.get(index);
        } else throw new IndexOutOfBoundsException();
    }
}
