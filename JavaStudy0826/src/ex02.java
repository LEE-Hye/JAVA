import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();

		// ��� 1.
//		while(num<10) {
//				System.out.print("���� �Է��ϼ��� :  ");
//				num = sc.nextInt();
//		}
//		System.out.println("���α׷� ����");

		// ��� 2.
		while (true) {
			System.out.print("���� �Է��ϼ��� :  ");
			num = sc.nextInt();
			if(num > 10) {
				break; // break�� ���� ����� ������
							// ��! �ݺ��� �ȿ� �ִٸ� �ݺ������� ������(�ϳ��� �ݺ�����)
			}
		}
		System.out.println("���α׷� ����");
		
	}
}
