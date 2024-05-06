package QD.sy4.no1;

public class Teacher {
    private Command Command1, Command2;

    public Teacher(Command Command1, Command Command2) {
        this.Command1 = Command1;
        this.Command2 = Command2;
    }

    public void task1() {
        System.out.println("-------辅导员的任务1------");
        System.out.println("找学生参加学科专业竞赛");
        Command1.execute();
    }

    public void task2() {
        System.out.println("-------辅导员的任务2------");
        System.out.println("找学生参加体育竞赛");
        Command2.execute();
    }
}
