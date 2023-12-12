package com.example.proiect.entities;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(title);
        /*
        for(Element e : elements) {
            e.print();
        }
        */
    }

    @Override
    public void add(Element e) {
        this.elements.add(e);
    }

    @Override
    public void remove(Element e) {
        this.elements.remove(e);
    }

    @Override
    public Element get(int index) {
        if(index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
        for(Element e : elements) {
            e.accept(v);
        }
    }
}
