package QD.sy1.no3;

public class MiddlePen extends Pen{
    @Override
    public void draw() {
        System.out.println("中笔作画");
        color.bepaint();
    }
}
