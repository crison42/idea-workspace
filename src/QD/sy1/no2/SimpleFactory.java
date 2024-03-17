package QD.sy1.no2;

public class SimpleFactory {
    public static Strategy newStrategy(String name) {
        if (name.equals("春节")) {
            return new StrategyA();
        } else if (name.equals("中秋节")) {
            return new StrategyB();
        } else if (name.equals("端午节")) {
            return new StrategyC();
        }
        return null;
    }
}
