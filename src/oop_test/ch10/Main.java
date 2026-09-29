package oop_test.ch10;

public class Main {
    public static void main(String[] args) {
//        DiscountPolicy discountPolicy = new FixDiscountPolicy();
        DiscountPolicy discountPolicy = new RateDiscountPolicy();
        OrderDao orderDao = new MemoryOrderDao();
//        OrderDao orderDao = new LogOrderDao();

        OrderService service = new OrderService(discountPolicy, orderDao);
        service.takeOrder("아메리카노", 4500);
        service.takeOrder("카페라떼", 5000);
        service.takeOrder("바닐라라떼", 5500);

        service.printAllOrders();
    }
}
