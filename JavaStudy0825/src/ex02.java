import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int one = num % 10; // ���� ����
		
		if(num%10<5) {
			// ������ ���
			System.out.println("���� �� �ݿø� ���� ? " + (num - num%10));
			
			int result  = num - one; // ���� ����(if�� �ȿ����� �����ϴ� ��)
			System.out.println("������ ���� : " + result);
		}
		else {
			// �ø��� ���
			System.out.println("���� �� �ݿø� ����? " + (num + 10 - num%10));
			
			int result = num + 10 - one; // ���� ����
			System.out.println("������ ���� : " + result);
		}

	}

}
