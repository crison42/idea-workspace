package QD.zy3.no3;

public class Computer {
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SDCard is null");
        }
        return sdCard.readSD();
    }
}
