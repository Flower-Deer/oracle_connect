package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection dbConn;
		public static Connection getConnection() {
			Connection conn = null;
			try {
				String user = "scott";
				String pw = "tiger";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url,user,pw);
				
				System.out.println("db����Ǿ����ϴ�.");
				
			} catch (ClassNotFoundException cnfe) {
				System.out.println("����̹� �ε�����" +cnfe.toString());
			} catch (SQLException sqle) {
				System.out.println("DB���� ����" + sqle.toString());
			} catch (Exception e) {
				System.out.println("Unkonwn error");
				e.printStackTrace();
			}
			return conn;
		}
	
//	public static void main(String[] args) {
//		String user = "scott";
//		String pw = "tiger";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		Connection conn = null;
//		try {
//			Class.forName(driver);
//			System.out.println("jdbc driver �ε� ����");
//			DriverManager.getConnection(url, user, pw);
//			System.out.println("����Ŭ ���� ����");
//		} catch (ClassNotFoundException e) {
//			System.out.println("jdbc driver �ε� ����");
//		} catch (SQLException e) {
//			System.out.println("����Ŭ ���� ����");
//		}
//		return conn;
//	}
}
