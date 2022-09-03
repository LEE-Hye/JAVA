package OOP;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
		// 10
		int num = 10;
		// "승환"
		String name = "승환";
		//3.14
		double num2 = 3.14;
		
		// 클래스 : 사용자 임의의 자료형
		// 휴대폰
		Phone p1 = new Phone();  // p1 -> 객체
		p1.number = "01065239294";
		p1.kind = "Galuxy";
		
		System.out.println("전화번호 : " + p1.number);
		System.out.println("기종 : " + p1.kind);

		// 게임하고 싶어요
//		System.out.println("게임 : " + p1.playGame()); 
//		=>System.out.println("게임 : " + System.out.println("게임 하기")); 인 형태임
		p1.playGame();
		
		p1.map();
		
		
		Phone p2 = new Phone();
		p2.number = "01057127248";
		p2.kind = "Apple";
		System.out.println(p2.number);
		System.out.println(p2.kind);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
