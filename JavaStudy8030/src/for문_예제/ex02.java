package for문_예제;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// 1. for문을 사용하여 구구단 2단을 출력하세요
//		for(int i = 1; i <10; i++) {
//			System.out.println("2 * " + i + " = " + 2*i);
//		}
//		System.out.println();
//		
//		// 2. 원하는 단을 입력 받아 구구단을 출력하세요
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("단 입력 : ");
//		int dan = sc.nextInt();
//		
//		for(int i = 1 ; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + dan * i);
//		}
		
		// 3. 단수와 곱해지길 원하는 수를 입력하여 이와 같이 출력되게 하시오
		System.out.print("단수 입력 : ");
		int su = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int wh = sc.nextInt();
		
		System.out.println(su + "단");
		for(int i = 1; i <= wh; i++) {
			System.out.println(su + " * " + i + " = " + su * i );
		}
		
	}

}
