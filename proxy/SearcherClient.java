package proxy;

/**
 * Created by xq on 2017/5/12.
 */
public class SearcherClient {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        searcher.doSearch("xq","test");
        searcher.doSearch("xq","2");
        searcher.doSearch("ty","1");
    }
}
