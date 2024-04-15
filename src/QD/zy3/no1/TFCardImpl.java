package QD.zy3.no1;

public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String sd = "TFCard read msg:hello world TF";
        return sd;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg:" + msg);
    }
}
