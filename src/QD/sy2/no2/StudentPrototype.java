package QD.sy2.no2;

public class StudentPrototype implements Cloneable {
    private String name;
    private String id;

    public StudentPrototype() {
    }

    public StudentPrototype(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("姓名:" + name + ",学号:" + id);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentPrototype{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("姓名:" + name + "副本,学号:" + id);
        return super.clone();
    }
}
