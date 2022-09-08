package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex04_select {

	public static void main(String[] args) {

		// JDBC  연결 순서
		
		
		try {
			// 1. JDBC 동적 로딩
			// "외부 라이브러리 오라클 jdbc 드라이버 오라클드라이버 경로"
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB와 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			// DB 연결
			Connection conn =  DriverManager.getConnection(url, db_id, db_pw);
			
			if(conn != null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");
			}
			
			
			// 3. sql문 작성/전송
			String sql = "select * from member";
			
			// sql 담아 두는 것
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// CURD : create(생성), update(갱신, 수정), read(읽기, 조회), delete(삭제)
			// excuteUpdate() : insert, update, delete -> 리턴값 : int (테이블 영향에 직접적 영향 o)
			// excuteQuery() : select (테이블 영향에 직접적 영향x, 읽어오기만 함)
			
			ResultSet rs = psmt.executeQuery();
			rs.next();
			
			System.out.println("ID\tPw\tNAME\tAge");
			
			// rs.next()는 불리언 타입임. default값이 true라 안 적어도 됨
			while(rs.next() == true) {
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			int age = rs.getInt(4);
			
			
			System.out.printf("%s\t%s\t%s\t%d\n", id, pw, name, age);
			}
			
			// 4. 종료
			if(rs != null) {
				rs.close();
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
			// sql문이 실패됐을 때 뜸
			System.out.println("DB 연결 실패");
		}

	}

}
