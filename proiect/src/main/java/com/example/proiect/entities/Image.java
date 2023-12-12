package com.example.proiect.entities;

import static java.lang.Thread.sleep;

public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
        try {
            // n a vrut cu TimeUnit.SECONDS.sleep(5)
            sleep(5000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Imagine: " + url;
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
        v.visitImage(this);
    }
}
