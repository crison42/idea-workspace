package sy7.s1;

public class TeacherThreadDemo {
    public static void main(String[] args) {
        Thread teacher1 = new Thread(new TeacherThread("李老师"));
        Thread teacher2 = new Thread(new TeacherThread("刘老师"));
        Thread teacher3 = new Thread(new TeacherThread("叶老师"));

        teacher1.start();
        teacher2.start();
        teacher3.start();
    }
}