package com.example.proiect.entities;

public class TableOfContents implements Element {
    public void print() {
        System.out.println("Table of contents");
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitTableOfContents(this);
    }
}
