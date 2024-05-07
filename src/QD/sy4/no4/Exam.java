package QD.sy4.no4;

public abstract class Exam {
    protected String name;

    public Exam(String name) {
        this.name = name;
    }

    public void processon() {
        login();
        answer();
        handIn();
    }

    public void login() {
        System.out.println(this.name + "已成功登录，可以开始考试了！");
    }

    public void handIn() {
        System.out.println(this.name + "已成功交卷！");
    }

    public abstract void answer();
}