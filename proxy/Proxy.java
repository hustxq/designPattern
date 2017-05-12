package proxy;

/**
 * Created by xq on 2017/5/12.
 * 代理人
 */
public class Proxy extends Subject {
    private RealSubject realSubject = new RealSubject();

    public void preRequest(){
        System.out.println("代理洽谈");
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void postRequest(){
        System.out.println("代理结束");
    }
}
