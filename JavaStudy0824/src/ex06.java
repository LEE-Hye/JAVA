import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
//			int num = 7;
//			
//			if(num == 3) {
//				System.out.println("num�� ���� ���� 3 �Դϴ�.");
//			}
//			
//			System.out.println("���α׷� ��!");
		
		// ����ڷκ��� age�� �Է� �ް� age�� 20���� ũ�ų� ���ٸ� "�����Դϴ�" ��� ���
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���̸� �Է��� �ֽðڽ��ϱ�? : ");
			int age = sc.nextInt();
			
			// ũ�ų� ���ٸ� >=
			// �۰ų� ���ٸ� <=
			// if ������ { }�� ���ٸ� �������� ���� ��ɹ� �� �ٸ� �ν� ��
			
			
			// 10�� �Դϴ�.
			// 20�� �Դϴ�.
			// 30�� �Դϴ�.
			// 40�� �̻��Դϴ�.
			
			if(age >= 40) {
				System.out.println("40�� �̻� �Դϴ�.");
			}
			else if( age < 40 && age >= 30) { // 30 <= age < 40 �̷� ������ �ڹٿ��� �������� ����
				System.out.println("30�� �Դϴ�.");
			}
			else if(age >= 20) {
				System.out.println("20�� �Դϴ�.");
			}
			else if(age >= 10) {
				System.out.println("10�� �Դϴ�.");
			}
			else { // else : if���� ������ false�� ��쿡 ���� �� �κ��� ����
					  // ���� �ִ� ��� ������ false�� ��쿡 ������ �κ�
				System.out.println("10�� �̸� �Դϴ�.");
			}

	}

}