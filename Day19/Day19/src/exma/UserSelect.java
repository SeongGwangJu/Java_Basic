package exma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/test";
		String id = "hr";
		String pwd = "hr";
		
		Class.forName("com.mysql.jdbc.Driver");
		// Connection : jdbc 드라이버를 사용하여 데이터베이스에 연결
		// DriverManager.getConnection 메소드를 사용하여
		// dbur1, 사용자이름, 비밀번호를 전달해서 데이터베이스에 연결할 수 있다.
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		//쿼리사용 준비
		Statement stmt = conn.createStatement();
		String sql = "SELECT * FROM TABLE_USER";
		// executeQuery() 메소드를 사용하여 sql문 실행 !!
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int num = rs.getInt("USER_NUM");
			String user_id = rs.getString("USER_ID");
			String user_pwd = rs.getString("USER_PWD");
			System.out.println(num + " " + user_id + " " + user_pwd);
		}
	}
}
