
public class ex04 {

	public static void main(String[] args) {
		
		// num 값의 일의 자리를 1로 바꿈
		int num = 777;
		System.out.println("결과확인 : " + num/10 + "1");
		
		// num1 값의 일의 자리를 0으로 바꿈
		int num1 = 456;
		System.out.println("결과확인 : " + num1/10+"0");
		
		// num2 값의 일의 자리만 출력 되게
		int num2 = 374;
		System.out.println("결과확인 : " + num2%10);
	}

}
