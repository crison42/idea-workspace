package sy1;

public  class BasketballSporter extends Sporter{
    public BasketballSporter(String name, int age) {
        super(name,age);
    }

    public void playBasketball() {
        System.out.println("开心打篮球！！");
    }

    @Override
    void study() {
        System.out.println("篮球运动员在学习如何打篮球");
    }


}
