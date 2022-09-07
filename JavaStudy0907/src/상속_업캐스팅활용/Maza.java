package 상속_업캐스팅활용;

public class Maza extends Pockemon {

	@Override
	public void pick() {
		// 추상 클래스를 상속받은 하위클래스는 반드시 추상메소드를 오버라이딩 해야함
		// => 구현의 강제성
		System.out.println("마자용 뽑혔다!");

	}

}
