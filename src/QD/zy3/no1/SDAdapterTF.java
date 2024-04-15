package QD.zy3.no1;

public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("----adapter read tf card----");
        return super.readTF();
    }

    @Override
    public void writeSD(String sd) {
        System.out.println("----adapter write tf card----");
        super.writeTF(sd);
    }
}
