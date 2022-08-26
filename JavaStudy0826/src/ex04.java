import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int jjac = 0;
		int hol = 0;
		
		while(true) {
			System.out.print("숫자를 입력해주세요 : ");
			int num = sc.nextInt();
			
			if(num == -1) {
				break;
			}
			
			// 방법2. 선생님이 해준 것
//			if(num % 2 == 0 ) {
//				jjac++; // num = num + 1;
//			}else {
//				hol++;
//			}
			
			// 방법1. 내가 한 것
			int result = num % 2 == 0 ? jjac++ : hol++;
			
			System.out.println("짝수 개수 : " + jjac);
			System.out.println("홀수 개수 : " + hol);
			System.out.println("------------");

		}
		System.out.println("종료되었습니다.");
	}

}
