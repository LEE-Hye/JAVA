package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex03_delete {

	public static void main(String[] args) {
		
		
		// JDBC 4단계
		// 1. JDBC Driver 동적 로딩
		// 2. 통로 열어주기(DB 연결)
		// 3. SQL(쿼리)문 전송
		// 4. 2번에서 열어준 통로를 닫아주는 단계
		
		
		try {
			// 1. JDBC Driver 동적 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 통로 열어주기(DB 연결)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");
			}
			
			// 3. SQL(쿼리)문 전송
			String sql = "delete from member where id = 'hb'";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("update 성공");
			}else {
				System.out.println("update 실패");
			}
			
			// 4. 2번에서 열어준 통로를 닫아주는 단계
			// 열어줬던 순서 역순으로 담아주시면 됩니다.
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
