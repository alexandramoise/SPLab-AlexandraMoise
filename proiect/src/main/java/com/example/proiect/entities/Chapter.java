package com.example.proiect.entities;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<Subchapter> subchapters;

    private Book book;

    public Chapter(String name) {
        this.name = name;
        this.subchapters = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Capitol: " + name;
    }

    public int createSubchapter(String subchapterTitle) {
        Subchapter subchapter = new Subchapter(subchapterTitle);
        subchapters.add(subchapter);
        return subchapters.size() - 1;
    }

    public Subchapter getSubchapter(int index) throws IndexOutOfBoundsException {
        if(index >= 0 && index < subchapters.size()) {
            return subchapters.get(index);
        } else throw new IndexOutOfBoundsException();
    }
    public void print() {
        System.out.println(this);
    }
}
