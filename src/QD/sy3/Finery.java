package QD.sy3;

public class Finery implements ICharacter {
    protected ICharacter component;

    public Finery(ICharacter component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }
}
