package com.example.proiect.entities;

public class Paragraph implements Element{
    private String text;
    private Subchapter subchapter;

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
}
