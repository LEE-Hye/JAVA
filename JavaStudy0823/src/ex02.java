
public class ex02 {

	public static void main(String[] args) {
		
		// 변수 --> 변할 수 있는 값
		System.out.println(5);
	
		// int a = 5; 변수는 선언과 초기화를 한번에 사용할 수 있다!
		int a; // 변수 선언!
		a = 5; // 변수 초기화!
		System.out.println(a+1); // 6
		System.out.println("6");
		
		String b = "6";
		System.out.println(a+b);
		
		int number = 30;
		// 변수명 규칙
		// 1. 특수 기호 사용 불가(! ? #) 예외 : _
		// 2. 키워드 사용 불가
		// 3. 띄어쓰기 불가
		// 4. 숫자로 시작 불가
		
		char c1 = 98;
		System.out.println(c1);
	}

}
