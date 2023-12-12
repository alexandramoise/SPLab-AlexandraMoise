package com.example.proiect.entities;

public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Tabel: " + title;
    }

    public void print() {
        System.out.println(this);
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
        v.visitTable(this);
    }
}
