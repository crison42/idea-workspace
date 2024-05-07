package QD.zy5;

public class YellowState extends AbstractState {
    public YellowState(Student student) {
        super(student);
        stateName = "黄色";
    }

    @Override
    public void checkState() {
        if (student.getAccountPoints() >= 0) {
            student.setState(new BlueState(student));
        }
    }

    @Override
    public void playGame() {
        System.out.println(student.getStuName() + "同学，你的积分太低，再玩游戏就要荒废学业了，玩游戏的资格被取消了");
    }
}
