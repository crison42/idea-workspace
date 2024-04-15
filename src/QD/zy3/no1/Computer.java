package QD.zy3.no1;

public class Computer {
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SDCard is null");
        }
        return sdCard.readSD();
    }
}
