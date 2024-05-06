package QD.zy5;

public abstract class AbstractState {
    protected Student student;
    protected String stateName;

    public AbstractState(Student student) {
        this.student = student;
    }

    public String getStateName() {
        return stateName;
    }

    public abstract void checkState();

    public void playGame() {
        System.out.println("---开心打游戏，扣除积分20-----");
        int x = student.getAccountPoints() - 20;
        this.student.setAccountPoints(x);
        checkState();
        System.out.println("剩余积分为：" + x + "，当前状态为" + student.getState().getStateName() + "。");
        System.out.println("--------------------------------------");
    }

    public void study() {
        System.out.println("---学习辛苦了，获得20积分-----");
        int x = student.getAccountPoints() + 20;
        this.student.setAccountPoints(x);
        checkState();
        System.out.println("当前积分为：" + x + "，当前状态为" + student.getState().getStateName() + "。");
        System.out.println("--------------------------------------");
    }

    public void recommend() {
        System.out.println("你的积分不够，没有保研资格，加油加油");
    }
}
