import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int jjac = 0;
		int hol = 0;
		
		while(true) {
			System.out.print("���ڸ� �Է����ּ��� : ");
			int num = sc.nextInt();
			
			if(num == -1) {
				break;
			}
			
			// ���2. �������� ���� ��
//			if(num % 2 == 0 ) {
//				jjac++; // num = num + 1;
//			}else {
//				hol++;
//			}
			
			// ���1. ���� �� ��
			int result = num % 2 == 0 ? jjac++ : hol++;
			
			System.out.println("¦�� ���� : " + jjac);
			System.out.println("Ȧ�� ���� : " + hol);
			System.out.println("------------");

		}
		System.out.println("����Ǿ����ϴ�.");
	}

}
