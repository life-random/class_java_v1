package com.oop13;

public class NotificationTest {

    public static void main(String[] args) {
        Notification.send("hello, java");
        System.out.println("------------------------");
        Notification.send("hello, java", 3);
        System.out.println("------------------------");
        Notification.send("홍길동", "hello, java");
    }
}
