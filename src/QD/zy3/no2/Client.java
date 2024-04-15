package QD.zy3.no2;

public class Client {
    public static void main(String[] args) {
        System.out.println("******1.微信平台密码支付******");
        Pay pay1 = new WechatPay(new PasswordPay());
        pay1.pay();
        System.out.println("====================");
        System.out.println("******2.支付宝平台人脸支付******");
        Pay pay2 = new AliPay(new FacePay());
        pay2.pay();
    }
}
