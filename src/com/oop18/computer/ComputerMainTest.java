package com.oop18.computer;

public class ComputerMainTest {
    public static void main(String[] args) {
        Computer deskTop = new DeskTop();
        deskTop.turnOn();
        deskTop.display();
        deskTop.typing();
        deskTop.turnOff();

        Computer noteBook = new MyNoteBook();
        noteBook.turnOn();
        noteBook.display();
        noteBook.typing();
        noteBook.turnOff();
    } // end of main
} // end of class
