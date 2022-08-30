package for문_예제;

public class ex03 {

	public static void main(String[] args) {
		
		// 방법1. 구구단 2단 ~ 9단까지 출력하세요
		// 이중 for문 --> for문 안에 실행 문장으로 다른 for문이 존재하는 것
		// 코드는 위에서 아래로!,  for문에 대한 실행구조
		System.out.println("방법 1");
		for(int i = 2; i < 10; i++) {
			System.out.println("==" + i + "단==");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		// 방법 2. 
		System.out.println("방법 2");
		for(int i = 2; i < 10; i++) {
			System.out.print("<" + i + "단> :  ");
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t  ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 방법 3.
		System.out.println("방법 3");
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + i*j + "\t\t");
			}
			System.out.println();
		}
		
	}

}
