package creational.factoryMethod2;

import creational.simpleFactory1.Product;
import creational.simpleFactory1.ProductA;

/**
 * Created by xq on 2017/4/23.
 */
public class FactoryA implements Factory {
    @Override
    public Product factoryMethod() {
        System.out.println("配置A的初始值");
        return new ProductA();
    }
}
