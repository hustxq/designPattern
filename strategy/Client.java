package strategy;

/**
 * Created by xq on 2017/5/12.
 */
public class Client {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(100);
        Discount<Double> discount = new StudentDiscount();
        ticket.setDiscount(discount);
        System.out.println(ticket.getPrice());

        discount = new VipDiscount();
        ticket.setDiscount(discount);
        System.out.println(ticket.getPrice());
    }
}
