package QD.sy3.no1;

public class TShirts extends Finery {
    public TShirts(ICharacter character) {
        super(character);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("穿上衬衫，好精神！");
    }
}
