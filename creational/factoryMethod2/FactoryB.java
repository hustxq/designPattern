package creational.factoryMethod2;

import creational.simpleFactory1.Product;
import creational.simpleFactory1.ProductB;

/**
 * Created by xq on 2017/4/23.
 */
public class FactoryB implements Factory {
    @Override
    public Product factoryMethod() {
        System.out.println("配置B的初始值");
        return new ProductB();
    }
}
