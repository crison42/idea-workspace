package JW.sy6;

public class Brand {
    private final int id;
    private final String brandName;
    private final String companyName;
    private final double capital;
    private final String slogan;
    private final int type;

    public Brand(int id, String brandName, String companyName, double capital, String slogan, int type) {
        this.id = id;
        this.brandName = brandName;
        this.companyName = companyName;
        this.capital = capital;
        this.slogan = slogan;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getCapital() {
        return capital;
    }

    public String getSlogan() {
        return slogan;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", capital=" + capital +
                ", slogan='" + slogan + '\'' +
                ", type=" + type +
                '}';
    }
}