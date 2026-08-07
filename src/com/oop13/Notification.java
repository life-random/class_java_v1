package com.oop13;

public class Notification {

    //    1. send(String message) : 메시지 내용만 출력합니다. (예: "일반 알림: [내용]")
    public static void send(String message){
        System.out.println(message);
    }

    //    2. send(String message, int count) : 메시지를 입력받은 횟수만큼 반복해서 출력합니다.
    public static void send(String message, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    //    3. send(String receiver, String message) : 받는 사람과 내용을 출력합니다. (예: "[받는사람]님에게 메시지: [내용]")
    public static void send(String receiver, String message){
        System.out.printf("[%s]님에게 메시지: [%s]", receiver, message);
    }
}
