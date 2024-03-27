package JW.sy2;

import java.sql.*;
import java.util.List;

public class DataBase {

	static String url="jdbc:mysql://localhost:3306/bookstore";
	static String user="root";
	static String password="123456";
	static String driverClass="com.mysql.jdbc.Driver";
	
	protected  Connection con=null;
	protected PreparedStatement ps=null;
	protected ResultSet rs=null;
	static{
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*public DataBase(){
		try {
			
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public void getConnection(){
		
		try {
			if(con==null||con.isClosed())
				con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int executeUpdate(String sql,Object...args){
		int result=0;
		getConnection();
		try {
			ps=con.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i+1, args[i]);
			}
			result=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public ResultSet executeQuery(String sql,Object...args){
		getConnection();
		rs=null;
		try {
			ps=con.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i+1, args[i]);
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void close(){
		
			try {
					if(rs!=null){
						rs.close();
					if(ps!=null){
						ps.close();
					}
					if(con!=null){
						con.close();
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


	public List<Product> findByCatidFenye(String catid, int pageNum, int pageSize) {
		return null;
	}

}
