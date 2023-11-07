package com.example.proiect.entities;

public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Paragraf: " + text;
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
}
