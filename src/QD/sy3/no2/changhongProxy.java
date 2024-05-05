package QD.sy3.no2;

public class changhongProxy implements SellHouse {
    private HouseOwner houseOwner;

    public changhongProxy(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void sell() {
        System.out.println("----1.获得房主的授权 2.带客户看房 3.和买房人达成成交意向----");
        houseOwner.sell();
        System.out.println("----收取中介费1%----");
    }
}
