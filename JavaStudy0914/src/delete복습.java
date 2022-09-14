import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete���� {

	public static void main(String[] args) {
		try {
			// 1. JDBC �����ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Class.forName(�޼ҵ�) ����Ұž�
			// �޼ҵ带 ����ϱ� ���ؼ��� ���� �޼ҵ� �ȿ� �ۼ������ ��
			// forName : ����Ӳ� -> static �޼ҵ�
			// static �޼ҵ� : ��ü�� �������� �ʰ� ����� ������
			// ���α׷��� �����ϴ� ������ ���� ���� �����͸� �ε��ϰ� �����ϴ� ���� : static
			// static ���� : �ش��ϴ� ������ �ִ� �ڵ���� ������ �������� �ʾƵ� ��� ����
			
			// �����ϱ� ������ ������ �ִ��� ������ ��. ���α׷��� ���� ���� ��
			// ���α׷���/�����Ϸ��� �������� ���� ��Ȳ�� �Ͼ �� �ִ�.
			// Add.. --> �� Ŭ���� ���� �ִ� ���� Ŭ�������� å�� ����
			
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
			String sql = "delete from member where age = 22";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("delete ����");
			}else {
				System.out.println("delete ����");
			}
			
			// 4. ����
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			
		} catch (ClassNotFoundException e) { // ��Ű���� Ojdbc.jar�� �� �־��� �� �Ͼ�� ��찡 ����
			System.out.println("�����ε� ����");
			e.printStackTrace();
		} catch (SQLException e) { // SQL����, DB ���� �ҷ�
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
	}

}
