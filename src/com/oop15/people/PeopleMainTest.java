package com.oop15.people;

public class PeopleMainTest {
    public static void main(String[] args) {
        People people = new People();
        Tool pencil = new Pencil();
        Tool erager = new Erager();


        people.useLeftHand();
        people.useRightHand();
        people.dropLeftHand();
        people.dropRightHand();
        people.holdLeftHand(pencil);
        people.holdRightHand(erager);
        people.holdLeftHand(pencil);
        people.holdRightHand(erager);
        people.useLeftHand();
        people.useRightHand();
        people.dropLeftHand();
        people.dropRightHand();
    }
}
