public class Programm {
    public static void doWork() {
        IFilter chain = createFilterChain();
        startCheck(chain);
    }

    public static IFilter createFilterChain() {
        IFilter chainAuth = new FilterAuthorization();
        IFilter chainBody = new FilterBody();
        IFilter chainRole = new FilterRole();
        chainAuth.setNext(chainBody);
        chainBody.setNext(chainRole);
        return chainAuth;
    }

    public static boolean startCheck(IFilter filter) {
        return filter.checkRequest();
    }
}
