package oop_test.ch11;

public class WeekdayPricePolicy implements PricePolicy{

    private int discountAmount = 10;

    @Override
    public int calculate(int price) {
        return price * (100 - discountAmount) / 100;
    }
}
