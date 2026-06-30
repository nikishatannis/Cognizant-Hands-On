package com.library.service;

public class BookService {

    public void displayService() {

        System.out.println("Book Service Created");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}