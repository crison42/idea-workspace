package QD.sy4.no1;

public class Client {
    public static void main(String[] args) {
        Command Command1, Command2;
        Command1 = new academicCommand();
        Command2 = new sportCommand();
        Teacher Teacher = new Teacher(Command1, Command2);
        Teacher.task1();
        Teacher.task2();
    }
}
