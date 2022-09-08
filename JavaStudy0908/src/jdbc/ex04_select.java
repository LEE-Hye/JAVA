package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex04_select {

	public static void main(String[] args) {

		// JDBC  ���� ����
		
		
		try {
			// 1. JDBC ���� �ε�
			// "�ܺ� ���̺귯�� ����Ŭ jdbc ����̹� ����Ŭ����̹� ���"
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB�� ����
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			// DB ����
			Connection conn =  DriverManager.getConnection(url, db_id, db_pw);
			
			if(conn != null) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
			
			
			// 3. sql�� �ۼ�/����
			String sql = "select * from member";
			
			// sql ��� �δ� ��
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// CURD : create(����), update(����, ����), read(�б�, ��ȸ), delete(����)
			// excuteUpdate() : insert, update, delete -> ���ϰ� : int (���̺� ���⿡ ������ ���� o)
			// excuteQuery() : select (���̺� ���⿡ ������ ����x, �о���⸸ ��)
			
			ResultSet rs = psmt.executeQuery();
			rs.next();
			
			System.out.println("ID\tPw\tNAME\tAge");
			
			// rs.next()�� �Ҹ��� Ÿ����. default���� true�� �� ��� ��
			while(rs.next() == true) {
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			int age = rs.getInt(4);
			
			
			System.out.printf("%s\t%s\t%s\t%d\n", id, pw, name, age);
			}
			
			// 4. ����
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
			System.out.println("���� �ε� ����");
		} catch (SQLException e) {
			// sql���� ���е��� �� ��
			System.out.println("DB ���� ����");
		}

	}

}
