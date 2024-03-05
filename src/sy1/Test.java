package sy1;

public class Test {
    /**
     * Person抽象类 属性为 姓名和年龄
     * Coach (教练) 抽象类 继承了人 抽象方法 teach
     * BasketballCoach 继承Cooch
     * English 接口 方法为 speakEnglish
     * PingPangCoach 继承Coach 并且还会说英语
     * Sporter 抽象类 继承了人 抽象方法 study
     * BasketballSporter 继承Sporter 并且具有自己的方法 playBasketball
     * PingPangSporter 继承Sporter 并且具有自己的方法playPingpang 并且还会说英语
     **/
    public static void main(String[] args) {
//创建运动员或教练的对象
        sy1.PingPangSporter pps = new PingPangSporter("邓亚萍", 23);
        sy1.BasketballSporter bbs = new BasketballSporter("姚明", 33);
        System.out.println(pps.getName() + "," + pps.getAge());
        System.out.println(bbs.getName() + "," + bbs.getAge());
        pps.study();
        pps.speakEnglish();
        pps.playPingpang();
        bbs.playBasketball();
        bbs.study();
        sy1.Coach coach1 = new PingPangCoach("张三", 40);
        Coach coach2 = new BasketballCoach("李四", 50);
        coach1.teach();
        coach2.teach();
    }
}