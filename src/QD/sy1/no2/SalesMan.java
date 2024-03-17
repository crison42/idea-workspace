package QD.sy1.no2;

public class SalesMan {
    private Strategy strategy;
    public SalesMan(Strategy strategy){
        this.strategy=strategy;
    }

    public void salesManShow() {
        strategy.show();
    }
}
