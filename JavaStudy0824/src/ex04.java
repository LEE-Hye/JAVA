
public class ex04 {

	public static void main(String[] args) {
		
		// 1. 복합 대입 연산자!! (+= , -=)
		
		int num1 = 10;
		int num2 = 30;
		
		num1 = num2 + 1; // num1 -> 31
		
		int num3 = 50;
		// num3에 num2를 더한 값을 담아주세요! -> 80
		// num3 = num3+num2;
		num3 += num2; // 복합 대입 연산자(바로 위 연산이랑 같은 의미임)
		System.out.println(num3);
		
		
		int num = 29;
		
		num -= 2 + 3 * 4;
		// num = num - (2 + 3 * 4);
		System.out.println(num);

		
		// 2. 증감 연산자! (++ , --)
		int num4 = 100;
		num4--; // num4 = num4 - 1; => 후위 연산자 :  한 줄이 끝났을 때 연산해 주세요 
		System.out.println(++num4); // => 전위 연산자 : 한 줄이 시작했을 때 연산하고 다음 꺼 실행해 주세요
	
		
		// 3. 삼항 연산자! : 항이 3개! -> 조건 항 ? 참 항 : 거짓 항
		System.out.println(10 < 5 ? "0" : "X");
	}

}
