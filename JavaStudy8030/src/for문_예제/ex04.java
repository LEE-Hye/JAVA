package for��_����;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		// �Է� ���� ������ ����� ���ϼ���.
		System.out.println("����1.");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <=num; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}

		
		// 2~30������ ����� ���ϼ���
		System.out.println("����2.");
		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "�� ��� : ");
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

		// �ڵ� ���� : Ctrl + A -> Ctrl + Shift + F
	}

}
