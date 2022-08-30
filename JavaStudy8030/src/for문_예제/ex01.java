package for문_예제;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		
		// 1. 아스키코드 출력해보기
		// char : 안에 있는 데이터가 숫자 데이터라면
		// -> 해당하는 숫자에 아스키코드로
		// 변환 되어져서 출력된다!
		char t1 = 97;
		// ++t1 ==> t1 = t1 + 1;
		t1++;
		t1++;
		System.out.println(t1); 
		
		// 2. a ~ f 알파벳 출력하기
		System.out.println("a ~ f를 출력하라");
		for(char t2 = 97; t2 < 102; t2++) {
			System.out.print(t2);
		}
		System.out.println();
		
		
		// 3. 시작 알파벳과 마지막 알파벳을 입력받아
		// 	 그 두 알파벳 사이의 모든 알파벳을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 알파벳을 입력해주세요 : ");
		char eng = sc.next().charAt(0);
				
		System.out.print("끝 알파벳을 입력해주세요 : ");
		char eng2 = sc.next().charAt(0);
		
		for(char i = eng; i <= eng2; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		
	}

}
