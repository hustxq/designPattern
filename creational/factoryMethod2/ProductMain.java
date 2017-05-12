package creational.factoryMethod2;

import creational.simpleFactory1.Product;

/**
 * Created by xq on 2017/4/23.
 */
public class ProductMain {
    public static void main(String[] args) {
        Product product = new FactoryA().factoryMethod();
        product.common();
        product.diff();

        Class c = null;
        FactoryB factoryA = null;
        try {
            c = Class.forName("creational.factoryMethod2.FactoryB");
            factoryA = (FactoryB) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Product p=factoryA.factoryMethod();
        p.common();
        p.diff();
    }
}
