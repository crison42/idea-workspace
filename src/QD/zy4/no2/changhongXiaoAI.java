package QD.zy4.no2;

public class changhongXiaoAI {
    private final DesignPattern dp;
    private final Java java;
    private final JavaScript js;

    public changhongXiaoAI() {
        dp = new DesignPattern();
        java = new Java();
        js = new JavaScript();
    }

    public void writeHomework() {
        dp.writeDPHomework();
        js.writeJSHomework();
        java.writeJavaHomework();
    }

    public void submitHomework() {
        dp.submitDPHomework();
        js.submitJSHomework();
        java.submitJavaHomework();

    }
}