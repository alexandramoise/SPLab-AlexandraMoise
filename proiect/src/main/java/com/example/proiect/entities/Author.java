package com.example.proiect.entities;


public class Author {
    private String name;
    private Book book;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Autor: " + name;
    }

    public void print() {
        System.out.println(this);
    }
}
