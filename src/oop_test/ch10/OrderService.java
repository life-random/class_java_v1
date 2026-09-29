package oop_test.ch10;

import java.util.List;

// 비지니스 로직 객체 (주입 대상)
public class OrderService {
    // 인터페이스로 참여
    private DiscountPolicy discountPolicy;
    private OrderDao dao;

    public OrderService(DiscountPolicy discountPolicy, OrderDao dao) {
        this.discountPolicy = discountPolicy;
        this.dao = dao;
    }

    public void takeOrder(String menuName, int price) {
        int discountAmount = discountPolicy.discount(price);
        int finalPrice = price - discountAmount;
        Order newOrder = new Order(menuName, finalPrice);
        dao.insert(newOrder);
//        System.out.println(newOrder.getMenuName() + " | 정가 : " +
//                newOrder.getPrice() + " 원 | 할인 : " + discountAmount + " 원 | 결제 금액 : " + finalPrice + " 원");
    }

    public void printAllOrders() {
        List<Order> orders = dao.findAll();
        System.out.println("--- 전체 주문 내역 (할인적용가) ---");
        for (Order order : orders) {
            System.out.println("메뉴: " + order.getMenuName() + " | 가격: " + order.getPrice() + "원");
        }
    }
}
