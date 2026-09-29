package oop_test.ch11;

public class TicketService {
    private PricePolicy pricePolicy;

    public TicketService(PricePolicy pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

    public void reserve(String movieTitle, int price){
        Ticket ticket = new Ticket(movieTitle, pricePolicy.calculate(price));
        System.out.println("|예약|"+ticket.getMovieTitle()+"|"+ticket.getPrice()+"원");
    }
}
