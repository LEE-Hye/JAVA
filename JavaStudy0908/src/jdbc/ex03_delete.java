package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex03_delete {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");
			}
			
			String sql = "delete from member where age=20";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("update 성공");
			}else {
				System.out.println("update 실패");
			}
			
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");

		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}

	}

}
