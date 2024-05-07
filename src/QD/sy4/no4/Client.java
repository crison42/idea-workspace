package QD.sy4.no4;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String studentName;
        String examname;
        Exam exam;
        while (true) {
            System.out.println("----------请输入参加考试学生姓名：-------------");
            Scanner sc1 = new Scanner(System.in);
            studentName = sc1.nextLine();
            System.out.println("----------请输入考试科目的名称：Java或设计模式-------------");
            Scanner sc2 = new Scanner(System.in);
            examname = sc2.nextLine();
            exam = SimpleFactory.newExam(studentName, examname);
            if (exam != null) {
                exam.processon();
                return;
            } else {
                System.out.println("输入无效，请重试");
            }
        }
    }
}