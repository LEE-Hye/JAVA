
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
		// 5. 같은 변수명은 한 번만 선언할 수 있음
		int data = 10; // data 30을 담고 싶으면
		// data = 30; // 이라 적어줘야 함
		
		char c1 = 65; // 아스키 코드
		System.out.println(c1);
		
		long num = 999999999;
		
		// 소수 값을 저장할 수 있는 키워드 : float, double
		int num4 = 30;
		float num2 = 10.5f;
		System.out.println(num2);
		// 데이터 연산을 했을 때 --> 더 큰 자료형 타입으로 형변환 된다.
		System.out.println(num2+num4);
		
		double num3 = 10.5;
		System.out.println(num3);
	
		
		int myNum = 50;
	}

}
