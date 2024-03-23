package QD.sy1.no3;

public class Client {
    public static void main(String[] args) {
    Color color;
    Pen pen;
    color = new Red();
    pen = new MiddlePen();
    pen.setColor(color);
    pen.draw();

    }
}
