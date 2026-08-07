package com.oop12;

import com.oop6.Bank;

import java.util.Scanner;

/**
 * 모든 소프트웨어의 기본은 C(Create) R(Read) U(Update) D(Delete) 이다
 * 배열을 활용한 간단한 데이터 관리 시스템
 */
public class MyBookStore {

    //현재 저장된 실제 데이터 갯수를 추적하는 공유 변수(static)
    static int lastIndexNumber = 0;

    public static void main(String[] args) {
        // 준비물
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[100];
        boolean flag = true;

        // 샘플 데이터
        books[0] = new Book("플러터UT실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리딩하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        books[5] = new Book("홍길동전", "허균");

        lastIndexNumber = 5;

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String DELETE_BY_TITLE = "5";
        final String END = "0";

        while (flag) {
            System.out.println("** 메뉴선택 **");
            System.out.print("1.저장 2.전체조회 3.선택조회 4.전체삭제 5. 선택삭제 0.종료 : ");
            String selectedNumber = scanner.nextLine();
            if (SAVE.equals(selectedNumber)) {
                save(books, scanner);
            } else if (SEARCH_ALL.equals(selectedNumber)) {
                readAll(books);
            } else if (SEARCH_BY_TITLE.equals(selectedNumber)) {
                searchByTitle(scanner, books);
            } else if (DELETE_ALL.equals(selectedNumber)) {
                deleteAll(books);
            } else if (DELETE_BY_TITLE.equals(selectedNumber)) {
                deleteByTitle(scanner, books);
            } else if (END.equals(selectedNumber)) {
                System.out.println(">> 프로그램 종료");
                flag = false;
            } else {
                System.out.println("잘못된 입력입니다");
            }
        }

        scanner.close();
    } // end of main

    private static void deleteByTitle(Scanner scanner, Book[] books) {
        System.out.print("삭제할 책의 제목을 입력해주세요 : ");
        String targetTitel = scanner.nextLine();
        boolean isFind = false;

        for (int i = 0; i < books.length; i++) { // 삭제할려는 도서 탐색
            if (books[i] != null) {
                if (books[i].getTitle().equals(targetTitel.trim())){ //삭제할려는 도서가 맞을 시
                    books[i] = null;
                    for (int j = i; j < books.length-1; j++) { // 삭제한 도서 이후 한 칸씩 당기기
                        if (books[j+1] != null){
                            books[j] = books[j+1];
                        } else { // 마지막 책에 도달 후
                            if (books[j] == books[j-1]){ // 마지막 도서를 복사 후 중복 제거
                                books[j] = null;
                            }
                            break;
                        }
                    }
                    System.out.println(targetTitel + "을 삭제했습니다");
                    isFind = true;
                    lastIndexNumber--;
                }
            } else {
                break;
            }
        }
        if (!isFind) {
            System.out.println("삭제할려는 도서가 없습니다");
        }
    }

    // 선택 조회 기능
    private static void searchByTitle(Scanner scanner, Book[] books) {
        System.out.println(">> 선택조회 호출");
        System.out.print("조회할 책 제목을 입력해주세요 : ");
        String targetTitle = scanner.nextLine();

        boolean isFine = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(targetTitle.trim())) {
                    System.out.println("[검색 결과 확인]");
                    books[i].showInfo();
                    isFine = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!isFine) {
            System.out.println("조회된 결과가 없습니다");
        }
    } // end of searchByTitle method

    // 전체 조회 기능(R)
    public static void readAll(Book[] books) {
        System.out.println(">> 전제조회 호출");

        if (lastIndexNumber == 0) {
            System.out.println("저장된 책이 없습니다");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null)
                System.out.println((i + 1) + "번 : " + books[i].getTitle() + ", " + books[i].getAuthor());
        }
    }

    // 저장 기능(C)
    public static void save(Book[] books, Scanner scanner) {
        System.out.println(">> 저장하기 호출");

        if (lastIndexNumber >= books.length) {
            System.out.println("책을 저장할 공간이 없습니다");
            return;
        }

        System.out.print("제목을 입력하세요 : ");
        String title = scanner.nextLine();
        System.out.print("책의 저자를 입력하세요 : ");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        books[lastIndexNumber] = book;
        lastIndexNumber++;
    }

    // 수정 기능(U)
    public static void update() {

    }

    // 전체 삭제 기능 (D)
    public static void deleteAll(Book[] books) {
        System.out.println(">> 전체삭제 호출");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i] = null;
            }
        }
        // 전체 삭제 후 index 초기화
        lastIndexNumber = 0;
    }

    // 도전과제1
    // 선택 삭제 기능


} // end of class
