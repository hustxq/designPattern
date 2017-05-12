package proxy;

/**
 * Created by xq on 2017/5/12.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
