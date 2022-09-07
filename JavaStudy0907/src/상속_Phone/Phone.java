package 상속_Phone;

public class Phone {

	// 기능은 메소드로
	// 파라미터 = 매개변수 = 메소드가 동작하기 위해 필요한 데이터
	//	-> 호출할 때 넣어 줌
	// call은 ()에 아무것도 없어 매개변수도 없음
	public void call() {
		System.out.println("전화걸기");
	}

	public void send() {
		System.out.println("전화받기");
	}
	
	public void sms() {
		System.out.println("문자가능");
	}

}
