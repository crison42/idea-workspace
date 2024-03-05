package sy1;

public class PingPangSporter extends Sporter implements English{
    public PingPangSporter(String name, int age) {
        super(name,age);
    }

    public void playPingpang(){
        System.out.println("开心打乒乓球");
    }

    @Override
    void study() {
        System.out.println("乒乓球运动员在学习如何打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

}
