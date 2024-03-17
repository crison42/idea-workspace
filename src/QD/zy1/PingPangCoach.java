package QD.zy1;

public class PingPangCoach extends Coach implements English {

    public PingPangCoach(String name, int age) {
        super(name,age);
    }

    @Override
    void teach() {
        System.out.println("乒乓球教练正在教如何打乒乓球");
    }

    @Override
    public void speakEnglish() {

    }
}
