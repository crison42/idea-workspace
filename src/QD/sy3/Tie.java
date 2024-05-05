package QD.sy3;

public class Tie extends Finery {
    public Tie(ICharacter component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("系上领带，酷毙了！");
    }
}
