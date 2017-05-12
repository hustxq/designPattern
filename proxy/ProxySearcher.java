package proxy;

/**
 * Created by xq on 2017/5/12.
 */
public class ProxySearcher implements Searcher {
    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator validator = new AccessValidator();
    private Logger logger = Logger.getInstance();

    @Override
    public void doSearch(String uid, String keyword) {
        if (validator.validate(uid)){
            realSearcher.doSearch(uid,keyword);
            logger.logger(uid);
        }else {
            System.out.println("用户不合法！");
        }
    }
}
