package for��_����;

public class ex03 {

	public static void main(String[] args) {
		
		// ���1. ������ 2�� ~ 9�ܱ��� ����ϼ���
		// ���� for�� --> for�� �ȿ� ���� �������� �ٸ� for���� �����ϴ� ��
		// �ڵ�� ������ �Ʒ���!,  for���� ���� ���౸��
		System.out.println("��� 1");
		for(int i = 2; i < 10; i++) {
			System.out.println("==" + i + "��==");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		// ��� 2. 
		System.out.println("��� 2");
		for(int i = 2; i < 10; i++) {
			System.out.print("<" + i + "��> :  ");
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t  ");
			}
			System.out.println();
		}
		System.out.println();
		
		// ��� 3.
		System.out.println("��� 3");
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + i*j + "\t\t");
			}
			System.out.println();
		}
		
	}

}
