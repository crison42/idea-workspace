package JW.sy2;

import java.util.List;

public class ProductDaoImp extends DataBase implements ProductDao {
    @Override
    public int add(Product entity) {
        String sql="insert into product values(?,?,?,?)";
        return this.executeUpdate(sql,
                entity.getProductid(),entity.getCategory()
                ,entity.getName(),entity.getDescn());
    }
    @Override
    public int update(Product entity) {
        String sql="update product set category=?,name=?,descn=? where productid=?";
        return this.executeUpdate(sql,entity.getCategory()
                ,entity.getName(),entity.getDescn(),
                entity.getProductid());
    }
    @Override
    public int delete(String pid) {
        String sql="delete from product where productid=?";
        return this.executeUpdate(sql, pid);
    }
    @Override
    public List<Product> findByCatid(String catid) {
        String sql="select * from product where category=?";
        this.rs=this.executeQuery(sql);
        return ResultSetToList();
    }

    private List<Product> ResultSetToList() {
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        String sql="select * from product where name like ?";
        this.rs=this.executeQuery(sql);
        return ResultSetToList();
    }
}