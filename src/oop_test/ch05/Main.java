package oop_test.ch05;

public class Main {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();
        itemService.obtainItem("단검", "커먼");
        itemService.obtainItem("목걸이", "언커먼");
        itemService.obtainItem("금반지", "레어");

        itemService.printInventory();
    }
}
