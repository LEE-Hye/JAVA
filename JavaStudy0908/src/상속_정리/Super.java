package 상속_정리;

public abstract class Super {
	
	public Super() {
		
		System.out.println("Super 생성자 호출");
	}
	
	// 추상 메소드를 하나 이상 포함하고 있는 클래스 => 추상 클래스
	public abstract void coffee();
	
	public void water() {
		System.out.println("본사에서 내려주는 물");
	}
}
