package for문예제;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// 구구단 2단을 출력하세요
		
		for(int i = 1; i<10;i++) {
			System.out.println("2  * " + i + " = "+ (2*i));
		}
		
		// 입력받은 숫자의 구구단
		Scanner sc = new Scanner(System.in);
		System.out.print("\n단수를 입력하세요 >> ");
		int n1 = sc.nextInt();
		System.out.print("어느 수 까지 출력할까요 >> ");
		int n2 = sc.nextInt();
		System.out.println("< " + n1 + "단 >");
		
		for(int i = 1;i<=n2;i++) {
			System.out.println(n1 + " * " +  i + " = " + (n1*i));
		}
		
		sc.close();

	}

}
