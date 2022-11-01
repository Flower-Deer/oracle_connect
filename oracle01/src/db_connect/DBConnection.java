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
				
				System.out.println("db연결되었습니다.");
				
			} catch (ClassNotFoundException cnfe) {
				System.out.println("드라이버 로딩실패" +cnfe.toString());
			} catch (SQLException sqle) {
				System.out.println("DB접속 실패" + sqle.toString());
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
//			System.out.println("jdbc driver 로딩 성공");
//			DriverManager.getConnection(url, user, pw);
//			System.out.println("오라클 연결 성공");
//		} catch (ClassNotFoundException e) {
//			System.out.println("jdbc driver 로딩 실패");
//		} catch (SQLException e) {
//			System.out.println("오라클 연결 실패");
//		}
//		return conn;
//	}
}
