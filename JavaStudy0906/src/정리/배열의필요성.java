package 정리;

import java.util.Scanner;

public class 배열의필요성 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID입력 >> ");
		String newID = sc.next();

		String id1 = "person1";
		String pw1 = "person1";
		
		String id2 = "person2";
		String pw2 = "person2";
		
		String id3 = "person3";
		String pw3 = "person3";

		if(newID.equals(id1)||newID.equals(id2)||newID.equals(id3)) {
			System.out.println("중복된 아이디입니다. 다른 아이디로 입력해주세요");
		}else{
			System.out.println("가입할 수 있는 아이디입니다.");
		}
		
		// 3명의 아이디는 하나하나 적어줄 수 있지만
		// 500명이라면? 어떻게 적을건가
		// 이때 배열이 있으면 쓰기 편할 것
		
	}

}
