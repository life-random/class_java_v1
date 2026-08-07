package com.oop12;

public class Book {
    private String title;
    private String author;
    private int totalPage;

    // 생성자
    // 이 생성자는 외부에서 호출불가 private
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int totalPage) {
        this(title, author);
        this.totalPage = totalPage;
    }

    // 메서드
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getTotalPage(){
        return totalPage;
    }

    public void showInfo(){
        System.out.println(">>> 책정보 <<<");
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        if (totalPage != 0)
            System.out.println("총 페이지 수 : " + totalPage);
    }
}
