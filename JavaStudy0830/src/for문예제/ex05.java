package for������;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();

		for (int a = 1; a <= num; a++) { //���� 
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
