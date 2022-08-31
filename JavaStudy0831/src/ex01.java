
public class ex01 {

	public static void main(String[] args) {
		
		// 배열 : 여러개의 데이터(같은 타입)를 하나로 묶어서 관리하는 것!
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		// 배열 선언 1.
		// new : 만들겠다! 생성하겠다!
		// 타입[] 배열명 = new 타입[배열의 크기]
		int[] numArray = new int[4];
		// numArray[index]
		// index => 0부터 시작! ~ 배열의 크기 -1
		// JAVA에서의 배열은 크기가 고정적이다!!
		// 배열 선언한 타입만 데이터로 저장할 수 있다!
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		// numArray[4] = 50;
		
		// numArray를 이용해서 데이터 30을 출력하고 싶다 
		System.out.println(numArray[3]);
		
		
		// 배열 선언 2.
		// 배열의 크기랑 데이터를 한 번에 저장할 수 있다!
		int[] numArray2 = {50, 60, 70, 80};
		// numArray2를 이용해서 데이터 70을 출력하고 싶다
		System.out.println(numArray2[2]);
		
		System.out.println("모든 데이터 출력해주세요!");
		// numArray2에 있는 모든 데이터를 출력 시켜주세요!
		// 배열명.length ==> 배열의 크기를 의미
		for(int i = 0; i <= numArray2.length; i++) {
			System.out.print(numArray2[i]+ " ");
		}
		
		
		// String -> 문자열
		String name = "승환";
		
	}

}
