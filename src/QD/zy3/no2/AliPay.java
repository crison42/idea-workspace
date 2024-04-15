package QD.zy3.no2;

public class AliPay extends Pay {

    public AliPay(PayMode payMode) {
        super(payMode);
    }

    @Override
    public void pay() {
        System.out.println("----支付宝支付----");
        payMode.paymode();
    }
}
