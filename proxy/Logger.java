package proxy;

import java.util.Hashtable;

/**
 * Created by xq on 2017/5/12.
 */
public class Logger {
    private Hashtable<String, Integer> hashtable = new Hashtable();
    private static Logger logger = new Logger();

    private Logger(){}

    public static Logger getInstance(){
        return logger;
    }
    public void logger(String uid){
        if (!hashtable.containsKey(uid)){
            hashtable.put(uid,0);
        }
        int count = hashtable.get(uid);
        System.out.println(String.format("%s,查询次数加1, 总次数为:%d",uid , ++count));
        hashtable.put(uid, count);
    }
}
