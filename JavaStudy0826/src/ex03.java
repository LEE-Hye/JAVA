import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		while(true) {
			System.out.println("<<" + num+"번째 입력>>");
			
			System.out.print("A 입력해주세요 : ");
			int a = sc.nextInt();
			
			System.out.print("B 입력해주세요 : ");
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			
			System.out.println("A - B 결과 : " + (a - b));
			System.out.println("-----------");

			num++;
			
			
		}
		System.out.println("프로그램 종료");

	}
}
