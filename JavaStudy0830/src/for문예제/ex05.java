package for문예제;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();

		for (int a = 1; a <= num; a++) { //띄어쓰기 
			for (int b = 1; b <= num - a; b++) {
				System.out.print("  ");
			}
			for (int b = 1; b <= a; b++) {
				System.out.print("*");

			}
			System.out.println();
//
//		for (int a = 1; a <= num; a++) {
//			for (int i = 1; i <= a; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		
//		for (int a = num; a >= 1; a--) {
//			for (int i = 1; i <= a; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		

		}
	}

}
