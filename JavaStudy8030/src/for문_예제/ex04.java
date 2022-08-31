package for문_예제;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		// 입력 받은 정수의 약수를 구하세요.
		System.out.println("문제1.");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <=num; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}

		
		// 2~30까지의 약수를 구하세요
		System.out.println("문제2.");
		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

		// 코드 정리 : Ctrl + A -> Ctrl + Shift + F
	}

}
