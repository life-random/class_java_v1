package com.oop12;

import java.util.Scanner;

public class PhoneBook {

    static int lastIndexNumber = 0;

    public static void main(String[] args) {
        Phone[] phone = new Phone[100];
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        phone[0] = new Phone("가", "01011112222");
        phone[1] = new Phone("나", "01011113333");
        phone[2] = new Phone("다", "01011114444");
        phone[3] = new Phone("라", "01011115555");

        lastIndexNumber = 4;

        final String SAVE_NUMBER = "1";
        final String SEARCH_ALL = "2";
        final String UPDATE_NUMBER = "3";
        final String SEARCH_BY_NAME = "4";
        final String DELETE_NUMBER = "5";
        final String END = "0";

        while (flag) {
            System.out.println("** 메뉴 선택 **");
            System.out.println("1.번호저장 2.전체조회 3.번호변경 4.번호검색 5.번호삭제 0.종료");
            String select = sc.nextLine().trim();

            if (SAVE_NUMBER.equals(select)) {
                saveNumber(phone, sc);
            } else if (SEARCH_ALL.equals(select)) {
                searchNumber(phone);
            } else if (UPDATE_NUMBER.equals(select)) {
                updateNumber(sc, phone);
            } else if (SEARCH_BY_NAME.equals(select)) {
                searchByName(sc, phone);
            } else if (DELETE_NUMBER.equals(select)) {
                deleteNumber(sc, phone);
            } else if (END.equals(select)) {
                System.out.println("프로그램을 종료합니다");
                flag = false;
            } else {
                System.out.println("잘못된 입력입니다");
            }
        }

        sc.close();
    }

    private static void deleteNumber(Scanner sc, Phone[] phone) {
        System.out.println(">> 번호삭제");

        if (lastIndexNumber == 0) {
            System.out.println("입력된 번호가 없습니다");
            return;
        }

        System.out.print("삭제를 원하는 번호를 입력해주세요 : ");
        String number = sc.nextLine();
        boolean isFind = false;

        for (int i = 0; i < phone.length; i++) {
            if (phone[i] != null) {
                if (phone[i].getPhoneNumber().equals(number.trim())) {
                    isFind = true;
                    phone[i].showInfo();

                    for (int j = i; j < lastIndexNumber - 1; j++) {
                        phone[j] = phone[j + 1];
                    }
                    phone[--lastIndexNumber] = null;
                    break;
                }
            } else {
                break;
            }
        }
        if (!isFind) {
            System.out.println("찾으시는 번호가 없습니다");
        }
    }

    private static void searchByName(Scanner sc, Phone[] phone) {
        System.out.println(">> 번호검색");

        if (lastIndexNumber == 0) {
            System.out.println("입력된 번호가 없습니다");
            return;
        }

        System.out.print("변경을 원하시는 번호주의 이름을 입력해주세요 : ");
        String targetName = sc.nextLine();
        boolean isFind = false;

        for (int i = 0; i < phone.length; i++) {
            if (phone[i] != null) {
                if (phone[i].getName().equals(targetName.trim())) {
                    isFind = true;
                    System.out.println("찾으시는 번호를 찾았습니다");
                    phone[i].showInfo();
                    break;
                }
            } else {
                break;
            }
        }
        if (!isFind) {
            System.out.println("찾으시는 이름이 없습니다");
        }
    }

    private static void updateNumber(Scanner sc, Phone[] phone) {
        System.out.println(">> 번호변경");

        if (lastIndexNumber == 0) {
            System.out.println("입력된 번호가 없습니다");
            return;
        }

        System.out.print("변경을 원하시는 번호주의 이름을 입력해주세요 : ");
        String targetName = sc.nextLine();
        boolean isFind = false;

        for (int i = 0; i < phone.length; i++) {
            if (phone[i] != null) {
                if (phone[i].getName().equals(targetName.trim())) {
                    isFind = true;
                    phone[i].showInfo();
                    System.out.print("새 번호를 입력해주세요");
                    String number = sc.nextLine();
                    phone[i].setPhoneNumber(number);
                    System.out.println("번호가 변경되었습니다");
                    break;
                }
            } else {
                break;
            }
        }
        if (!isFind) {
            System.out.println("찾으시는 이름이 없습니다");
        }
    }

    private static void searchNumber(Phone[] phone) {
        System.out.println(">> 전체조회");

        if (lastIndexNumber == 0) {
            System.out.println("입력된 번호가 없습니다");
            return;
        }

        for (int i = 0; i < phone.length; i++) {
            if (phone[i] != null) {
                System.out.println(phone[i].getName() + ", " + phone[i].getPhoneNumber());
            } else {
                break;
            }
        }
    }

    private static void saveNumber(Phone[] phone, Scanner sc) {
        System.out.println(">> 번호저장");
        if (phone.length <= lastIndexNumber) {
            System.out.println("전화번호를 저장할 공간이 없습니다");
        }

        System.out.print("저장할 이름을 입력해주세요 :");
        String name = sc.nextLine().trim();
        System.out.print("저장할 전화번호를 입력해주세요(' - '는 제외해주세요) :");
        String number = sc.nextLine();

        phone[lastIndexNumber] = new Phone(name, number);
        lastIndexNumber++;
    }
}
