package OOP;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
		// 10
		int num = 10;
		// "��ȯ"
		String name = "��ȯ";
		//3.14
		double num2 = 3.14;
		
		// Ŭ���� : ����� ������ �ڷ���
		// �޴���
		Phone p1 = new Phone();  // p1 -> ��ü
		p1.number = "01065239294";
		p1.kind = "Galuxy";
		
		System.out.println("��ȭ��ȣ : " + p1.number);
		System.out.println("���� : " + p1.kind);

		// �����ϰ� �;��
//		System.out.println("���� : " + p1.playGame()); 
//		=>System.out.println("���� : " + System.out.println("���� �ϱ�")); �� ������
		p1.playGame();
		
		p1.map();
		
		
		Phone p2 = new Phone();
		p2.number = "01057127248";
		p2.kind = "Apple";
		System.out.println(p2.number);
		System.out.println(p2.kind);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
