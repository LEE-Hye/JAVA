import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		// ����ڷκ��� �����͸� �Է¹��� �� �ִ� ���
		Scanner sc = new Scanner(System.in);
		
		// nextInt --> ����ڷκ��� �Է¹��� ���� ������ �ν����ּ���
		System.out.print("���ڸ� �Է����ּ��� : ");
		// System.out.println() -> ��� �� ���� �ٷ� �̵�
		// System.out.print() -> ��� �� ���� �ٷ� �̵� �� ��
		int num = sc.nextInt(); // �Է� �� ���� �ٷ� �̵�
		
		
		// num ���� ���� �ڸ��� 1�� �ٲ�
		System.out.println("'���� �ڸ�'�� '1'�� �ٲ� ���Ȯ�� : " + num/10 + "1");
		
		// num1 ���� ���� �ڸ��� 0���� �ٲ�
		// num���� ���� �ڸ��� �� ���ڸ� ��½����ּ���!
		// --> num���� 10���� ���� ������ ��ŭ ���� ��½��� �ּ���!
		System.out.println("�������� '���� �ڸ�'��'0'�� ��� Ȯ�� : " + (num - num%10));
		System.out.println("�� '���� �ڸ�'�� '0'�� ���Ȯ�� : " + num/10 + "0");
		// 573 -> 570
		// 465 -> 460
		// 373 -> 370
		
		// num2 ���� ���� �ڸ��� ��� �ǰ�
		System.out.println("'���� �ڸ���' ��µǴ� ���Ȯ�� : " + num%10);
	}

}
