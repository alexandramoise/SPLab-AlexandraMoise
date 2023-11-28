package com.example.proiect.entities;

public class Paragraph implements Element{
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public void print() {
        if(this.alignStrategy != null) {
            this.alignStrategy.render(text);
        } else {
            System.out.println(this);
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
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
