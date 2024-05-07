package QD.sy4.no3;

public class JavaExam extends Exam {
    public JavaExam(String name) {
        super(name);
    }

    @Override
    public void answer() {
        System.out.println(this.name + "现在进入Java考试，请认真完成Java试卷！");
    }
}
