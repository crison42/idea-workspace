package QD.sy3;

public class Suit extends Finery {
    public Suit(ICharacter component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("套上西装，帅呆了！");
    }
}
