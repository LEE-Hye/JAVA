package for문_예제;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		System.out.println("문제1.");
		for(int i = 1; i <= 5; i++) {
			// i -> 회차
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("문제2.");
		for(int i = 1; i <= 5; i++) {
			// i -> 각 회차에 대한 값을 지니고 있음
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("문제3. ");
		for(int i = 1; i <= 5; i++) {
			
			// 띄어쓰기 for문
			for(int j=5; j>= i+1; j--) {
				System.out.print("  ");
			}
			
			// * 출력하는 for문
			for(int j=1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("문제4. 바람개비 ");
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			for(int k = 9; k>=i; k--) {
				System.out.print("  ");
			}
			for(int k = 10; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 10; i++) {
			for(int k = 9; k>=i; k--) {
				System.out.print("  ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			for(int k = 2; k<=i; k++) {
				System.out.print("  ");
			}
			for(int k = 10; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
