import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
			int num = 7;
			
			if(num == 3) {
				System.out.println("num�� ���� ���� 3 �Դϴ�.");
			}
			
			System.out.println("���α׷� ��!");
		
		// ����ڷκ��� age�� �Է� �ް� age�� 20���� ũ�ų� ���ٸ� "�����Դϴ�" ��� ���
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���̸� �Է��� �ֽðڽ��ϱ�? : ");
			int age = sc.nextInt();
			
			// ũ�ų� ���ٸ� >=
			// �۰ų� ���ٸ� <=
			// if ������ { }�� ���ٸ� �������� ���� ��ɹ� �� �ٸ� �ν� ��
			if(age >= 20) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("������ �ƴմϴ�.");
			}

	}

}