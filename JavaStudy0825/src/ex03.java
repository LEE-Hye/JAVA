import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int grade = sc.nextInt();
		
		// ���� if������ �����!
		if(grade >= 90) {
			System.out.println("A�����Դϴ�.");
		}
		else if(grade >= 80) {
			System.out.println("B�����Դϴ�.");
		}
		else if(grade >= 70) {
			System.out.println("C�����Դϴ�.");
		}
		else {
			System.out.println("���� ��õ�մϴ� ��(^��^*)");
		}
		
		// switch������ �ٲٱ�!
		switch(grade/10) {
		case 10:
			System.out.println("A+ ���� �Դϴ�.");
			break;
		case 9:
			System.out.println("A���� �Դϴ�.");
			break;
		case 8:
			System.out.println("B���� �Դϴ�.");
			break;
		case 7:
			System.out.println("C���� �Դϴ�.");
			break;
		default:
			System.out.println("���� ��õ�ҰԿ�");
		}
	}
}
