package JW.sy3;

public class Product {
    private String productid;
    private String category;
    private String name;
    private String descn;
    public String getProductid() {
        return productid;
    }
    public void setProductid(String productid) {
        this.productid = productid;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescn() {
        return descn;
    }
    public void setDescn(String descn) {
        this.descn = descn;
    }
    @Override
    public String toString() {
        return "Product [productid=" + productid + ", category=" + category
                + ", name=" + name + ", descn=" + descn
                + "]";
    }


    public void setPid(String pid) {
    }

}
