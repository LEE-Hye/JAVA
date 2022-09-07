package 상속_업캐스팅활용;

public class Main {

	public static void main(String[] args) {

		// 목표 - 업캐스팅을 사용하면 왜 좋은지 체감해보자!
		// 인형뽑기 기계
		// 기계 - Main 클래스 내에 machine 메소드로 구현!(원래는 클래스로 설계해야 함)
		// 인형들 - 각각의 클래스로 구현
		
		machine(new Pika());
		machine(new Kko());
		machine(new Pari());
		machine(new Maza());
	}

	
	// static 을 붙이는 이유가 메인에서 다이렉트로 호출할것이기 때문이다.
	//		-> 메인에 5줄 static 공간이 할당 되어 있기 때문이다.
	
	// machine의 매개변수는 인형이다!
	public static void machine(Pockemon doll) {
		
		doll.pick();
		// 오버라이딩이란?
		// 상속 관계에서 상위클래스에 설계된 메소드를 하위클래스에서 재정의
		//	=> 업캐스팅된 상태에서 오버라이딩한 메소드를 호출하면 하위클래스의 메소드가 실행된다!
		
		
		
//		if(doll instanceof Pika) { // doll이 원래 Pika 타입이였다면
//			((Pika)doll).pick();	// 아무때나 Pika로 바꾸면 안되겠다..			
//		}else if(doll instanceof Pari) {
//			((Pari)doll).pick();
//		}else if(doll instanceof Kko) {
//			((Kko)doll).pick();
//		}
	}
	// 1. 오버로딩 : 메소드 이름은 같고 매개 변수 이름을 다르게 해준 것 -> 500개면 500번 다 써야해서 완전한 해결방안이 아님
	// 2. 업캐스팅 : 상위 클래스인 pockemon에는 pick()이란애가 없음 -> 완전한 해결방안이 아님
	// 3. 다운캐스팅 : 다운 캐스팅으로 원래 있던 기능 클래스로 내려준다 -> 이것도 완전한 해결방안이 아님
	// 4. 오버라이딩을 사용하면 된다.
}
