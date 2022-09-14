import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update���� {

	public static void main(String[] args) {
		try {
			// 1. JDBC �����ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB�� ����
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("���Ἲ��");
			}else {
				System.out.println("�������");
			}
			
			// 3. SQL �ۼ�/����
			String sql = "update member set age = 25 where age = 24";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("update ����");
			}else {
				System.out.println("update ����");
			}
			
			// 4. ����
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("�����ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}

	}

}
