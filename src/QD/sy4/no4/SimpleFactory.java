package QD.sy4.no4;

public class SimpleFactory {
    public static Exam newExam(String stuname, String examname) {
        if (examname.equals("Java")) {
            return new JavaExam(stuname);
        } else if (examname.equals("设计模式")) {
            return new DesignPatternExam(stuname);
        } else {
            return null;
        }

    }
}
