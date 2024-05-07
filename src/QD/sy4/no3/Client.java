package QD.sy4.no3;

public class Client {
    public static void main(String[] args) {
        System.out.println("-----------Java考试------------");
        Exam exam1 = new JavaExam("2213班常洪");
        exam1.processon();
        System.out.println("===============================");
        System.out.println("-----------DesignPattern考试------------");
        Exam exam2 = new DesignPatternExam("2213班常洪");
        exam2.processon();
    }
}