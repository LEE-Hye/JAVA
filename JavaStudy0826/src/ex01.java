import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// 총 10개의 정수를 입력받을 수 있는 프로그램을 만들어 주세요
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		System.out.println("10개의 정수를 입력해주세요 : ");
		while(num<=10) {
			int su = sc.nextInt();
			num++;
		}
		// 금요일 파이팅!
	}

}
