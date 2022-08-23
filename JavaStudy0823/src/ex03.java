
public class ex03 {

	public static void main(String[] args) {
		// num1, num2 변수를 만든 뒤
		// num1 -> 10, num2 -> 3
		// 더한 결과 :
		// 뺀 결과 :
		// 곱한 결과 :
		int num1 = 10;
		int num2 = 3;
		
		// 각각의 연산자마다 우선 순위가 있다
		// 수학과 동일
		System.out.println("더한 결과 : " + (num1 + num2));
		// 문자열 - 숫자는 JAVA에서 허용하지 않는다.
		System.out.println("뺀 결과 : " + (num1 - num2));
		System.out.println("곱한 결과 : " + (num1 * num2));
		// 나눈 몫 결과
		// 나머지 결과
		// (변형시킬 자료형) 변수명 --> 변수를 강제로 형변환시키겠습니다.
		System.out.println("나눈 몫 결과 : " + ((float)num1/num2));
		System.out.println("나머지 결과 : " + (num1%num2));
		
		int  number1 = 10;
		String number2 = "3"; // String -> reference 타입
		// "abc" --> 'a', 'b', 'c'
		// 13 출력하고 싶어!
		// String -> int : Integer.parseInt('바꾸고 싶은 문자열');
		System.out.println(number1 + Integer.parseInt(number2));
	}

}
