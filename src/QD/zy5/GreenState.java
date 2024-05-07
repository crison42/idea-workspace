package QD.zy5;

public class GreenState extends AbstractState {
    public GreenState(Student student) {
        super(student);
        stateName = "绿色";
    }

    @Override
    public void checkState() {
        if (student.getAccountPoints() <= 100) {
            student.setState(new BlueState(student));
        }
    }

    public void recommend() {
        System.out.println(student.getStuName() + "同学，恭喜你具有保研资格！");
    }
}
