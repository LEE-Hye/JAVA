
public class ex10_메소드오버로딩 {

	public static void main(String[] args) {
		
		add(5,10);
		add1(2,1.5);
		add2(5,1.5,1);

	}


	// 메소드 오버로딩? ==> 중복정의
	// => 같은 메소드 이름으로 매개변수를 다르게 해줌으로써
	// 다른 기능을 할 수 있게 만드는 것
	// 메소드 이름의 낭비방지
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void add1(int a, double b) {
		System.out.println(a + b);
		
	}

	private static void add2(int a, double b, int c) {
		System.out.println(a + b + c);
		
	}
}
