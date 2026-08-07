package com.oop18.computer;

public abstract class NoteBook extends DeskTop{
    public abstract void display();

    public void typing(){
        System.out.println("노트북 키보드를 통해 타자를 칩니다");
    }
}
