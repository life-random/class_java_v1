package com.oop12;

public class BookTest {
    public static void main(String[] args) {

        Book[] books = new Book[10]; // [][][][][][][][][][]
        books[0] = new Book("플러터UT실전", "김근호", 300);
        books[1] = new Book("무궁화꽃이피었습니다", "김진명", 500);
        books[2] = new Book("흐르는강물처럼", "파울로코엘료", 300);
        books[3] = new Book("리딩으로리딩하라", "이지성", 450);
        books[4] = new Book("사피엔스", "유발하라리", 850);
//        books[5] = new Book("플러터UT실전", "김근호", 300);
//        books[6] = new Book("플러터UT실전", "김근호", 300);
//        books[7] = new Book("플러터UT실전", "김근호", 300);
//        books[8] = new Book("플러터UT실전", "김근호", 300);
        books[9] = new Book("홍길동전", "허균", 350);

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }

    } // end of main
} // end of class

// NullPointerException <-- 객첼, 생성하지 않았거나 가리키는 주소가 없을 때 오류가 발생한다.