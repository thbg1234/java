package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Connection conn;
		String url = "jdbc:mysql://localhost:3306/dbstudent?serverTimezone=UTC";
		
		String id = "root";
		String pw = "123456";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,id,pw);
			
			System.out.println("DB연결완료");
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드러이버 로드 오류");
		}catch(SQLException e) {
			System.out.println("DB연결 오류");
		}
	}

}
