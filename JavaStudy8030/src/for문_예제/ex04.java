package for��_����;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		// �Է� ���� ������ ����� ���ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <=num; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}

	}

}
