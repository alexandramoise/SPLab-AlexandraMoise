package com.example.proiect.entities;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println(text + " # #");
    }
}
