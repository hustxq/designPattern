package templateMethod;

/**
 * Created by xq on 2017/5/12.
 */
public class Client {
    public static void main(String[] args) {
        Account account = new SavingAccount();
        account.handle("xq","123");
    }
}
