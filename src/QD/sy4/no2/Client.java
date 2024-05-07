package QD.sy4.no2;

public class Client {
    public static void main(String[] args) {
        Subject teacher = new Teacher();
        teacher.attach(new Student("2213班常洪"));
        teacher.attach(new Student("2213班张三"));
        teacher.attach(new Student("2213班李四"));
        teacher.notify("老师发布了新作业，要做作业了，加油！加油！");
    }
}
