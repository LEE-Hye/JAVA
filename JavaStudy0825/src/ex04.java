import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.print("1 ~ 5������ ���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		System.out.println("===================");
		
		// siwtch ����!!
		// case n ���� �ѹ� true �� ���´ٸ� �ؿ� �ִ� ������ ���� �����Ų��.
		// --> break : break�� �����ִ� ����� �����ּ���
		// case �� --> �����δ� ������ �������� ���� �;��Ѵ�(����x, ����x)
		System.out.println("-----switch-----");
		switch(num) {
		case 1:
			System.out.println("1��(��) �Է��߽��ϴ�.");
			break;
		case 2:
			System.out.println("2��(��) �Է��߽��ϴ�.");
			break;
		case 3:
			System.out.println("3��(��) �Է��߽��ϴ�.");
			break;
		case 4:
			System.out.println("4��(��) �Է��߽��ϴ�.");
			break;
		case 5:
			System.out.println("5��(��) �Է��߽��ϴ�.");
			break;
		default:
			System.out.println("���ڸ� �߸� �Է��� �ּ̽��ϴ�.");
		}
		
		System.out.println("-----���� if��-----");
		if(num == 1) {
			System.out.println("1��(��) �Է��߽��ϴ�.");
		}
		else if(num == 2){
			System.out.println("2��(��) �Է��߽��ϴ�.");
		}
		else if(num == 3){
			System.out.println("3��(��) �Է��߽��ϴ�.");
		}
		else if(num == 4){
			System.out.println("4��(��) �Է��߽��ϴ�.");
		}
		else if(num == 5){
			System.out.println("5��(��) �Է��߽��ϴ�.");
		}
		else {
			System.out.println("���ڸ� �߸� �Է��ϼ̾��");
		}
	}

}
