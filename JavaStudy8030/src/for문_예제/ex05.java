package for��_����;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		System.out.println("����1.");
		for(int i = 1; i <= 5; i++) {
			// i -> ȸ��
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("����2.");
		for(int i = 1; i <= 5; i++) {
			// i -> �� ȸ���� ���� ���� ���ϰ� ����
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("����3. ");
		for(int i = 1; i <= 5; i++) {
			
			// ���� for��
			for(int j=5; j>= i+1; j--) {
				System.out.print("  ");
			}
			
			// * ����ϴ� for��
			for(int j=1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("����4. �ٶ����� ");
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
