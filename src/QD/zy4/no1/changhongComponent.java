package QD.zy4.no1;

public abstract class changhongComponent {
    protected String name;
    protected int level;

    public changhongComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public abstract void print();
}
