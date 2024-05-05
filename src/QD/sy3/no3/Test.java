package QD.sy3.no3;

public class Test {
    public static void main(String[] args) {
        System.out.println("******房屋中介,代理卖房*****");
        SellHouse houseOwner = new HouseOwner("长安路1号店001");
        SellHouse proxy = new changhongProxy(houseOwner);
        proxy.sell();
        System.out.println("*****交易结束*****");
    }
}
