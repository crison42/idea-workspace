package QD.sy1.no3;

public abstract class Pen {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void draw();
}
