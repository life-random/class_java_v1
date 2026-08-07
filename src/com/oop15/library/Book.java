package com.oop15.library;

public class Book {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void display(){
        System.out.println("책 제목 : " + title);
    }
}
