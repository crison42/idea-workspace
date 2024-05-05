package QD.sy3.no3;

public class HouseOwner implements SellHouse {
    private String houseName;

    public HouseOwner(String houseName) {
        this.houseName = houseName;
    }

    @Override
    public void sell() {
        System.out.println("出售房屋" + houseName);
    }
}
