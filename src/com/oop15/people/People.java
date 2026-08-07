package com.oop15.people;

public class People {

    private Tool leftHand;
    private Tool rightHand;


    public void holdLeftHand(Tool tool) {
        if (leftHand != null) {
            System.out.println("왼손에 이미 " + leftHand.toString() + "를 쥐고 있습니다");
        } else {
            System.out.println(tool.toString() + "를 왼손에 쥐었습니다");
            leftHand = tool;
        }
    }

    public void holdRightHand(Tool tool) {
        if (rightHand != null) {
            System.out.println("오른손에 이미 " + rightHand.toString() + "를 쥐고 있습니다");
        } else {
            System.out.println(tool.toString() + "를 오른손에 쥐었습니다");
            rightHand = tool;
        }
    }

    public void dropLeftHand() {
        if (leftHand != null) {
            System.out.println(leftHand.toString() + "를 왼손에서 놓았습니다");
            leftHand = null;
        } else {
            System.out.println("왼손에 쥐고 있는게 없습니다");
        }
    }

    public void dropRightHand() {
        if (rightHand != null) {
            System.out.println(rightHand.toString() + "를 오른손에서 놓았습니다");
            rightHand = null;
        } else {
            System.out.println("오른손에 쥐고 있는게 없습니다");
        }
    }

    public void useLeftHand() {
        if (leftHand != null) {
            leftHand.use();
        } else {
            System.out.println("왼손에 쥐고 있는 게 없습니다");

        }
    }

    public void useRightHand() {
        if (rightHand != null) {
            rightHand.use();
        } else {
            System.out.println("오른손에 쥐고 있는 게 없습니다");
        }
    }
}
