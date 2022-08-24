import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
			int num = 7;
			
			if(num == 3) {
				System.out.println("num의 값은 숫자 3 입니다.");
			}
			
			System.out.println("프로그램 끝!");
		
		// 사용자로부터 age를 입력 받고 age가 20보다 크거나 같다면 "성인입니다" 라고 출력
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이를 입력해주시겠습니까? : ");
			int age = sc.nextInt();
			
			if(age >= 20) {
				System.out.println("성인입니다.");
			}
			else {
				System.out.println("성인이 아닙니다.");
			}

	}

}