
public class ex00_설명 {
	public static void main(String[] args) {

		// 회사
		sum(5, 10);

		System.out.println(5 + 10 + 2);
		System.out.println(54 + 110 + 2);
		System.out.println(58 + 10 + 2);
		System.out.println(5 + 15 + 2);
		System.out.println(71 + 1052 + 2);
	}

	// 메소드의 구조
	// 접근 제한자 : public - 어떤 클래스에서도 접근 가능한 제한자
	// static : 저장 공간
	// 리턴 타입 : return 키워드 꼭 사용하기 (리턴타입x : void)
	// 메소드 이름(매개변수)

	// 메소드 필요성
	// - 반복적으로 사용되는 코드를 줄이기 위해 ㄴ: 보다 효율적이고, 보다 직관적인 코드
	// - 유지,보수가 쉽다 : 큰 규모의 프로그램에서 발생하는 문제들을 질서정연하게 해결할 수 있다.

	public static void sum(int a, int b) {

		int result = a + b + 2;
		System.out.println(result);
	}
}
