package QD.zy1;

public abstract class Coach extends Person{
    public Coach(String name, int age) {
        super(name,age);
    }

    abstract void teach();
}
