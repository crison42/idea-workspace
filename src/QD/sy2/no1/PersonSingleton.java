package QD.sy2.no1;

public class PersonSingleton {
    private static PersonSingleton ins;
    public String id;
    private String name;

    private PersonSingleton(String name, String id) {
        this.id = id;
        this.name = name;
        System.out.println("姓名是:" + name);
        System.out.println("id是" + id);
    }

    public static PersonSingleton getIns() {
        if (ins == null) {
            System.out.println("----第一次办理身份证----");
            ins = new PersonSingleton("常洪", "1081301");
        } else {
            System.out.println("----重复办理身份证," + ins.id + "----已经被分配了");
        }
        return ins;
    }

    public void setName(String name) {
        this.name = name;
    }
}
