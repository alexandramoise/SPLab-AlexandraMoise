package com.example.proiect.entities;

import java.awt.*;

public class ImageProxy  implements Element {
    private String url;
    private Dimension dim;
    private Image realImg;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage() {
        if(realImg == null) {
            realImg = new Image(url);
        }
        return realImg;
    }

    @Override
    public void print() {
        loadImage();
        this.realImg.print();
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
        v.visitImageProxy(this);
    }
}
