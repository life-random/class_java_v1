package com.oop15.people;

public class Pencil extends Tool {
    public Pencil() {
        super("연필");
    }

    @Override
    public void use() {
        System.out.println(name + "으로 글을 씁니다");
    }
}
