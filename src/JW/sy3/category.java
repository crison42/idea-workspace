package JW.sy3;

public class category {
    private String categoryid;
    private String category;
    private String name;
    private String descn;


        public category(String categoryid, String name, String category) {
            this.categoryid = categoryid;
            this.name = name;
            this.category = category;
        }

    public category() {

    }

    public String getcategoryid() {
        return categoryid;
    }
    public void setcategoryid(String categoryid) {
        this.categoryid = categoryid;
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
        return "category [categoryid=" + categoryid + ", category=" + category
                + ", name=" + name + ", descn=" + descn
                + "]";
    }


    public void setPid(String pid) {
    }

    public boolean getCategoryname() {
        return true;
    }
}
