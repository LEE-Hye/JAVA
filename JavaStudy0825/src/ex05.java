import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է����ּ��� : ");
		int mon = sc.nextInt();
		
		switch(mon) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println(mon + "���� �ܿ��Դϴ�!");
			break;
		case 3,4,5 :
			System.out.println(mon + "���� ���Դϴ�!");
			break;
		case 6,7,8 :
			System.out.println(mon + "���� �����Դϴ�!");
			break;
		case 9,10,11 :
			System.out.println(mon + "���� �����Դϴ�!");
			break;
		}
		
		// ctrl + alt +  ����Ű : ���ϴ� ���⿡ ����ȴ�
	}

}
