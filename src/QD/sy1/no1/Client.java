package QD.sy1.no1;

public class Client {
    public static void main(String[] args) {
        Strategy strategy;
        SalesMan salesMan;
        strategy = new StrategyB();
        salesMan = new SalesMan(strategy);
        salesMan.salesManShow();
    }
}
