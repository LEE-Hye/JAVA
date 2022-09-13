package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex03_delete {

	public static void main(String[] args) {
		
		
		// JDBC 4�ܰ�
		// 1. JDBC Driver ���� �ε�
		// 2. ��� �����ֱ�(DB ����)
		// 3. SQL(����)�� ����
		// 4. 2������ ������ ��θ� �ݾ��ִ� �ܰ�
		
		
		try {
			// 1. JDBC Driver ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. ��� �����ֱ�(DB ����)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
			
			// 3. SQL(����)�� ����
			String sql = "delete from member where id = 'hb'";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("update ����");
			}else {
				System.out.println("update ����");
			}
			
			// 4. 2������ ������ ��θ� �ݾ��ִ� �ܰ�
			// ������� ���� �������� ����ֽø� �˴ϴ�.
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("���� �ε� ����");

		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}

	}

}
