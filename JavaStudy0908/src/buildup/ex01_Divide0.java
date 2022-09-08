package buildup;

public class ex01_Divide0 {

	public static void main(String[] args) {
		
		// 자바의 오류
		// 1. 컴파일 오류 : 문법적인 오류
		System.out.println("출력문");
		
		// 2. 런타임 오류 : 문법적인 오류는 아니지만 실행 시 나타나는 오류
		// try : 예외 처리를 진행해주는 문법
		// catch : 예외가 발생했을 때 catch문으로 오류를 잡아주는 역할
		
		try {
			
		System.out.println(100/0);
		}catch(ArithmeticException e){
			System.out.println("문법적 오류가 났습니다!");
		}

		System.out.println("다음 코드");
	}

}
