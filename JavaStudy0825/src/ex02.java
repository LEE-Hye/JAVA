import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int one = num % 10; // 전역 변수
		
		if(num%10<5) {
			// 내림한 결과
			System.out.println("내가 한 반올림 수는 ? " + (num - num%10));
			
			int result  = num - one; // 지역 변수(if문 안에서만 존재하는 것)
			System.out.println("선생님 정답 : " + result);
		}
		else {
			// 올림한 결과
			System.out.println("내가 한 반올림 수는? " + (num + 10 - num%10));
			
			int result = num + 10 - one; // 지역 변수
			System.out.println("선생님 정답 : " + result);
		}

	}

}
