import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// int Ÿ���� �����Ͱ� �� 5�� �� �� �ִ�
		// numArray��� �迭 ������ּ���!
		int numArray[] = new int[5];
		
		// numArray��� �迭��
		// ����ڰ� �Է��� �����ͷ� �迭�� ä���ּ���!
		Scanner sc = new Scanner(System.in);
//		System.out.print("���� Ǭ ��");
		System.out.print("5���� ���ڸ� �Է����ּ��� : ");
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = sc.nextInt();
		}
		
//		System.out.println("�ٸ� ������� ���� ����");
//		for(int i = 0; i < numArray.length; i++) {
//			System.out.print(i + 1 + "��° ���� �Է� : ");
//			numArray[i] = sc.nextInt();
//		}

		// �迭�� �ִ� �����͸� ��� �����ּ���
		System.out.print("�迭�� �ִ� ������ ��� : ");
		for(int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
	}

}
