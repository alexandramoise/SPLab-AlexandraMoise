package com.example.proiect;

import com.example.proiect.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProiectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProiectApplication.class, args);

          Section cap1 = new Section("Capitolul 1");
          Paragraph p1 = new Paragraph("Paragraf 1");
          cap1.add(p1);
          Paragraph p2 = new Paragraph("Paragraf 2");
          cap1.add(p2);
          Paragraph p3 = new Paragraph("Paragraf 3");
          cap1.add(p3);
          Paragraph p4 = new Paragraph("Paragraf 4");
          cap1.add(p4);
          Image img = new Image("Imagine 1");
          cap1.add(img);
          Image img2 = new Image("Imagine 2");
          cap1.add(img2);

        RenderContentVisitor rcv = new RenderContentVisitor();
        cap1.accept(rcv);

        BookStatistics bs = new BookStatistics();
        cap1.accept(bs);
        bs.printStatistics();

          /*
          System.out.println(" ===== Printing WITHOUT alignment: " );
          cap1.print();

          p1.setAlignStrategy(new AlignCenter());
          p2.setAlignStrategy(new AlignRight());
          p3.setAlignStrategy(new AlignLeft());

         System.out.println(" ===== Printing WITH alignment: ");
         */


//        Book noapteBuna = new Book("Noapte buna, copii!");
//        Author rpGheo = new Author("Radu Pavel Gheo");
//        noapteBuna.addAuthor(rpGheo);
//
//        Section cap1 = new Section("Capitolul 1");
//        Section cap11 = new Section("Capitolul 1.1");
//        Section cap111 = new Section("Capitolul 1.1.1");
//        Section cap1111 = new Section("Capitolul 1.1.1.1");
//
//        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
//        noapteBuna.addContent(cap1);
//        cap1.add(new Paragraph("Moto capitol"));
//        cap1.add(cap11);
//        cap11.add(new Paragraph("Text from subchapter 1.1"));
//        cap11.add(cap111);
//        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
//        cap111.add(cap1111);
//        cap1111.add(new Image("Image from subchapter 1.1.1.1"));
//
//        noapteBuna.print();

//        Lab 4
//        long startTime = System.currentTimeMillis();
//        ImageProxy img1 = new ImageProxy("Pamela Anderson");
//        ImageProxy img2 = new ImageProxy("Kim Kardashian");
//        ImageProxy img3 = new ImageProxy("Kirby Griffin");
//        Section playboyS1 = new Section("Front Cover");
//        playboyS1.add(img1);
//        Section playboyS2 = new Section("Summer Girls");
//        playboyS2.add(img2);
//        playboyS2.add(img3);
//        Book playboy = new Book("Playboy");
//        playboy.addContent(playboyS1);
//        playboy.addContent(playboyS2);
//        long endTime = System.currentTimeMillis();
//        System.out.println("Creation of the content took: " + (endTime - startTime) + " milliseconds");
//
//        startTime = System.currentTimeMillis();
//        playboyS1.print();
//        endTime = System.currentTimeMillis();
//        System.out.println("Printing of the section 1 took: " + (endTime - startTime) + " milliseconds");
//
//        startTime = System.currentTimeMillis();
//        playboyS1.print();
//        endTime = System.currentTimeMillis();
//        System.out.println("Printing again of the section 1 took: " + (endTime - startTime) + " milliseconds");
    }
}
