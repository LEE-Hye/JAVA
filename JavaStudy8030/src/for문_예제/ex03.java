package for��_����;

public class ex03 {

	public static void main(String[] args) {
		// ������ 2�� ~ 9�ܱ��� ����ϼ���
		
		for(int i = 2; i < 10; i++) {
			System.out.println("==" + i + "��==");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}

	}

}
