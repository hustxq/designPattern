package strategy;

/**
 * Created by xq on 2017/5/12.
 */
public class MovieTicket {
    private double price;
    private Discount<Double> discount;

    public void setDiscount(Discount<Double> discount){
        this.discount = discount;
    }

    public double getPrice() {
        return discount.calc(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
