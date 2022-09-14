package 상속_정리;

public class Sub extends Super {

	public Sub() { // 생성자 메소드
		super(); // <- 상위 클래스의 생성자 호출하는 명령어, 상위 클래스에 매개변수 없으면 생략 가능
		// super()는 반드시 생성자에서만 호출 가능
		// super()는 반드시 맨 첫줄에만 사용 가능
		// 상위 클래스의 생성자에 매개변수가 없으면 super() 생략 가능
		
		System.out.println("Sub 생성자 실행");
//		super(); 불가
	}
	
//	public Sub(String str) {
//		super(str);
//	} => 상위 클래스에 매개변수가 있으면 반드시 호출해줘야 함
	
	public void waffle() {
		System.out.println("와플 레시피");
//		super(); 불가
	}
	
	public void coffee() {
		// 오버라이딩 한 메소드다
		System.out.println("환상의 커피 레시피");
	} 
	
}
