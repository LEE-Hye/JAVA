package for��_����;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		
		// 1. �ƽ�Ű�ڵ� ����غ���
		// char : �ȿ� �ִ� �����Ͱ� ���� �����Ͷ��
		// -> �ش��ϴ� ���ڿ� �ƽ�Ű�ڵ��
		// ��ȯ �Ǿ����� ��µȴ�!
		char t1 = 97;
		// ++t1 ==> t1 = t1 + 1;
		t1++;
		t1++;
		System.out.println(t1); 
		
		// 2. a ~ f ���ĺ� ����ϱ�
		System.out.println("a ~ f�� ����϶�");
		for(char t2 = 97; t2 < 102; t2++) {
			System.out.print(t2);
		}
		System.out.println();
		
		
		// 3. ���� ���ĺ��� ������ ���ĺ��� �Է¹޾�
		// 	 �� �� ���ĺ� ������ ��� ���ĺ��� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���ĺ��� �Է����ּ��� : ");
		char eng = sc.next().charAt(0);
				
		System.out.print("�� ���ĺ��� �Է����ּ��� : ");
		char eng2 = sc.next().charAt(0);
		
		for(char i = eng; i <= eng2; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		
	}

}
