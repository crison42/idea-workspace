package QD.sy4.no2;

public class Student implements Observer {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
