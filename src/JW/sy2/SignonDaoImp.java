package JW.sy2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SignonDaoImp extends DataBase implements SignonDao {
    @Override
    public int add(Signon entity) {
        String sql="insert into signon values(?,?)";
        return this.executeUpdate(sql,
                entity.getUsername(),entity.getPassword());
    }
    @Override
    public int delete(String username) {
        String sql="delete from signon where username=?";
        return this.executeUpdate(sql, username);
    }
    @Override
    public int update(Signon entity) {
        String sql="update signon set password=? where username=?";
        return this.executeUpdate(sql,
                entity.getPassword(),entity.getUsername());
    }
    @Override
    public List<Signon> findAll() {
        String sql="select * from signon";
        this.rs=this.executeQuery(sql);
        List<Signon> list= new ArrayList<>();
        try {
            while(rs.next()){
                Signon entity=new Signon();
                entity.setUsername(rs.getString("username"));
                entity.setPassword(rs.getString("password"));
                list.add(entity);
            }
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public boolean login(Signon entity) {
        String sql="select * from signon where username=? and password=?";
        this.rs=this.executeQuery(sql,
                entity.getUsername(),entity.getPassword());
        boolean tag=false;
        try {
            tag=rs.next();
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return tag;
    }
    @Override
    public String login1(Signon entity) {
        String msg="";
        String sql="select password from signon where username=?";
        this.rs=this.executeQuery(sql);
        try {
            if(rs.next()){
                if(entity.getPassword().equals(rs.getString("password"))){
                    msg="登陆成功";
                }else{
                    msg="密码错误";
                }
            }else{
                msg="用户名不存在";
            }
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return msg;
    }
}
