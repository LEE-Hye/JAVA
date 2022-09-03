package OOP;

public class Phone {
	// 클래스 만들 때 -> 추상화와 캡슐화를 사용해서 만들 수 있었다
	// 클래스 -> 사용자 임의의 자료형
	
	// 전화번호
	String number;
	// 기종
	String kind;
	// 게임을 하다 --> 기능(메소드)
	public void playGame() {
		System.out.println("게임을 하다");
	}
	// 지도를 보다
	public void map() {
		System.out.println("지도를 보다");
	}
}
