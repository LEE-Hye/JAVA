package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex02_update {

	public static void main(String[] args) {
		
		// JDBC  ���� ����
		
		
		try {
			// 1. JDBC ���� �ε�
			// "�ܺ� ���̺귯�� ����Ŭ jdbc ����̹� ����Ŭ����̹� ���"
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB�� ����
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			// DB ����
			Connection conn =  DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
			
			
			// 3. sql�� �ۼ�/����
			String sql = "update member set pw = '0115' where id = 'hyebin'";
			
			// sql ��� �δ� ��
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// sql ��� �� �� ���� ��
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
			System.out.println("���� �ε� ����");
		} catch (SQLException e) {
			// sql���� ���е��� �� ��
			System.out.println("DB ���� ����");
		}
		


	}

}
