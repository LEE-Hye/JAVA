package Controller;
// Controller : 중재자 역할

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.MemberVO;

public class DAO {
	// DAO : Data Access Object(데이터에 접근하기 위한 객체)
	// 용도 : DB에 접근을 하기 위한 로직과 비즈니스 로직을 분리하기 위해서 사용되는 객체
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	Scanner sc = new Scanner(System.in);

	// Connection 메소드
	private void getConnection() {
		// 1. JDBC Driver 동적 로딩
		try {
			// try-catch : 예외사항이 발생할만한 부분을 해결하는 방법
			// 예외 상황이 발생할 것 같은 부분의 코드를 try 안에 작성
			// 예외가 발생하면 catch문으로 이동
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 커넥션 연결(통로 열기)
			// 커넥션 연결은 드라이버가 연결을 해줌
			// 연결시 DB주소, 계정, 비번이 필요함
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			// DB 연결
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
				System.out.println("DB 연결 성공");
			} else {
				System.out.println("DB 연결 실패");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 종료 메소드
	private void close() {
		// 4. 종료
		try {
			if (rs != null) {
				rs.close();
			}

			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Insert
	public int insert(String id, String pw, String name, String nick) {
		int cnt = 0;
		try {

			getConnection();
			// SQL문 작성 / 실행
			String sql = "insert into memberinfo values(?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, nick);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// Update
	public int update(String id, String nick) {
		// 입력받은 id가 일치하는 것을 찾아서 입력한 nick으로 변경
		int cnt = 0;
		try {
			getConnection();
			// SQL문 작성 / 실행
			String sql = "update memberinfo set nick = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nick);
			psmt.setString(2, id);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int delete(String id) {
		int cnt = 0;
		try {
			getConnection();
			// SQL문 작성 / 실행
			String sql = "delete from memberinfo where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// SelectOne
	public MemberVO selectOne(String id) {
		MemberVO vo = null;
		try {
			getConnection();
			// SQL문 작성 / 실행
			String sql = "select * from memberinfo where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			// rs(ResultSet) 객체는 Select 구절의 결과를 '표' 형태로 저장하고 있는 객체
			// ResultSet '커서'라는 개념이 존재
			// rs.next() -> 커서를 아래로 이동할 수 있는지 물어보게 하는 메소드
			// 이동조건 -> 값이 존재한다면 이동이 가능
			// 실제로 커서를 이동해서 값이 존재한다면 true 반환, 값이 없다면 false 반환
			if (rs.next()) {
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nick = rs.getString(4);

				// setString (기존값을 수정하기 위한 용도), getString(기존값을 조회하기 위한 용도)
				vo = new MemberVO(id2, pw, name, nick);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	// SelectAll
	public ArrayList<MemberVO> select() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {
			getConnection();
			// SQL문 작성 / 실행
			String sql = "select * from memberinfo";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nick = rs.getString(4);

				MemberVO vo = new MemberVO(id, pw, name, nick);
				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

}
