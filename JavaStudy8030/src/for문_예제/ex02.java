package for��_����;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// 1. for���� ����Ͽ� ������ 2���� ����ϼ���
//		for(int i = 1; i <10; i++) {
//			System.out.println("2 * " + i + " = " + 2*i);
//		}
//		System.out.println();
//		
//		// 2. ���ϴ� ���� �Է� �޾� �������� ����ϼ���
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�� �Է� : ");
//		int dan = sc.nextInt();
//		
//		for(int i = 1 ; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + dan * i);
//		}
		
		// 3. �ܼ��� �������� ���ϴ� ���� �Է��Ͽ� �̿� ���� ��µǰ� �Ͻÿ�
		System.out.print("�ܼ� �Է� : ");
		int su = sc.nextInt();
		System.out.print("��� ������ ��� : ");
		int wh = sc.nextInt();
		
		System.out.println(su + "��");
		for(int i = 1; i <= wh; i++) {
			System.out.println(su + " * " + i + " = " + su * i );
		}
		
	}

}
