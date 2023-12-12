package com.example.proiect.entities;

public class BookStatistics implements Visitor {
    private int numberOfParagraphs;
    private int numberOfImages;
    private int numberOfTables;

    public void printStatistics() {
        System.out.println("== Book statistics ==");
        System.out.println("Number of paragraphs: " + numberOfParagraphs);
        System.out.println("Number of images: " + numberOfImages);
        System.out.println("Number of tables: " + numberOfTables);
    }

    @Override
    public void visitImage(Image i) {
        numberOfImages++;
    }

    @Override
    public void visitTable(Table t) {
        numberOfTables++;
    }

    @Override
    public void visitParagraph(Paragraph p) {
        numberOfParagraphs++;
    }
    @Override
    public void visitBook(Book b) {

    }
    @Override
    public void visitSection(Section s) {

    }

    @Override
    public void visitTableOfContents(TableOfContents tc) {

    }

    @Override
    public void visitImageProxy(ImageProxy ip) {

    }


}
