package oop_test.ch11;

public class Main {
    public static void main(String[] args) {
        PricePolicy policy = new WeekdayPricePolicy();
//        PricePolicy policy = new weekendPricePolicy();

        TicketService service = new TicketService(policy);

        service.reserve("타잔", 10000);
        service.reserve("박물관이 살아있다", 15000);

    }
}
