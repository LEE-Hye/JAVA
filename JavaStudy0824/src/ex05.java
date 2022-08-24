import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		// 1. 비교 연산자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		// == : 비교 연산. 같은지?
		// !=  : 비교 연산. 다른지?
		String holJJac =  num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		
		System.out.println(num + "는(은) " + holJJac);

		
		/*
		 방법 2.
		 int num2 = num % 2;
		 System.out.println(num2 > 0 ? "홀수" : "짝수");
		  */
		
		sc.close();
		
		// 2. 논리 연산자
		// AND OR NOT
		
		// A AND B : A와 B가 모두 참일 때만 참
		System.out.println(2 < 5 && 1 > 1);
		
		// A OR B : A나 B 둘 중 하나라도 참이라면 참
		System.out.println(2 <5 || 2 > 1);
		
		// NOT : 부정
		System.out.println(!(2 < 5));
	}

}
