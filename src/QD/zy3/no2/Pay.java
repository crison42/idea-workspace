package QD.zy3.no2;

public abstract class Pay {
    protected PayMode payMode;

    public Pay(PayMode payMode) {
        this.payMode = payMode;
    }

    public abstract void pay();
}
