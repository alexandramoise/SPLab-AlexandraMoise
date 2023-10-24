package com.example.proiect.entities;

public class Image implements Element {
    private String imageName;
    private Subchapter subchapter;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Imagine: " + imageName;
    }

    public void print() {
        System.out.println(this);
    }
}
