package for������;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		// char : �ȿ� �ִ� �����Ͱ� ���� �����Ͷ��
		// �� �ش��ϴ� ���ڿ� �ƽ�Ű�ڵ�� ��ȯ�Ǿ� ���
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���۾��ĺ��� �Է��ϼ��� >> ");
		char start = sc.next().charAt(0);
		System.out.print("���������ĺ��� �Է��ϼ��� >> ");
		char end = sc.next().charAt(0);
		for(char i = start; i<=end;i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
