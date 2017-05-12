package creational.simpleFactory1;

/**
 * Created by xq on 2017/4/23.
 */
public class ProductFactory {
    public static Product product(String s){
        Product product = null;
        if (s.equalsIgnoreCase("A")){
            product = new ProductA();
        }else if (s.equalsIgnoreCase("B")){
            product = new ProductB();
        }
        return product;
    }
}
