package QD.zy3.no3;

import QD.zy3.no1.TFCard;

public class SDAdapterTF implements SDCard {
    private final TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("----adapter read tf card----");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String sd) {
        System.out.println("----adapter write tf card----");
        tfCard.writeTF(sd);
    }
}
