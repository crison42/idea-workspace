package QD.zy5;

public class BlueState extends AbstractState {
    public BlueState(Student student) {
        super(student);
        stateName = "蓝色";
    }

    @Override
    public void checkState() {
        if (student.getAccountPoints() > 100) {
            student.setState(new GreenState(student));
        }
        if (student.getAccountPoints() < 0) {
            student.setState(new YellowState(student));
        }
    }
}
