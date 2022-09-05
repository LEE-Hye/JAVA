import java.util.Scanner;

public class PiggyBank {

	   // 저금통 설계도

	   // Class(틀, 설계도) -> 설계만 하는 친구이므로 main메소드 생성X
	   // Object(결과물) -> 실제 결과물이므로 main메소드 생성

	   // Class의 구조
	   // 1. 필드 : 객체의 특성, 속성, 데이터적으로 정의할 수 있는 것
	   // 2. 메소드 : 객체의 기능, 행위

	   // 필드 : 현재자산 (돈)
	   int money;

	   // 메소드
	   // 1. 저금하는 메소드 (deposit)
	   // 사용자가 입금할 돈을 입력하면(input) 현재자산(돈)에 추가되는 기능
	   public void deposit(int input) {
		   // this : 자기 자신의 객체, 현재 실행되는 메소드가 속한 객체
		   // this.money = PiggyBank에 선언된 money(현재자산)
	      this.money += money;
	   }

	   // 2. 출금하는 메소드 (withdraw)
	   // 사용자가 출금할 돈을 입력하면(out) 현재자산(돈)에서 출금되는 기능
	   public void withdraw(int money) {
	      this.money -= money;
	   }

	   // 3. 잔액을 보여주는 메소드 (showMoney)
	   // 사용자의 현재자산(돈)을 보여주는 기능
	   public void showMoney() {
	      System.out.println("현재 잔액 : " + money + "원");
	   }   
	
}
// static 안 적는 이유가 같은 파일 내에 메인 메소드가 같이 없어서