package db;

import java.sql.*;

/*public class DbConnect {
	public static Connection con;

	public static Connection getConnection(){
		//1、项目中加入jar包，及JDBC数据库链接驱动
		try {
			//2、加载数据库驱动
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();    
			//3、数据库链接地址  ,数据库名是:mysql,数据库账户：root/123456
			String url ="jdbc:mysql://localhost/Student?user=root&password=123456"
				+ "&useUnicode=true&characterEncoding=8859_1&useSSL=true"; 

			//4、创建与数据库的连接
			con=DriverManager.getConnection(url); 
			System.out.println("数据库连接成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
} 
*/
public class DbConnect {
	private static Connection connection;

	public static Connection getConnection() {

		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC";
			connection = DriverManager.getConnection(url, "root", "123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}