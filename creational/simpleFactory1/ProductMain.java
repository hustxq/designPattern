package creational.simpleFactory1;

/**
 * Created by xq on 2017/4/23.
 * 简单工厂是类创建型
 */
public class ProductMain {
    public static void main(String[] args) {
        Product product = ProductFactory.product("a");
        product.common();
        product.diff();
    }
}
