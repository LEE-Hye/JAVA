package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex02_update {

	public static void main(String[] args) {
		
		// JDBC  연결 순서
		
		
		try {
			// 1. JDBC 동적 로딩
			// "외부 라이브러리 오라클 jdbc 드라이버 오라클드라이버 경로"
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB와 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			// DB 연결
			Connection conn =  DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");
			}
			
			
			// 3. sql문 작성/전송
			String sql = "update member set pw = '0115' where id = 'hyebin'";
			
			// sql 담아 두는 것
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// sql 담아 둔 거 쓰는 것
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("update 성공");
			}else {
				System.out.println("update 실패");
			}
			
			// 4. 종료
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");
		} catch (SQLException e) {
			// sql문이 실패됐을 때 뜸
			System.out.println("DB 연결 실패");
		}
		


	}

}
