package QD.sy1.no1;

public class SalesMan {
    private final Strategy strategy;
    public SalesMan(Strategy strategy){
        this.strategy=strategy;
    }

    public void salesManShow() {
        strategy.show();
    }
}
