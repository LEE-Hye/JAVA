package 상속_업캐스팅활용;

public abstract class Pockemon{
	// - 추상 메소드를 하나 이상 포함하고 있는 클래스는 추상클래스
	// => abstract 키워드 달아줘야 함
	
	// 모든 Pockemon들은 pick 메소드가 있어야 함
	// 하지만 정확히 어떻게 동작할 것인지는 하위 클래스가 결정한다!
	// => 무조건 오버라이딩 한다
	// => 상위 클래스는 좀 더 추상적이여도 된다. 
	
//	public void pick() {
//		System.out.println("상위 클래스인 여기보다 하위 클래스인 Pari얘네가 더 구체화 돼서 하위클래스에 있는게 불러와짐")
//	}
	// 더 추상적이게 하기 위해서 12~14줄을 추상메소드를 사용한다.
	
	public abstract void pick(); // 추상메소드 - 몸체{}가 없는 메소드

	
}
