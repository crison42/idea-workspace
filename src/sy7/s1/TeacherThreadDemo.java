package sy7.s1;

public class TeacherThreadDemo {
    public static void main(String[] args) {
        Thread teacher1 = new Thread(new TeacherThread("Teacher1"));
        Thread teacher2 = new Thread(new TeacherThread("Teacher2"));
        Thread teacher3 = new Thread(new TeacherThread("Teacher3"));

        teacher1.start();
        teacher2.start();
        teacher3.start();
    }
}