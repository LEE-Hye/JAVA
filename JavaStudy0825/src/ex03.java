import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int grade = sc.nextInt();
		
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
		
		switch(grade) {
		case 100,99,98,97,96,95,94,93,92,91,90:
			System.out.println("A���� �Դϴ�.");
			break;
		case 89,88,87,86,85,84,83,82,81,80:
			System.out.println("B���� �Դϴ�.");
			break;
		case 79,78,77,76,75,74,73,72,71,70:
			System.out.println("C���� �Դϴ�.");
			break;
		default:
			System.out.println("���� ��õ�ҰԿ�");
		}
	}
}
