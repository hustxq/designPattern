package creational.simpleFactory1;

/**
 * Created by xq on 2017/4/23.
 */
public abstract class Product {
    public void common(){
        System.out.println("公共方法");
    }

    public abstract void diff();
}
