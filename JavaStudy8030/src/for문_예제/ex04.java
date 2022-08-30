package for문_예제;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		// 입력 받은 정수의 약수를 구하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <=num; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}

	}

}
