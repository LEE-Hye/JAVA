import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		// 1. �� ������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		// == : �� ����. ������?
		// !=  : �� ����. �ٸ���?
		String holJJac =  num % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		
		System.out.println(num + "��(��) " + holJJac);

		
		/*
		 ��� 2.
		 int num2 = num % 2;
		 System.out.println(num2 > 0 ? "Ȧ��" : "¦��");
		  */
		
		sc.close();
		
		// 2. �� ������
		// AND OR NOT
		
		// A AND B : A�� B�� ��� ���� ���� ��
		System.out.println(2 < 5 && 1 > 1);
		
		// A OR B : A�� B �� �� �ϳ��� ���̶�� ��
		System.out.println(2 <5 || 2 > 1);
		
		// NOT : ����
		System.out.println(!(2 < 5));
	}

}
