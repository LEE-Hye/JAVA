import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update복습 {

	public static void main(String[] args) {
		try {
			// 1. JDBC 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB와 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("연결성공");
			}else {
				System.out.println("연결실패");
			}
			
			// 3. SQL 작성/전송
			String sql = "update member set age = 25 where age = 24";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
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
			System.out.println("동적로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}

	}

}
