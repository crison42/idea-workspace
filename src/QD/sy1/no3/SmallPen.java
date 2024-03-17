package QD.sy1.no3;

public class SmallPen extends Pen{
    @Override
    public void draw() {
        System.out.println("细笔作画");
        color.bepaint();
    }
}
