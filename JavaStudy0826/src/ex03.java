import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		while(true) {
			System.out.println("<<" + num+"��° �Է�>>");
			
			System.out.print("A �Է����ּ��� : ");
			int a = sc.nextInt();
			
			System.out.print("B �Է����ּ��� : ");
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			
			System.out.println("A - B ��� : " + (a - b));
			System.out.println("-----------");

			num++;
			
			
		}
		System.out.println("���α׷� ����");

	}
}