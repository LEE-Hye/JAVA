import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
//			int num = 7;
//			
//			if(num == 3) {
//				System.out.println("num의 값은 숫자 3 입니다.");
//			}
//			
//			System.out.println("프로그램 끝!");
		
		// 사용자로부터 age를 입력 받고 age가 20보다 크거나 같다면 "성인입니다" 라고 출력
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이를 입력해 주시겠습니까? : ");
			int age = sc.nextInt();
			
			// 크거나 같다면 >=
			// 작거나 같다면 <=
			// if 문에서 { }가 없다면 다음으로 오늘 명령문 한 줄만 인식 함
			
			
			// 10대 입니다.
			// 20대 입니다.
			// 30대 입니다.
			// 40대 이상입니다.
			
			if(age >= 40) {
				System.out.println("40대 이상 입니다.");
			}
			else if( age < 40 && age >= 30) { // 30 <= age < 40 이런 형식은 자바에서 지원하지 않음
				System.out.println("30대 입니다.");
			}
			else if(age >= 20) {
				System.out.println("20대 입니다.");
			}
			else if(age >= 10) {
				System.out.println("10대 입니다.");
			}
			else { // else : if문의 조긴이 false인 경우에 실행 할 부분을 정의
					  // 위에 있는 모든 조건이 false일 경우에 실행할 부분
				System.out.println("10대 미만 입니다.");
			}

	}

}