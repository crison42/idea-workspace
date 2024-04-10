package JW.sy4.no7;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProItemDaoImp extends DataBase implements ProItemDao {
    @Override
    public List<ProItem> findAll() {
        String sql = "select p.name,i.listprice,i.status,p.productid from product p,item i where p.productid=i.productid";
        this.rs = this.executeQuery(sql);
        List<ProItem> list = new ArrayList<ProItem>();
        try {
            while (rs.next()) {
                ProItem entity = new ProItem();
                entity.setListprice(rs.getDouble("listprice"));
                entity.setName(rs.getString("name"));
                entity.setProductid(rs.getString("productid"));
                entity.setStatus(rs.getString("status"));
                list.add(entity);
            }
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
}
