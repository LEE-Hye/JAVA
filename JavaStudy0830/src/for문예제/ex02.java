package for������;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// ������ 2���� ����ϼ���
		
		for(int i = 1; i<10;i++) {
			System.out.println("2  * " + i + " = "+ (2*i));
		}
		
		// �Է¹��� ������ ������
		Scanner sc = new Scanner(System.in);
		System.out.print("\n�ܼ��� �Է��ϼ��� >> ");
		int n1 = sc.nextInt();
		System.out.print("��� �� ���� ����ұ�� >> ");
		int n2 = sc.nextInt();
		System.out.println("< " + n1 + "�� >");
		
		for(int i = 1;i<=n2;i++) {
			System.out.println(n1 + " * " +  i + " = " + (n1*i));
		}
		
		sc.close();

	}

}
