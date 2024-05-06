package QD.zy5;

public class Student {
    private String stuName;
    private int accountPoints;
    private AbstractState state;

    // 构造函数、getter和setter方法
    public Student(String stuName) {
        this.stuName = stuName;
        this.accountPoints = 0;
        this.state = new BlueState(this);
        System.out.println(this.stuName + "你的初始积分是：" + this.accountPoints);
        System.out.println("--------------------------------");
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAccountPoints() {
        return accountPoints;
    }

    public void setAccountPoints(int accountPoints) {
        this.accountPoints = accountPoints;
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void playGame() {
        state.playGame();
    }

    public void study() {
        state.study();
    }

    public void recommend() {
        state.recommend();
    }
}