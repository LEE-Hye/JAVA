import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select���� {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			Connection conn = DriverManager.getConnection(url, db_id, db_pw);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

			String sql = "select * from member";

			PreparedStatement psmt = conn.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();
			rs.next();

			System.out.println("ID\tPw\tNAME\tAge");

			while (rs.next() == true) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);

				System.out.printf("%s\t%s\t%s\t%d\n", id, pw, name, age);
			}

			// 4. ����
			if (rs != null) {
				rs.close();
			}

			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (ClassNotFoundException e) {
			System.out.println("���� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����(SQL, DB����)");
			e.printStackTrace();
		}

	}

}
