package proxy;

/**
 * Created by xq on 2017/5/12.
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
//        业务具体实现代码
        System.out.println("业务真实处理人");
    }
}
