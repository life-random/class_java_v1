package com.oop15.people;

public class Erager extends Tool {
    public Erager() {
        super("지우개");
    }

    @Override
    public void use() {
        System.out.println(name + "으로 써진 글을 지웁니다");
    }
}
