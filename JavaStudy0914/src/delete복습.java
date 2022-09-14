import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete복습 {

	public static void main(String[] args) {
		try {
			// 1. JDBC 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Class.forName(메소드) 사용할거야
			// 메소드를 사용하기 위해서는 따로 메소드 안에 작성해줘야 함
			// forName : 기울임꼴 -> static 메소드
			// static 메소드 : 객체를 생성하지 않고도 사용이 가능함
			// 프로그램을 실행하는 순간에 가장 먼저 데이터를 로딩하고 저장하는 공간 : static
			// static 공간 : 해당하는 공간에 있는 코드들은 별도로 생성하지 않아도 사용 가능
			
			// 실행하기 전까지 문제가 있는지 없는지 모름. 프로그램이 실행 됐을 때
			// 프로그래머/컴파일러가 생각지도 못한 상황이 일어날 수 있다.
			// Add.. --> 내 클래스 위에 있는 상위 클래스에게 책임 전가
			
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
			String sql = "delete from member where age = 22";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("delete 성공");
			}else {
				System.out.println("delete 실패");
			}
			
			// 4. 종료
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			
		} catch (ClassNotFoundException e) { // 패키지에 Ojdbc.jar를 안 넣었을 때 일어나는 경우가 많음
			System.out.println("동적로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) { // SQL문제, DB 접속 불량
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
	}

}
