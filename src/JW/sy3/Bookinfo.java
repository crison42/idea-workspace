package JW.sy3;

public class Bookinfo {
    String bookid;
    String bookname;
    int bookstate;
    String lenddate;
    int count;
    public String getBookid() {
        return bookid;
    }
    public String getBookname() {
        return bookname;
    }
    public int getBookstate() {
        return bookstate;
    }
    public String getLenddate() {
        return lenddate;
    }
    public int getCount() {
        return count;
    }
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public void setBookstate(int bookstate) {
        this.bookstate = bookstate;
    }
    public void setLenddate(String lenddate) {
        this.lenddate = lenddate;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public Bookinfo(String bookid, String bookname, int count) {
        super();
        this.bookid = bookid;
        this.bookname = bookname;
        this.count = count;
    }
}
