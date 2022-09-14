package Controller;
// Controller : ������ ����

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.MemberVO;

public class DAO {
	// DAO : Data Access Object(�����Ϳ� �����ϱ� ���� ��ü)
	// �뵵 : DB�� ������ �ϱ� ���� ������ ����Ͻ� ������ �и��ϱ� ���ؼ� ���Ǵ� ��ü
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	Scanner sc = new Scanner(System.in);

	// Connection �޼ҵ�
	private void getConnection() {
		// 1. JDBC Driver ���� �ε�
		try {
			// try-catch : ���ܻ����� �߻��Ҹ��� �κ��� �ذ��ϴ� ���
			// ���� ��Ȳ�� �߻��� �� ���� �κ��� �ڵ带 try �ȿ� �ۼ�
			// ���ܰ� �߻��ϸ� catch������ �̵�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Ŀ�ؼ� ����(��� ����)
			// Ŀ�ؼ� ������ ����̹��� ������ ����
			// ����� DB�ּ�, ����, ����� �ʿ���
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			// DB ����
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
				System.out.println("DB ���� ����");
			} else {
				System.out.println("DB ���� ����");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ���� �޼ҵ�
	private void close() {
		// 4. ����
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
			// SQL�� �ۼ� / ����
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
		// �Է¹��� id�� ��ġ�ϴ� ���� ã�Ƽ� �Է��� nick���� ����
		int cnt = 0;
		try {
			getConnection();
			// SQL�� �ۼ� / ����
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
			// SQL�� �ۼ� / ����
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
			// SQL�� �ۼ� / ����
			String sql = "select * from memberinfo where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			// rs(ResultSet) ��ü�� Select ������ ����� 'ǥ' ���·� �����ϰ� �ִ� ��ü
			// ResultSet 'Ŀ��'��� ������ ����
			// rs.next() -> Ŀ���� �Ʒ��� �̵��� �� �ִ��� ����� �ϴ� �޼ҵ�
			// �̵����� -> ���� �����Ѵٸ� �̵��� ����
			// ������ Ŀ���� �̵��ؼ� ���� �����Ѵٸ� true ��ȯ, ���� ���ٸ� false ��ȯ
			if (rs.next()) {
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String nick = rs.getString(4);

				// setString (�������� �����ϱ� ���� �뵵), getString(�������� ��ȸ�ϱ� ���� �뵵)
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
			// SQL�� �ۼ� / ����
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
