package for문예제;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		// char : 안에 있는 데이터가 숫자 데이터라면
		// → 해당하는 숫자에 아스키코드로 변환되어 출력
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작알파벳을 입력하세요 >> ");
		char start = sc.next().charAt(0);
		System.out.print("마지막알파벳을 입력하세요 >> ");
		char end = sc.next().charAt(0);
		for(char i = start; i<=end;i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
