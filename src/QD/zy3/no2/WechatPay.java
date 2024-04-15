package QD.zy3.no2;

public class WechatPay extends Pay {
    public WechatPay(PayMode payMode) {
        super(payMode);
    }

    @Override
    public void pay() {
        System.out.println("----微信支付----");
        payMode.paymode();
    }
}
