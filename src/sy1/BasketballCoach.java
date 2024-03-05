package sy1;

public class BasketballCoach extends Coach{

    public BasketballCoach(String name, int age) {
        super(name,age);
    }

    @Override
    void teach() {
        System.out.println("篮球教练正在教如何打篮球");
    }

}
