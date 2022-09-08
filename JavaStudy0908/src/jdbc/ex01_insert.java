package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex01_insert {

	public static void main(String[] args) {


		// JDBC 연결 순수(4단계)
		// 선행작업 - ojdbc6.jar 
		
		try {
			// 1.JDBC 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			// 2. DB와 연결
			// DB에 접근할 때 -> 변수를 사용해서 url, id, pw를 사용
			// localhost = 127.0.0.1 -> 내 컴퓨터 ip주소
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("연결성공");
			}else {
				System.out.println("연결실패");
			}
			
			// 3. sql 작성/전송
			// 아이디 비밀번호 이름 나이
			// "hyebin", "1234", "이혜빈", 24
			String sql = "insert into member values('binzz6', '7788', '빈', 20)";
			
			// sql문을 쓰려고 준비하는 거 (담고만 있음)
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// sql문 쓰는 거
			int cnt = psmt.executeUpdate();
			
			System.out.println("cnt값 : " + cnt);

			if(cnt > 0) {
				System.out.println("insert 성공");
			}else {
				System.out.println("insert 실패");
			}
			
			// 4. 종료
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩 실패!");
		} catch(SQLException e) {
			System.out.println("DB연결 실패!");
		}

	}

}
