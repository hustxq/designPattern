package proxy;

/**
 * Created by xq on 2017/5/12.
 */
public class RealSearcher implements Searcher {
    @Override
    public void doSearch(String uid, String keyword) {
        System.out.println(String.format("帮%s查询了关键词%s", uid, keyword));
    }
}
