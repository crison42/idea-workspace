package QD.sy4.no4;

public class DesignPatternExam extends Exam {
    public DesignPatternExam(String name) {
        super(name);
    }

    @Override
    public void answer() {
        System.out.println(this.name + "现在进入设计模式考试，请认真完成设计模式试卷！");
    }
}
