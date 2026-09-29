package oop_test.ch11;

public class weekendPricePolicy implements PricePolicy{
    private int extraPercent = 20;

    public int calculate(int price) {
        return price * (100 + extraPercent) / 100;
    }
}
