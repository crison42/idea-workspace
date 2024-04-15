package QD.zy3.no3;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String sd = "SDCard read msg:hello world SD";
        return sd;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg:" + msg);
    }
}
