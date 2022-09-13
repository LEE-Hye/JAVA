package for문예제;

import java.util.Scanner;

public class ex00 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();

		for(int a=1;a<=num;a++) {
	         for (int b=1;b<=a;b++) {
	            System.out.print("*");
	         }
	         for(int b=1;b<=num-a;b++) {
	            System.out.print("  ");
	         }
	         for (int b = 0;b<=num-a;b++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
		

	      
	      for(int a=1;a<=num;a++) {
	         for(int b=1;b<=num-a;b++) {
	            System.out.print("  ");
	         }
	         for (int b=1;b<=a;b++) {
	            System.out.print("*");
	         }
	         for(int b=2;b<=a;b++) {
	            System.out.print("  ");
	         }
	         for (int b = 0;b<=num-a;b++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
		
		

		
		
		
		
		
		
		
		
		
				sc.close();
			}
		}
