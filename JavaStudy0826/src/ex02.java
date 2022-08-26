import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();

		// 방법 1.
//		while(num<10) {
//				System.out.print("수를 입력하세요 :  ");
//				num = sc.nextInt();
//		}
//		System.out.println("프로그램 종료");

		// 방법 2.
		while (true) {
			System.out.print("수를 입력하세요 :  ");
			num = sc.nextInt();
			if(num > 10) {
				break; // break가 속한 제어문을 끝낸다
							// 단! 반복문 안에 있다면 반복문까지 끝낸다(하나의 반복문만)
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
